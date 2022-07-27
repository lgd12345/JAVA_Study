package integerVariavles;

public class Casting {

	public static void main(String[] args) {
		// 형변환
		// 자동형변환
		byte a = 32;

		// 1 byte로 저장된 값을 2 byte로 변환
		short b = a;

		// 2 byte로 저장된 값을 4 byte로 변환
		 int c = b;
		// short z = c; 큰타입을 작은 타입에 넣어서 에러 남

		// 4 byte로 저장된 값을 8 byte로 변환
		 long d = c;
		// int x = d; 큰타입을 작은 타입에 넣으면 에러가 난다.

		float e = 1.12F; // 에러나는 이유 실수기본타입이 double이라서 F 붙여줌!
		// double f = e; // 더블이 더 큼

		// 명시적 변환 (원할때)
		long g = 1000000;
	    int h = (int) g;

	    short i = (short) h;
	    System.out.println(i); // 명시적 변환시 큰타입에서 변환시 손실될 가능성이 있다.
		// 큰단위 숫자를 담을 수 없기 때문에
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
		

	}
}
