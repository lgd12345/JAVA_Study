package 다형성;

public class Tiger extends Cat {

	@Override
	public void vocal() {
		// 보컬 오버라이드했다.
		System.out.println("어흥~!");
	}
	@Override
	public String toString() {
		return "호랑이";
	}

}
