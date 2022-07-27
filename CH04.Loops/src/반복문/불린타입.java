package 반복문;

public class 불린타입 {

	public static void main(String[] args) {
		// 불린타입 참, 거짓 (true,false)
		boolean condition1 = false;
		System.out.println("조건1: " + condition1);

		// 비교 결과가 참
		boolean condition2 = 4 < 5;
		System.out.println("조건2: " + condition2);

		// 비교 결과가 거짓
		boolean condition3 = 2 > 8;
		System.out.println("조건3: " + condition3);

		// 비교 == 같다, != 같지않다, >= , <=
		boolean condition4 = 9 == 10;
		System.out.println("조건4: " + condition4);
		System.out.printf("조건4: %b", condition4);

	}

}
