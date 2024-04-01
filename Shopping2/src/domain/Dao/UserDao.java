package domain.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Dto.UserDto;

public class UserDao {
	private String url;
	private String id;
	private String pw;
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	public UserDao() throws Exception {
		Class.forName("");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("[DAO] UserDao's INIT DB Connected...");
	}
	
	//INSERT 
	public boolean Insert(UserDto dto) throws Exception{
		pstmt = conn.prepareStatement("insert into user values(?,?,?,?,?,?)");
		pstmt.setString(1, dto.getUser_id());
		pstmt.setString(2, dto.getPassword());
		pstmt.setString(3, dto.getName());
		pstmt.setString(4, dto.getPhone_number());
		pstmt.setString(5, dto.getEmail());
		pstmt.setString(6, dto.getRole());
		
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		
		return result >0;
	}
	
	

}
