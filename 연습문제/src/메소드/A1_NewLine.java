package 메소드;

public class A1_NewLine {

	public static void main(String[] args) {
		// 연습문제1 메소드 밑으로 계속 분리해서 사용
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");

	}

	private static void threeLines() {

		oneLine();
		oneLine();
		oneLine();

	}

	private static void oneLine() {
		System.out.println(">");

	}

}
