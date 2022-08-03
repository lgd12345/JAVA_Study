package abc;

public class FoodTest {

	public static void main(String[] args) {
		// 음식 객체 생성
		Food f = new Food("치킨", 18000);
		Food f2 = new Food("피자", 28000);
		Food f3 = new Food("초밥", 22000);

		// 객체 배열에 음식 담기
		Food[] foods = { f, f2, f3 };

		// 모든 음식 정보 출력
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
	}
}

class Food {
	String name;
	int price;

	public Food(String string, int i) {
		name = string;
		price = i;
	}

	@Override
	public String toString() {
		return "Food {name=" + name + ", price=" + price + "}";
	}
}