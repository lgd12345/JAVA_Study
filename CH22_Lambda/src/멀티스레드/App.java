package 멀티스레드;

public class App {

	public static void main(String[] args) {	
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//			}
//		};
		Runnable runnable = ()-> {
			for(int i=0; i< 100; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(500); //0.5초 대기
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		
		//() 괄호안에 러너블 객체를 넣어줌
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		//두개 쓰레드가 자기맘대로 실행됨
		t1.start(); //쓰레드 실행 
		t2.start(); //쓰레드 실행
		
		System.out.println("메인종료!");
		

	}

}
