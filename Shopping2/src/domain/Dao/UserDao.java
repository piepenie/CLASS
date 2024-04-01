package domain.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Dto.UserDto;

public class UserDao {
	private String url;
	private String id;
	private String pw;
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	public UserDao() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("[DAO] UserDao's INIT DB Connected...");
	}
	
	//INSERT 
	public boolean Insert(UserDto userDto) throws SQLException{
		pstmt = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		pstmt.setInt(1, userDto.getId());
		pstmt.setString(2, userDto.getUser_id());
		pstmt.setString(3, userDto.getPassword());
		pstmt.setString(4, userDto.getName());
		pstmt.setString(5, userDto.getPhone_number());
		pstmt.setString(6, userDto.getEmail());
		pstmt.setString(7, userDto.getRole());
		
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
		return result>0;
	}
	
	//UPDATE
	public boolean Update(UserDto userDto) throws SQLException{
		pstmt = conn.prepareStatement("update user set ");
		pstmt.setInt(1, userDto.getId());
		pstmt.setString(2, userDto.getUser_id());
		pstmt.setString(3, userDto.getPassword());
		pstmt.setString(4, userDto.getName());
		pstmt.setString(5, userDto.getPhone_number());
		pstmt.setString(6, userDto.getEmail());
		pstmt.setString(7, userDto.getRole());
		
		int result = pstmt.executeUpdate();
		
		
		pstmt.close();
		conn.close();
		
		return result>0;
		
	}
	
	

}
