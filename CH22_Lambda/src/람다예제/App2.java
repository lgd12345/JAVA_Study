package 람다예제;

interface Runner{
	void execute();
}

public class App2 {

	public static void main(String[] args) {
		//execute메소드를 여기서 완성
		
		//내부 클래스... 익명함수 // 인터페이스 완성! 예전 수업에서 했던 방식
		Runner run1 = new Runner() {
			
			@Override
			public void execute() {
				System.out.println("하이");
				System.out.println("헬로우");
				System.out.println("람다식");
			}
		};
		run1.execute();
		
		//람다식 방식
//		Runner run = () -> {
//			System.out.println("하이");
//			System.out.println("헬로우");
//			System.out.println("람다식");
//		};
		Runner run = () -> System.out.println("하이"); //코드가 한줄 밖에 없을 때는 코드블럭 생략 가능
		
		run.execute();
		
		System.out.println(run instanceof Runner); //runner의 객체인가 트루 맞다!
		System.out.println(run.getClass()); //객체 클래스 

	}

}
