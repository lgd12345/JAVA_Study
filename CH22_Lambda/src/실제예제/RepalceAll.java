package 실제예제;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.UnaryOperator;

public class RepalceAll {

	public static void main(String[] args) {
		// replaceAll 각각의 아이템의 연산 결과로 대체한다.
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);

		//replaceAll에 있는 거 UnaryOperator
		
//		numbers.replaceAll(new UnaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer n) {
//				return n * n; //원래숫자의 제곱으로 리턴
//			}
//		});
		
		//람다식
		numbers.replaceAll(n -> n*n);
		
		
		numbers.forEach(x -> System.out.println(x));
	
	List<String> friends = new ArrayList<String>();
	
	friends.add("펭수");
	friends.add("길동");
	friends.add("메리");
	friends.add("철수");
	
	friends.replaceAll(s -> "안녕~! "+s);
	friends.forEach(t -> System.out.println(t));
	
	}

}
