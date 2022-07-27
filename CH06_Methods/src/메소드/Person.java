package 메소드;

public class Person {
	//클래서 안에 만든 변수를 인스턴스(필드)변수 => 객체 생성시 생성됨
	String name;
	int age;
	//메소드 ()매개변수없음, void리턴값이없다.리턴값있으면리턴밑에적어줌
	void sayHello() {    
		System.out.println("헬로우!!" + name + age);
	}

}
