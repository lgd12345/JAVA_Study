package 예외처리;

public class App {

	public static void main(String[] args) throws InterruptedException {
		//예외 처리하기 throws는 예외처리를 넘겨버림
		System.out.println("하나");
		Thread.sleep(2000);// 쓰레드.. 2초 대기 프로그램 대기 약간 위험사항이 있어서 예외 처리를 해줘라
		System.out.println("둘");

	}

}
