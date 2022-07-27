package try_Catch;

import java.util.Scanner;

public class App2 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();
	}

	/**
	 * 스캐너로 숫자를 입력받아서 리턴함
	 * 
	 * @return 입력받은 정수
	 */
	private static int getNumber() {

		int number = 0;
		boolean isNumber = false;
		
		do {
			System.out.println("숫자를 입력 : ");
			String line = scanner.nextLine(); // 문자열 입력 엔터키 전까지\n 문자열을 입력받는다. (nextLine)

			try {
				number = Integer.parseInt(line); // 숫자를 문자열로 변환 ! 만약 문자를 입력한다면 여기서 오류가남
				isNumber = true; // 숫자가 맞음

			} catch (NumberFormatException e) {
				// 숫자 변환!! 예외 발생시 캐치문 실행
				System.out.println("숫자변환오류 => 숫자를 입력하세요");// 어떤 예외인지 알려줌
			}
		} while (!isNumber);

		return number;
	}

}
