package convertingTemp;

public class App {

	public static void main(String[] args) {
		// 섭씨(selsius) 화씨(fahrenheit) 변환
		// (0°C × 9/5) + 32 = 32°F

		double c = 20;
		double f = (c * 9 / 5) + 32;

		System.out.println("섭씨" + c + "는 화씨" + f + "이다.");
		
		c = 30;
		
		System.out.println("섭씨" + c + "는 화씨" + f + "이다.");
		
		

	}

}
