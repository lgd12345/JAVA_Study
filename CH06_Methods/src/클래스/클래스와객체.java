package 클래스;

//한 자바 파일에 여러개의 클래스 생성 가능
//Person이라는 다른 클래스를 만들어줬다...
class Person {
	String name = "펭수";
	int num;
}

public class 클래스와객체 {

	public static void main(String[] args) {
		// 클래스는 설계도로 실제 사용가능한 객체를 생성한다.(메모리에 생성)
		Person p1 = new Person(); // new 클래스이름의 생성자를 이용해 new Person이라는 객채생성
		System.out.println(p1.name); // 주소는 p1에 들어감
		System.out.println(p1.num); // 디폴트값이 0
		p1.name = "헹수";
		System.out.println(p1.name);
		//참조변수
		Person p2;
		Person p3;
		p2 = p1;
		p3 = p2;
		System.out.println(p2.name);
		System.out.println(p3.name);
		//가리키는 게 똑같아서 p2 p1도 777
		p3.num = 777;
		System.out.println(p1.num);
		System.out.println(p2.num);
		//같은 객체를 가지고 있기 때문에
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		//새롭게 p2의 객체를 만들면 초기값 펭수가 됨
		p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2);//주소도 달라짐

	}
	
}
