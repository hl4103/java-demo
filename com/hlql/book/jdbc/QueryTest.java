package com.hlql.book.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryTest {

	private static final String allQuery = "select * from wq_visit";
	private static final String branchQuery = "select * from wq_visit where branch_no = ?";
	private static final String branchUpdate = "update wq_visit set branch_no = ? where branch_no = ?";

	private static Scanner in;
	private static Connection conn;

	private static ArrayList<String> branchNos = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		try {
			conn = getConnection();
			in = new Scanner(System.in);
			branchNos.add("Any");
			try (Statement stat = conn.createStatement()) {
				String sql = "select * from wq_visit";
				try (ResultSet rs = stat.executeQuery(sql)) {
					while (rs.next()) {
						branchNos.add(rs.getString(2));
					}
				}
			}
			boolean done = false;
			while (!done) {
				System.out.print("Q)uery C)hange branch_no E)xit: ");
				String input = in.next().toUpperCase();
				if (input.equals("Q")) {
					executeQuery();
				} else if (input.equals("C")) {
					changeBranchNo();
				} else {
					done = true;
				}
			}

		} catch (SQLException e) {
			for (Throwable t : e)
				System.out.println(t.getMessage());
		}
	}

	/**
	 * 执行查询操作
	 * 
	 * @throws SQLException
	 */
	private static void executeQuery() throws SQLException {
		String branch_no = select("branchNos:", branchNos);
		PreparedStatement stat;
		if (!branch_no.equals("Any")) {
			stat = conn.prepareStatement(branchQuery);
			stat.setString(1, branch_no);
		} else {
			stat = conn.prepareStatement(allQuery);
		}
		try (ResultSet rs = stat.executeQuery()) {
			while (rs.next()) {
				// Blob coverBlob = rs.getBlob(1);
				// Image coverImage = ImageIO.read(coverBlob.getBinaryStream());
				System.out.println(rs.getString(1) + "," + rs.getString(2));
			}
		}
	}

	public static void changeBranchNo() throws SQLException {
		String branch_no = select("branchNos:", branchNos);
		System.out.println("Change Branch_no by: ");
		String branchNo = in.next();
		PreparedStatement stat = conn.prepareStatement(branchUpdate);
		stat.setString(1, branchNo + branch_no);
		stat.setString(2, branch_no);
		int r = stat.executeUpdate();
		System.out.println(r + " records updated");
	}

	/**
	 * 查询
	 * 
	 * @param prompt
	 * @param options
	 * @return
	 */
	public static String select(String prompt, List<String> options) {
		while (true) {
			System.out.println(prompt);
			// for (int i = 0; i < options.size(); i++) {
			// System.out.printf("%2d) %s%n", i + 1, options.get(i));
			// }
			int sel = in.nextInt();
			if (sel > 0 && sel <= options.size()) {
				return options.get(sel - 1);
			}
		}
	}

	/**
	 * 获取数据库连接
	 * 
	 * @return
	 * @throws IOException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws IOException, SQLException {
		// Properties props = new Properties();
		// try (InputStream in =
		// Files.newInputStream(Paths.get("database.properties"))) {
		// props.load(in);
		// }
		// String drivers = props.getProperty("jdbc.drivers");
		// if (drivers != null)
		// System.setProperty("jdbc.drivers", drivers);
		// String url = props.getProperty("jdbc.url");
		// String username = props.getProperty("jdbc.username");
		// String password = props.getProperty("jdbc.password");
		// return DriverManager.getConnection(url, username, password);
		String url = "jdbc:mysql://localhost:3306/wq_20150928";
		String userName = "root";
		String password = "59f184d7bb";
		return DriverManager.getConnection(url, userName, password);
	}
}
