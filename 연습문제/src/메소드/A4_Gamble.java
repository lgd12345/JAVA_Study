package 메소드;

public class A4_Gamble {

	public static void main(String[] args) {
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득금액: $%.2f(%.0f원)", dollar, won);

	}

	private static int dice() {
		int rand = (int) (Math.random() * 6) + 1;
		return rand;

	}

	private static double exchange(double dollar) {
		return dollar * 1082.25108;
	}

}
