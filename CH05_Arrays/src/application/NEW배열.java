package application;

import java.util.Scanner;

public class NEW배열 {

	public static void main(String[] args) {
		// new 키워드로 배열 생성
		// int[] numbers = {}; 초기값을 바로 넣는 방법
		int[] numbers = new int[3]; // int형 3개의 아이템 //int값을 안넣어서 디폴트값0
		// final int NUM = 3;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자를 입력: ");
			numbers[i] = scanner.nextInt();
		}

		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			total = total + numbers[i];
		}
		System.out.println("합계 : " + total);
		scanner.close();
	}

}
