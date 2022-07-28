package application;

import 계층.Cat;
import 컬렉션.Pair;

public class App2 {

	public static void main(String[] args) {
		Pair<Integer, Cat> pair = new Pair<Integer, Cat>(5, new Cat("마틸다"));
		

		 System.out.println(pair);
		 System.out.println(pair.getOne());
		 System.out.println(pair.getTwo());
	}

}
