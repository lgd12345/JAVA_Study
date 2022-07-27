package 익명클래스;

public class App {

	private String name = "펭수";

	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
		// 익명 클래스로 인터페이스 객체 생성 Runnable()에 아무것도없음
//		Runnable runner = new Runnable() {
//			public void run() {
//				System.out.println(name);
//			}
//		};

		// 내부 익명 클래스로 인터페이스 객체를 바로 생성 
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}

	public void activate(Runnable runnable) {
		runnable.run();
	}

}
