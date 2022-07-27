package super생성자;

public class Employee extends Person{
public Employee() {
	//super는 상속받은 부모의 생성자인데 이게 안 적혀있어도 같이 실행
	//부모클래스의 객체가 먼저 생성됨
	super("익명");
	System.out.println("Employee생성자");
}
	
	
}
