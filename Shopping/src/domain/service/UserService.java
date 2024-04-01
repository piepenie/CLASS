package domain.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import domain.User2;

public class UserService {
	private Connection conn;

	public int insertUser(User2 user) throws SQLException {
		conn = new DBConn().getConn();
		
		PreparedStatement pstmt = conn.prepareStatement("INSERT INTO USER VALUES (?, ?, ?, ?, ?, ?)");
		pstmt.setString(1, user.getUser_id());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getPhone_number());
		pstmt.setString(5, user.getEmail());
		pstmt.setString(6, user.getMember());


		int result = pstmt.executeUpdate();
		
		if (result > 0) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
		
		pstmt.close();
		conn.close();
		
		return result;
	}
}
