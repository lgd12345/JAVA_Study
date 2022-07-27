package 생성자혼자해보기;

public class App {

	public static void main(String[] args) {
		//Person 1
		Person p1 = new Person("펭수",150.9);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		
		//Person 2
		Person p2 = new Person();
		
		p2.setName("길수");
		p2.setHeight(190.8);
		
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		
		

	}

}
