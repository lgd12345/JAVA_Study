package 반복문;

public class for반복문 {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감){ 명령문; }

		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}

		// 예제, for 1에서 100까지 합을 출력하라
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int sss = 0;
		for (int i = 0; i <= 100; i++) {
			sss = sss - i;
		}
		System.out.println(sss);
		
		
	}

}
