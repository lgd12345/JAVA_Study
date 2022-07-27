package toString;
//한개의 java파일에 public클래스는 하나다.
public class App {

	public static void main(String[] args) {

		Person p1 = new Person("펭수",7);
		

		System.out.println(p1.toString());
		

		Person p2 = new Person("길동",10);
	

		System.out.println(p2.toString());
		
		
		
	}

}
