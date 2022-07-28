package hashSet;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		//(Hash)  Set은 순서없고 중복 안 됨!!
		HashSet<String> fruits = new HashSet<String>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		//리스트에 오렌지가 있는가? 있으면 true!!
		System.out.println(fruits.contains("오렌지"));
		
		for(String f : fruits) {
			System.out.println(f);
		}
		
		

	}

}
