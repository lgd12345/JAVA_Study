package 상속;

public class App {

	public static void main(String[] args) {
		// 새 클래스가 동물 클래스를 상속함
		Animal animal = new Animal();
		animal.eat();//동물의 메소드 사용가능
		
		//새는 본인 클래스 fly메소드 외의 상속받은 eat메소드사용가능
		Bird bird = new Bird();
		bird.eat();
		bird.fly();

	}

}
