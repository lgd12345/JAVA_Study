package application;

public class 이중배열 {

	public static void main(String[] args) {
		//이중배열[][]
		//{}3개라서 밑에length
		String[][] texts = { 
				{ "하나", "둘", "셋" }, //texts[0]
				{ "넷", "다섯", "여섯","열" },//texts[1]
				{ "일곱", "여덟", "아홉" },//texts[2]
		};
		
		//length는 3이 됨 /i length는 {}안에 배열이 됨 그래서343
		for(int i = 0; i < texts.length; i++) {
			//System.out.println(texts[i].length);
			String[] innerArray = texts[i];
			
			// 이중배열2에서 다시 확인해보자
			for (int j = 0; j < innerArray.length; j++) {
				System.out.printf("%s\t", innerArray[j]);
			}
			System.out.println();
		}

	}

}
