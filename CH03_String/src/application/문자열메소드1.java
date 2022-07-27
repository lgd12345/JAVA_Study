package application;

public class 문자열메소드1 {

	public static void main(String[] args) {
		// sharAt(인덱스번호) : index번호에 해당하는 문자가 리턴
		String text = "ABCDE";
		System.out.println(text.charAt(0));
		System.out.println(text.charAt(1));
		System.out.println(text.charAt(2));
		System.out.println(text.charAt(3));
		System.out.println(text.charAt(4));
		//System.out.println(text.charAt(5));
		
		//문자열 알파벳순 비교
		String w1 = "abcde";
		String w2 = "abcdd";
		// 문자열순으로 비교해서 문자열 크면 숫자도 큼 앞부분에서 뒷부분을 빼준 값이 나온다
		// 큰순서비교 먼저 작은순서비교
		System.out.println(w1.compareTo(w2)); 
		
		//contains(문자열) 문자열이 포함하고 있는지 확인
		text = "오늘 점심은 돈가스다.";
		System.out.println(text.contains("돈가스"));
		
		//concat 문자열 합침
		System.out.println(w1.concat(w2));
		//StringBuilder 를 사용해 합침
		String finalString = new StringBuilder().append(w1).append(w2).toString();
		System.out.println(finalString);
		
		//String.format("",) : printf("%s",변수),대신 출력하지 않고 문자열 형식을 만듬
		String formatString = String.format("%s %s",w1,w2);
		System.out.println(formatString);
		System.out.printf("%s %s",w1,w2);
		
		
		
		
		
		

	}

}
