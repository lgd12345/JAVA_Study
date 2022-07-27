package 정규표현식;

import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		System.out.println("Cat".matches("[cC]at")); // [aA]a또는A가능
		System.out.println("Cat".matches("[a-dA-D]at"));// a부터d까지 A부터D까지 가능
		System.out.println("Cat".toLowerCase().matches("cat")); // 소문자변환확인출력
		// [^c]만 제외하고 가능
		System.out.println("Cat".matches("[^C]at"));
		// \w => 한개의 문자영어 또는 숫자와 _ => 문자열 "\\w"
		System.out.println("a1_".matches("\\w\\w\\w")); // 숫자3개라서 w w w
		// 횟수 n개 {n},한개이상 +
		System.out.println("Cat".matches("\\w{3}"));
		// 전화번호 (02|051\|010)-\\d{3,4}-\\d{4}
		System.out.println("010-1234-5678".matches("(02|051|010)-\\d{3,4}-\\d{4}")); // 번호 4자리 4자리

		// 문자열로 만들어서 출력하기 위해서
		String regex = "(02|051|010)-\\d{3,4}-\\d{4}";
		String phoneNumber = "010-1234-5678";

		boolean result = Pattern.matches(regex, phoneNumber); // Pattern클래스 기본적으로 있음

		if (result) {
			System.out.println("올바른 전화번호 형식입니다.");
		} else {
			System.out.println("올바르지 않은 전화번호 형식입니다.");
		}

		regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // 자바에서는 \문자열로 치기때문에 \\이렇게 표현
		String email = "angel@naver.com";

		result = Pattern.matches(regex, email);

		if (result) {
			System.out.println("정규식과 일치합니다. 올바른 이메일 형식입니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다. 올바른 이메일 형식이 아닙니다");
		}

	}

}
