package 실제예제;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// 만든인터페이스가아닌 실제 사용되는 인터페이스로 해보자!
		// 특정 타입(제네릭)을 검사해서(test) boolean 참,거짓으로 리턴한다.
		
		//먼저내부클래스방식
		Predicate<String> p1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() < 4; //문자열의 길이가 4보다 작으면 참
			}
		};
		System.out.println(p1.test("abcd")); //4개니까 false
		System.out.println(p1.test("abc")); //3개니까 true
		
		//람다식 방식
		Predicate<String> p2 = s -> s.length() < 4; //문자열의 길이가 4보다 작으면 참
			
		System.out.println(p2.test("abcd")); //4개니까 false
		System.out.println(p2.test("abc")); //3개니까 true
		

	}

}
