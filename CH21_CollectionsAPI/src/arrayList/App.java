package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// 가장많이 쓰는 자료 컬렉션 타입 //int는 클래스 타입이 아님 (int의 클래스 타입)인 integer를 넣는다
		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(9);
		list.add(11);
		list.add(123);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

	}

}
