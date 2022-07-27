package 반복문;

import java.util.Scanner;

public class 패스워드채크 {

	public static void main(String[] args) {
		// 유저가 입력한 패스워드 비교
		final String USER_PASSWORD = "hello";
		Scanner scanner = new Scanner(System.in);
		String password = "";

		do {
			System.out.print("비밀번호 입력 > ");
			password = scanner.nextLine();
		} while (!password.equals(USER_PASSWORD)); //같지 않을 때 => true 반복 (equals문자열비교)
		
		 System.out.println("접속승인!");
		 scanner.close();//스캐너 종료

	}
}
