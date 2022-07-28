package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		long time = timeOperation(linkedList);
		System.out.println("측정 시간 : "+ time +"ms");
		
		long time2 = timeOperation(arrayList);
		System.out.println("측정 시간 : "+ time2 +"ms");
		
	}

	private static long timeOperation(List<Integer> list) {
		long start = System.currentTimeMillis(); //밀리초 ms(1/1000)
		
		for(int i = 0; i < 100000; i++) {
			list.add(0,i); //0자리에 i를 넣어주는 식이라서 느려지게됨 //일반적인 작업은 어레이리스트가 더 빠르다.
			// 그냥 i라면 순서대로라서 arrayList가 더 빠름 
		}
		
		
		return System.currentTimeMillis()- start; //수행시간
	}

}
