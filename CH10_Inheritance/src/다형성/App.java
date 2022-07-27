package 다형성;

public class App {

	public static void main(String[] args) {
		// 고양이 클래스를 집고양이, 길고양이,호랑이가 상속받음

		// Cat타입 배열
		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };
		// cat[0] == new HouseCat();
		// cat[1] == new RoadCat();
		// cat[2] == new TigerCat();

//		cats[0].vocal();
//		cats[0].hunt();
//
//		cats[1].vocal();
//		cats[1].hunt();
//
//		cats[2].vocal();
//		cats[2].hunt();

		//for (int i = 0; i < cats.length; i++) {
		///cats[i].vocal();
		//	cats[i].hunt();
		//}
		// for each문 
		for (Cat c : cats) {
			c.vocal();
			c.hunt();
		}

		Cat cat1 = new HouseCat(); //부모타입으로 선언 (업캐스팅)
		cat1.vocal();
		cat1.hunt();
		//cat1.callMaser(); 부모타입일때 부모타입이 가능한 메소드만 가능
		
		
		//cat1은 cat타입이라서 바로 안됨 (사용)
		HouseCat cat2 = (HouseCat)cat1;//다시 자식타입으로(다운캐스팅)
		cat2.callMaster(); //가능
	}
}
