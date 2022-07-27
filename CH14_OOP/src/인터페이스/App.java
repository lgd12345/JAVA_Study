package 인터페이스;

public class App {

	public static void main(String[] args) {
		// Object 클래스는 모든 클래스의 부모 클래스

		Discribale[] objs = { new Person(), new Computer() };

		for (Discribale obj : objs) {
			System.out.println(obj.getDescription());
		}

	}

}
