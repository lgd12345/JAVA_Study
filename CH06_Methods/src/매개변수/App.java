package 매개변수;

public class App {

	public static void main(String[] args) {
		// 
		Calculator calculator = new Calculator();
		int number = 5;
		
		int result = calculator.square(number);
		System.out.printf("%d 의 제곱은 %d 이다. \n", number, result);

		
		System.out.printf("%d 더하기%d는 %d 이다 \n", 1,9,calculator.plus(1, 9));
		
		System.out.printf("%d 빼기 %d는 %d 이다 \n", 1,9,calculator.minus(1, 9));
		
		result = calculator.plus(10,10);
		System.out.printf("두 수의 합은 %d 이다 \n", result);
		
		result = calculator.minus(10,100);
		System.out.printf("두 수의 차는 %d 이다 \n", result);
		
	}

}
