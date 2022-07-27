package application;

public class 불린or {

	public static void main(String[] args) {
		// == , !=, !, &&, ||

		boolean isRaining = true; // 비가오는가?
		boolean mightRain = false; // 비가올수도있는가?
		boolean takeUmbrella = false; // 우산을쓴다?

		takeUmbrella = isRaining || mightRain; //하나의 값이라도 true면 true 다

		System.out.println(takeUmbrella);

	}

}
