package 고양이에게ID만들기;

public class App {

	public static void main(String[] args) {
		// 스태틱(클래스) 상수는 객체생성없이 클래스.상수
		System.out.println(Cat.Food);
		System.out.println(Cat.getCount());
		// 스태틱 변수

		// 객체만들기전엔get사용못함
		// System.out.println(cat1.getName());

		Cat cat1 = new Cat("마틸다"); // count+1
		System.out.println(Cat.getCount());
		Cat cat2 = new Cat("라이언"); // count+1
		System.out.println(Cat.getCount());
		Cat cat3 = new Cat("우우린"); // count+1

		System.out.println(cat1.getName());

		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		System.out.println(Cat.getCount());
		System.out.println(cat1.getId());
		// 카운트 공유되고 수정같이 할 수 있음


	}
}
