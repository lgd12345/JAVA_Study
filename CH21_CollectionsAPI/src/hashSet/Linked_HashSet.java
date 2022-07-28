package hashSet;
import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		//입력한 순서대로 출력해주는 건 LinkedHashSet
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		fruits.remove("배"); //set 이라서 인덱스 번호가 없다 그래서 지워주려면 이름 넣어줌
		
		System.out.println(fruits.contains("오렌지")); //오렌지 있는지 확인
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		

	}

}
