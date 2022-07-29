package 매개변수;

interface Runner{
	void execute(String text);
}


public class App {

	public static void main(String[] args) {
		Runner run1 = (t) -> System.out.println(t);
		run1.execute("펭수");
		
		//매개변수 1개 일때 괄호 생략 가능
		Runner run2 = s -> System.out.println (s);
		run2.execute("길동");

	}

}
