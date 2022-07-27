package application;

import ebtities.Apple;
import ebtities.Banana;
import ebtities.Fruit;

public class App {

	public static void main(String[] args) {
		Fruit f1 = new Apple(); //불러오기해야함
		//f1.id = 10; 패키지도 다르고 자식클래스도 아님
		
		 System.out.println(f1);
		 
		 Fruit f2 = new Banana();
		 System.out.println(f2);
	}

}
