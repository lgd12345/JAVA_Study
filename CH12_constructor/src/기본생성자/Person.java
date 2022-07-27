package 기본생성자;

public class Person {

	private String name;

	public Person() {

	};

	public Person(String name) {
		System.out.println("펄슨객체생성됨");
		this.name = name;
	}

	@Override
	public String toString() {
		return "헬로우" + name;
	}
}