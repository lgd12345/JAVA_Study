package 메소드이너클래스2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	// 변수설정
	private String name;

	public App() {
		name = "엘리자베스";
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();

	}
//(run이 메소드 임 )메소드 안에 클래스를 넣을 수 있다
	private void run() {

		class Task implements Runnable {
			
			public void run() {
				System.out.println(App.this.name);
			}

		}

		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Task(), 0L, 1L, TimeUnit.SECONDS);
	}

}
