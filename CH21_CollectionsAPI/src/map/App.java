package map;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		//해시맵은 순서(인덱스)가 있는것이 아니라 키 값으로 인덱스 대체
		//첫번째는 정수 두번째는 문자열 Key,Value K, V
		HashMap<Integer, String> people = new HashMap<>();
		
		
		//map은 입력시 put(키 ,값)
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클"); //중복x 4번의 값이 덮어쓰기 (업데이트)되어서 마이클이 됨
		people.put(10, "수지");
		
		//값을 불러오기 (키 필요) 
		System.out.println(people.get(4)); //무조건 키값으로만 부를 수 있다.
		//System.out.println(people.values("수지")); //이거 안됨 절대!!
		
		String person = people.get(10);
		System.out.println(person);
		
		System.out.println();
		
		//람다식 출력
		people.forEach((k,v) -> {
			System.out.println(k + " : " + v);
		});
		//people 값만출력
		 for(String s : people.values()) {
			 System.out.println("값은 : " + s);
		 }
		 for(Integer i : people.keySet()) {
			 System.out.println("키는 : " + i);
		 }
		 for(var entry : people.entrySet()) {
			 var key = entry.getKey();
			 var values = entry.getValue();
			 System.out.println(  key+ " : "+ values);
		 } for(var entry : people.entrySet()) {
			 System.out.println( entry );
		 }

		
		
	}

}
