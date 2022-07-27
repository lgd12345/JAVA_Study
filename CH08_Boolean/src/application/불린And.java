package application;

public class 불린And {

	public static void main(String[] args) {
		// ==, !=,!,&&,|| 비교 및 논리 연산자

		boolean isRaining = false; // 비가오는가?  //이거
		boolean haveUmbrella = true; // 우산을가짐?// 이거 두개가 둘다 트루가 되어야 트루가됨

		boolean takeUmbrella = false; // 우산을쓰나?

		// 1: 만약 비가 오고 우산이 있으면 우산을 쓴다.

		if (isRaining) {
			if (haveUmbrella) {
				takeUmbrella = true;
			}
		}
		
		System.out.println("첫번째 : "+takeUmbrella);
		
		//2
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("두번째 : " + takeUmbrella);
		// 3
		
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("세번째 : " + takeUmbrella);

	}

}
