package 스캐너문제;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 스캐너사용중 nextInt다음에 nextLine 사용시
		Scanner scanner = new Scanner(System.in);

		int num;
		String str;
		System.out.println("num 입력 = ");
		num = scanner.nextInt(); // 10입력 /enter키가 남아 있고 10만 가져감
		scanner.nextLine(); //여기서 줄 바꿈 문자열 제거 
		
		System.out.println("str 입력 = ");
		str = scanner.nextLine(); // 숫자입력시 엔터는
		// 제외하고 앞의 숫자만 가져가서 남은 엔터때문이다.

		System.out.println();
		System.out.println("num : " + num);
		System.out.println("str : " + str);
		scanner.close();

	}

}
