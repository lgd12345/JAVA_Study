package application;

public class 불린혼합 {

	public static void main(String[] args) {
		// == , !=, !, &&, ||

		boolean isRaining = false;
		boolean mightRain = true;
		boolean haveUmbrella = true;

		if ((isRaining || mightRain) && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}

		boolean rainCheck = isRaining || mightRain; //(rainCheck만들어서 or부분을 따로 넣어주고) &&만 적고 출력

		if (rainCheck && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}
	}

}
