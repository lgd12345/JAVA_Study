package 반복문;

public class 연산자위치 {

	public static void main(String[] args) {
		// 증감연산자의 위치에 따라 먼저 증감하고 할당(=), 할당(=)하고 증감
		int cats = 5;
		System.out.println(cats++); // 할당 먼저 그 다음 증가
		System.out.println(cats);

		int dogs = 3;
		System.out.println(++dogs);// 먼저 증감 다음 할당

		int chickens = 10; //고양이 6, 개 4
		int animals = cats + chickens++; //치킨 10할당 후 11
		System.out.println(animals); //16

		
		int apples = 5;
		int bananas = 4;
		int fruits = ++apples + bananas++; // 사과 6 바나나 4 할당후 5
		System.out.println(fruits); //10
	
	}

}
