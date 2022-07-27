package application;

public class App {

	public static void main(String[] args) {
		// 스태틱(클래스) 상수는 객체생성없이 클래스.상수
		System.out.println(Cat.Food);
		System.out.println(Cat.getCount());
		// 스태틱 변수

		// 수학공식
		System.out.println(Math.PI);

		// 객체만들기전엔get사용못함
		// System.out.println(cat1.getName());

		Cat cat1 = new Cat("마틸다"); // count+1
		System.out.println(Cat.getCount());
		Cat cat2 = new Cat("라이언"); // count+1
		System.out.println(Cat.getCount());
		Cat cat3 = new Cat("우러린"); // count+1

		System.out.println(cat1.getName());

		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		System.out.println(Cat.getCount());
		// 카운트 공유되고 수정같이 할 수 있음

		// App app = new App();
		// app.sayHi();
		// 같은곳안에 있어서 생략가능
		sayHi();
		hello();

	}

	private static void sayHi() {
		System.out.println("안녕~!");

	}

	private static void hello() {
		System.out.println("헬로~!");

	}
}
