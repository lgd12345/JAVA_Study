package 조건문;

import java.util.Scanner;

public class If문 {

	public static void main(String[] args) {
		//
		Scanner scanner = new Scanner(System.in);
		System.out.print("사과의 갯수는 : ");
		int apples = scanner.nextInt();
		System.out.print("바나나 갯수는 : ");
		int bananas = scanner.nextInt();
		scanner.close();
//		int apples = 10;
//		int bananas = 5;

		//if (apples < bananas) {
		//	System.out.println("바나나가 사과보다 많음");
		//} 
		
//		if (apples > bananas) {
//			System.out.println("사과가 바나나보다 많음");
//		} else {
//			System.out.println("바나나가 사과보다 많음");
//		}
		
		if (apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		} else if (apples < bananas){
			System.out.println("바나나가 사과보다 많음");
		} else
			System.out.println("바나나와 사과의 갯수가 같음");

		System.out.println("프로그램 종료.");
	}

}
