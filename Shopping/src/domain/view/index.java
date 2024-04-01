package domain.view;

import java.sql.SQLException;
import java.util.Scanner;

import domain.User2;
import domain.service.UserService;

public class index {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		String id ;
		String pw, name, phone, email;
		User2 user;
		UserService service = new UserService();
		
		while(true) {
			System.out.print("ID(-1 종료): ");
			id = sc.next();
			
			if (id.equals("-1")) break;
			
			System.out.print("PW: ");
			pw = sc.next();
			System.out.print("name: ");
			name = sc.next();
			System.out.print("phone: ");
			phone = sc.next();
			System.out.print("email: ");
			email = sc.next();
			
			
			
			user = new User2(id, pw, name, phone, email, "USER");
			service.insertUser(user);
		}
		
		System.out.println("종료");
	}
}
