package arrayList;

import java.util.ArrayList;

public class Iterating {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(9);
		list.add(11);
		list.add(123);

		for (Integer n : list) {
			System.out.println(n);
		}
		System.out.println();
		// size= 리스트 안에 개수, i인덱스 번호, n 해당 값
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);

			System.out.println(i + " : " + n);
		}
		System.out.println();
		//forEach메소드와 람다식을 이용한 방법
		list.forEach(n -> System.out.println(n));

	}

}
