package 타이머;

import java.util.Timer;
import java.util.TimerTask;


public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		//task를 1000ms(1초) 간격으로 반복
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				System.out.println("헬로우");
				
			}
		}, 0, 1000);

	}

}
