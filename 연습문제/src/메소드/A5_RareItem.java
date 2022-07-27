package 메소드;

public class A5_RareItem {

	public static void main(String[] args) {
		// 연습문제5
		wear(2400, 2000);
		wear(3800, 1200);

	}

	private static void wear(int h, int m) {

		if ((h >= 2000) && (m >= 2000)) {
			System.out.println("아이템 장착완료");
		} else {
			System.out.println("아이템을 착용할 수 없습니다.");
		}

	}

}
