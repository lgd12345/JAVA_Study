package 메소드;

public class A2_Pork {

	public static void main(String[] args) {
		// 연습문제2-2
		int n = 3;
		double result = r1(n);
		
		System.out.printf("삼겹살 %d인분: %.2f kcal", n, result);

	}

	private static double r1(int 인분) {
		return 인분 * 180 * 5.179;

	}

}
