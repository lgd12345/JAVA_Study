package application;

public class 빈문자열 {

	public static void main(String[] args) {
		// blank vs empty : 공백을 제외하려면 isblank를 사용한다.
		
		String myText = " \n";
        System.out.println("빈문자열 학인" + myText.isEmpty());//빈문자열만 확인
        System.out.println("빈문자열 확인" + myText.isBlank());//공백문자제외하고 빈문자열 확인
        
        myText = "아침밥을 맛있게 먹었다.";
        System.out.println(myText.replace("아침", "저녁")); //아침을 저녁으로 교체
        
        //공백 제거 strip()
        String name = "  제인 ";
        System.out.printf("'%s'\n",name.strip());//strip에 의해서 공백제거
        System.out.printf("'%s'",name);//strip 없음
        		

	}

}
