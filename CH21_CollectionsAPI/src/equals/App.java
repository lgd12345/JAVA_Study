package equals;

//import java.util.Scanner;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // 같은 객체일때 true
		if (obj == null)
			return false; // null일때 false
		if (getClass() != obj.getClass())
			return false; // 클래스가 다를경우 false
		Person other = (Person) obj; // 이름이 없으면 false
		if (other.name == null) {
			return false; //other의 이름이 널이면 false
		}//이름으로 비교
		return this.name.equals(other.name); //이름이랑 이름 같으면 true
	}

	public String toString() {
		return name;
	}
}

public class App {

//	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");

		// 다른 객체라서 다르다고 false 나옴
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		
		String s1 = new String("문자열");
		String s2 = "문자열";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		//문자열 비교시 == 사용하지말고 aquals 사용!! 문자열도 클래스 타입이라서 주소를 비교해야한다.
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("입력 y/n : ");
//		String input = scan.nextLine();
//		//문자열이 특히 이퀄s을 써야함
//		if(input.equals("y")) {
//			System.out.println("예스");
//		}
		
		
		
	
	}

}
