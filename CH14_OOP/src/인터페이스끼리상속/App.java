package 인터페이스끼리상속;

public class App {

	public static void main(String[] args) {
		//본인스스로는 객체 못 만들지만 상속해서 만들 수 있다.
		DefaultRunnable m1 = new Machine();
		m1.run();
		m1.displayDetails();
		m1.hello();

	}

}
