package domain.view;

import java.util.Scanner;

import domain.Dao.*;
import domain.Dto.UserDto;

public class index {

	public static void main(String[] args) throws Exception{
		@SuppressWarnings("resource") // 리소스 관련 경고 무시 어노테이션
		UserDao userDao = new UserDao();
		Scanner sc = new Scanner(System.in);
		int id;
		int select;
		
		String user_id;
		String password;
		String name;
		String phone_number;
		String email;
		String role;
		while(true) {
			System.out.println("1 입력시 회원가입");
			System.out.println("2 입력시 회원조회");
			System.out.println("3 입력시 회원업데이트");
			System.out.println("4 입력시 회원삭제");
			System.out.println("-1 입력시 종료");
			select = sc.nextInt();
			
			if(select == -1) break;
			if(select == 1) {
				while(true) {
					System.out.println("(-1 이전페이지)");
					System.out.println("ID : ");
					id = sc.nextInt();
					if(id == -1) break;
					System.out.println("user_id : ");
					user_id = sc.next();
					System.out.println("PW : ");
					password = sc.next();
					System.out.println("name : ");
					name = sc.next();
					System.out.println("phone_number : ");
					phone_number = sc.next();
					System.out.println("email : ");
					email = sc.next();
					System.out.println("role : ");
					role = sc.next();
					
					userDao.Insert(new UserDto(id,user_id,password,name,phone_number,email,"USER"));
					} 
				}
			}
			if(select ==3) {
				while(true) {
					
				}
			}
		
	

	}

}
