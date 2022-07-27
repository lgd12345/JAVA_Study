package 조건문;

public class Final {

	public static void main(String[] args) {
		// final 붙은 변수 => 상수
		final int VALUES = 9; // 상수는 전체문자를 대문자로
		// VALUES = 99; 수정불가
		System.out.println(VALUES);

		final String USER_PASSWORD = "abc";
		//USER_PASSWORD ="ABCDERGH";//수정불가
		System.out.println(USER_PASSWORD);

	}

}
