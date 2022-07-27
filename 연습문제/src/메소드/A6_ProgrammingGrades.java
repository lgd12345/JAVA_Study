package 메소드;

public class A6_ProgrammingGrades {

	public static void main(String[] args) {
		// 연습문제6
		int score1 = 96;
		int score2 = 85;
		int score3 = 76;

		System.out.printf("%d점 -> %s\n", score1, grade(score1));
		System.out.printf("%d점 -> %s\n", score2, grade(score2));
		System.out.printf("%d점 -> %s\n", score3, grade(score3));
	}

	private static String grade(int score) {
		String 정수 = "";

		if (score >= 95) {
			정수 = "A+";
		} else if (score >= 90) {
			정수 = "A0";
		} else if (score >= 80) {
			정수 = "B+";
		} else if (score >= 70) {
			정수 = "B0";
		} else {
			정수 = "C+";
		}

		return 정수;

	}
}
