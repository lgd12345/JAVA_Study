package 계란삶기타이머;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Task1 extends TimerTask{

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
	
		System.out.println("계란 삶는 중");
	}	
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 5000, 5000);
		//5초 뒤 부터 시작 5초 간격으로 
		
		
		ScheduledExecutorService execuer = Executors.newScheduledThreadPool(1);
		execuer.scheduleAtFixedRate(new Task2(), 30, 30, TimeUnit.SECONDS);		
		//30초 뒤 부터 시작 30초 간격으로
	}
}
