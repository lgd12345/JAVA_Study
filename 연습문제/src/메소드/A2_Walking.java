package 메소드;

public class A2_Walking {

	public static void main(String[] args) {
		// 연습문제2
		
		double result = kcal1(5000);
		
		System.out.println("소모칼로리: " + result + " kcal");
		
	}

	private static double kcal1(int walk) {
		return walk * 0.02;
	
	};
}
