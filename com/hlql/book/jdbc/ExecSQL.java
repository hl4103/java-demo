package com.hlql.book.jdbc;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExecSQL {

	public static void main(String[] args) throws IOException {
		try {
			Scanner in = args.length == 0 ? new Scanner(System.in) : new Scanner(Paths.get(args[0]));
			try (Connection conn = getConnection()) {
				Statement stat = conn.createStatement();
				while (true) {
					if (args.length == 0) {
						System.out.println("Enter command or EXIT to exit:");
					}

					if (!in.hasNextLine())
						return;

					String line = in.nextLine();
					if (line.equalsIgnoreCase("EXIT"))
						return;
					if (line.trim().endsWith(";")) {
						line = line.trim();
						line = line.substring(0, line.length() - 1);
					}
					try {
						boolean isResult = stat.execute(line);
						if (isResult) {
							ResultSet rs = stat.getResultSet();
							showResultSet(rs);
						} else {
							int updateCount = stat.getUpdateCount();
							System.out.println(updateCount + " rows updated");
						}
					} catch (SQLException ex) {
						for (Throwable e : ex)
							e.printStackTrace();
					}
				}
			}
		} catch (SQLException e) {
			for (Throwable t : e)
				t.printStackTrace();
		}
	}

	/**
	 * 展示数据
	 * 
	 * @param result
	 * @throws SQLException
	 */
	public static void showResultSet(ResultSet result) throws SQLException {
		ResultSetMetaData metaData = result.getMetaData();
		int columnCount = metaData.getColumnCount();
		// 展示表头
		for (int i = 1; i < columnCount; i++) {
			if (i > 1)
				System.out.print(", ");
			System.out.print(metaData.getColumnLabel(i));
		}
		System.out.println();
		// 展示数据
		while (result.next()) {
			for (int i = 1; i < columnCount; i++) {
				if (i > 1)
					System.out.print(", ");
				System.out.print(result.getString(i));
			}
			System.out.println();
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
		String url = "jdbc:mysql://localhost:3306/wq_20160425";
		String userName = "root";
		String password = "59f184d7bb";
		return DriverManager.getConnection(url, userName, password);
	}

}
