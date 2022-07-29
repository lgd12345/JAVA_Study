package 매개변수;

interface Runner2 {
	void execute(String name, String text);
}


public class App2 {

	public static void main(String[] args) {
		// 매개변수2개일때
		Runner2 run = (n,t) -> System.out.printf("%s님 %s \n", n , t);
		
		run.execute("펭수", "안녕하세요");
		
		//메소드만들기
		greet(run);
	}
	private static void greet(Runner2 run) {
		run.execute("길동", "안녕하세요~!");
		
	}

}
