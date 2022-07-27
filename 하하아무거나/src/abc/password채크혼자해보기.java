package abc;

import java.util.Scanner;

public class password채크혼자해보기 {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 접속승인출력하고 반복문을 빠져나옴
		// 패스워드가 3회 틀릴 시 접속거부
		// 새로운 패스워드 입력
		final String USER_PASSWORD = "abcd";
		String password = "";
		boolean OK = true; //불린을 변수로 사용해 처리를 다르게 true 일 때 반복
	    Scanner scanner = new Scanner(System.in);
	  
	    
		for (int i = 1; i <= 3; i++) {
			System.out.println("비밀번호를 입력하세요 > ");
			password = scanner.nextLine();
			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				OK = false; //불린을 변수로 사용해 처리를 다르게 false일때 멈춤
				break;
			}
		}
		if (OK) {
			System.out.println("접속거부");
			System.out.println("비밀번호를 변경하세요");
			Scanner scanner2 = new Scanner(System.in);
			boolean OO = true;
			
			String password2 = "";
			password2 = scanner2.nextLine();
			System.out.printf("비밀번호가 %s로 변경되었습니다.%n",password2);
			if(OO) {
				System.out.println("다시 접속을 시도하세요");
			}
			
			scanner2.close();
		}
		
		
		scanner.close();

	}

}
