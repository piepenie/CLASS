package domain.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private String id;
	private String pw;
	private String url;
	
	private Connection conn = null;
	
	public DBConn() {
		this.id = "root";
		this.pw = "1234";
		this.url = "jdbc:mysql://localhost:3306/testDB";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// 사용하는 DBMS마다 다르다
//			System.out.println("Driver Loading Success...");
						
			this.conn = DriverManager.getConnection(url, id, pw);
//			System.out.println("DB Connected....");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}
	
}
