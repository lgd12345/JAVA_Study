package 인터페이스다중구현;
//상속은 하나의 클래스만 상속 가능하지만 인터페이스는 여러게 구현 가능
public class Person implements Speaker, Greeter{

	@Override
	public void greet() {
		System.out.println("환영합니다.");
		
	}

	@Override
	public void speak() {
		System.out.println("나는 사람입니다.");
		
	}

}
