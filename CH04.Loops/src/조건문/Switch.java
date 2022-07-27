package 조건문;

public class Switch {

	public static void main(String[] args) {
		// switch 문
		
		int option = 10;
		
		switch(option) {
		case 0:
			System.out.println("옵션 0 선택");
			break;
		case 1:
			System.out.println("옵션 1 선택");
			break;
		case 10:
			System.out.println("프로그램 종료...");
			break;
		default :
			System.out.println("잘못된 옵션번호.");
			break;
		}

	}

}
