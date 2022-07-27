package 메소드;

public class App {

	public static void main(String[] args) {
		// 같은 Package 안에 있는 클래스는 바로 불러오기 가능하다.

		Person p1 = new Person();
		p1.name = "길동";
		p1.age = 5;
		
		Person p2 = new Person();
		p2.name = "펭수";
		p2.age = 2;
		
		//new가 메모장을 클릭하는 개념이다.
		Person p3 = new Person();
		p3.name = "허허";
		p3.age = 16;
		
		//위에 new를 만들어야 불러오기가 가능함
		p1.sayHello();
		p2.sayHello();
		p3.sayHello();
	

	}

}
