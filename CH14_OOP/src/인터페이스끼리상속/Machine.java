package 인터페이스끼리상속;

public class Machine implements DefaultRunnable{
	//인터페이스 상속 받은 것 같이 추가
	@Override
	public void run() {
		System.out.println("머신 러닝!");
		
	}

	@Override
	public void displayDetails() {
		System.out.println("표시할 디테일 없음");
		
	}

}
