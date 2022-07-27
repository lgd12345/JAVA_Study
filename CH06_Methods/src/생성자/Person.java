package 생성자;

public class Person {
	
	//필드변수
	private String name;
	private int height;
	
	//기본생성자는 생략가능
	public Person() {
		name = "이름미상";
		height = 100;
		//기본생성자 : public 클래스명()
		System.out.println("person 객체를 생성!");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("person 객체를 생성");
	}
	
	//매개변수가 있는 생성자(위에랑 다른 생성자로 인식)
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
		System.out.println("person 객체를 생성!");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
}
