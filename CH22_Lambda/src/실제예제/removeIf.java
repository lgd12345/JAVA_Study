package 실제예제;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class removeIf {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(3);
		number.add(5);
		number.add(7);
		number.add(9);
		number.add(10);
		number.add(4);
		//removeIf는 Predicate <integer> filter
		//Predicate인터페이스 객체를 넣는데 super integer검사 결과는 불린값으로 리턴됨
		number.removeIf(n -> n < 6); //6보다 작은 수 검사해서 참이면 삭제한다.
		
		//이너클래스
		number.forEach(new Consumer<Integer>() {
			public void accept(Integer n) {
				System.out.println(n);
			}
		});
		//람다식
		number.forEach(n -> System.out.println(n)); //반복문에 람다식으로 출력

	}

}
