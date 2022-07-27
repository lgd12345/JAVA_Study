package application;

public class 문자열배열 {

	public static void main(String[] args) {
		//
		String[] animals = { "고양이", "개", "펭귄", "사자" };

		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		// System.out.println(animals[4]);

		// 배열에 있는 값을 바꾸는 방법
		animals[0] = "닭";
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);

	}

}
