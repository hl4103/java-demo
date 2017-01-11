package com.hlql.book.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

/**
 * 
 * @author tom
 *
 */
public class Demo {

	public static void main(String[] args) throws SQLException, IOException {
		try {
			runTest();
		} catch (SQLException ex) {
			for (Throwable t : ex)
				t.printStackTrace();
		}
	}

	public static void runTest() throws SQLException, IOException {
		try (Connection conn = getConnection()) {
			Statement stat = (Statement) conn.createStatement();
			String sql = "select * from wq_agency where is_disabled = 0";
			// stat.executeUpdate(sql);
			try (ResultSet result = stat.executeQuery(sql)) {
				while (result.next()) {
					System.out.println(result.getString("title"));
				}
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
		String url = "jdbc:mysql://localhost:3306/wq_20160425";
		String userName = "root";
		String password = "59f184d7bb";
		return DriverManager.getConnection(url, userName, password);
	}
}
