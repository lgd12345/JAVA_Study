package 조건문;

import java.util.Scanner;

public class 변수범위 {

	public static void main(String[] args) {
		// 변수의 범위는 코드블록{} 으로 결정
		{
			int value = 0;
			System.out.println(value);
		}

		// Error - out of scope!
		// System.out.println(value); 지역변수라서 쓸 수 없다.

		//Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		// for문 안에서 쓰인 변수 i는 밖에서 쓸 수 없음 (지역변수)
		//System.out.println(i);
		
		// 전역변수 밖에 만들어서 상용가능함
		Scanner scanner = new Scanner(System.in);
		String input = ""; 

		do {
			System.out.println("종료할려면 'quit'를 입력하세요");
			input = scanner.nextLine();
	
		} while (!input.equals("quit"));

		scanner.close();

	}

}
