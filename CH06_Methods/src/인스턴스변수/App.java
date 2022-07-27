package 인스턴스변수;



public class App {

	public static void main(String[] args) {
		//같은 Package 안에 있는 클래스는 바로 불러오기 가능하다.
		// App에는 main이 있다 Person에는메인이 없다.
		// 실제 객체 생성은 두번되었다.
		Person p1 = new Person();
		p1.name = "펭수";
		p1.age = 7;
		Person p2 = new Person();
		p2.name = "길동";
		p2.age = 17;
		//p1,p2주소 다름 
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
	
	}

}
