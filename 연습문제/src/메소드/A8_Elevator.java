package 메소드;

public class A8_Elevator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 생성
		int aa = 13;
		int ab = 7;
		int ac = 10;

		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", aa, guide(aa));
		System.out.printf("%d층 -> %s 엘레베이터\n", ab, guide(ab));
		System.out.printf("%d층 -> %s 엘레베이터\n", ac, guide(ac));
	}

	public static String guide(int a) {

		String 층 = (a <= 10) ? "저층" : "고층";
		return 층;

	}

}
