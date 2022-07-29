package 멀티스레드2;

public class App {

	private int value = 0; //공유 변수

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) { //값이 1000이면 2000나옴 10000이면 왜 20000안됨
				value++;
			}
		};
		// () 괄호안에 러너블 객체를 넣어줌 //서로 다른 작업이라 동시에 되버리면 값이 2가 되는 상황에 1이 됨
		Thread t1 = new Thread(runnable); // 쓰레드는 자원공유방식
		Thread t2 = new Thread(runnable);

		// 두개 쓰레드가 자기맘대로 실행됨
		t1.start(); // 쓰레드 실행
		t2.start(); // 쓰레드 실행

		System.out.println("Value: " + value);

		t1.join(); // 메인스레드가 t1스레드의 동작이 끝마칠 때 까지 기다림
		t2.join();
		
		System.out.println("Value: " + value);

	}

	public static void main(String[] args) throws InterruptedException {
		new App().run(); //더 좋은 컴퓨터성능에 따라 더 큰 수 나올 수 있음

	}

}
