package 멀티쓰레드작업;

public class App {

	public static void main(String[] args) { //메인이 하나의 쓰레드라고 보면 됨
		Thread thread = new Thread(()-> longTask()); //새 쓰레드 만들어서 롱테스크넣음
		//longTask(); // 긴 작업
		thread.start(); //쓰레드를 만들어서 다른 쓰레드가 긴 작업을 진행하게 한다.
		System.out.println("메인스레드 동작");
	}

	public static void longTask() {
		long t = System.currentTimeMillis();
		long end = t + 3000; // 현재시간에서 3초 더하기

		while (true) {
			if (System.currentTimeMillis() == end) {
				System.out.println("긴 작업 종료");
				break; // 3초 정도 대기하다가 빠져나감
			}
		}
	}

}
