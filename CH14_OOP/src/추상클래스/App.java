package 추상클래스;

public class App {

	public static void main(String[] args) {
		//추상클래스는 객체를 만들 수 없다.
		//GameObject gameObject = new GameObject();
		
		//배열로 자식클래스 보여줌
		GameObject[] objs = { new Player(), new Monster() };

		for (GameObject obj : objs) {
			System.out.println(obj);
			obj.describe();
		}

	}

}
