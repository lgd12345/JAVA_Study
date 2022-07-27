package overridingMethod;

public class App {

	public static void main(String[] args) {
		// 고양이 클래스를 집고양이, 길고양이가 상속받음
		HouseCat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();

		RoadCat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		
		
		System.out.println(cat1.toString());
		//toString없어도 자동 실행됨
		System.out.println(cat2.toString());
		//패키지이름 클래스이름 주소
		System.out.println(cat3);

	}
}
