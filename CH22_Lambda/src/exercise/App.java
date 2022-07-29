package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		
		/*
		 * 0~10 값이 아닌 값들은 모두 제거
		 * 그다음, 각 아이템들에 + 100 을 한다.
		 * 그 결과를 콘솔에 표시
		 * 
		 */
		//or 인 이유는 (1 개체가) 0보다 작거나 10보다 크다 값이 되어야 하기 때문  
		//and는 (1 개체가) 0보다 작으면서 (동시에) 10보다 크다 값이 됨 (이상하게됨)
		list.removeIf(n -> (0 > n || 10 < n));
		
		list.replaceAll( n -> n + 100);
		
		list.forEach(n -> System.out.println(n));
		
		
		
		
	}

}
