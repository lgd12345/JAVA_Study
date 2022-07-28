package instanceOf;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID = 1L;	
}

class Cat extends Creature {
	private static final long serialVersionUID = 1L;	
}

public class App {

	public static void main(String[] args) {

		Creature c1 = new Creature();
		Object c2 = c1; //Object는 모든객체 가능
		Cat c3 = new Cat();
		Serializable c4 = (Serializable)c3;
		
		// a instanceOf b는 a가 b의 객체가 맞으면 true 아니면 false		
		System.out.println(c2 instanceof Object);
		System.out.println(c2 instanceof Serializable);
		System.out.println(c2 instanceof Creature);
		System.out.println(c4 instanceof Cat); // c1,c2에서 creature가 cat보다 상위니까 객체 아님
		//c2는 c1과 동일한 값이나옴

		
		
	}

}
