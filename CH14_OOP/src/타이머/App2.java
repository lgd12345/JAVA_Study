package 타이머;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class App2 {

	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		//ruunable인터페이스에 run을 구현하라 3초에 한번씩 반복
		executor.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println("헬로우");				
			}
		}, 0, 3, TimeUnit.SECONDS);

	}

}
