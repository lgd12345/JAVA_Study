package application;

public class 이중배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이중배열[][]
				//{}3개라서 밑에length
				String[][] texts = { 
						{ "하나", "둘", "셋" },
						{ "넷", "다섯", "여섯","열" },
						{ "일곱", "여덟", "아홉" },
				};
				
				for(int i = 0; i < texts.length; i++) {
					
					for (int j = 0; j < texts[i].length; j++) {
						System.out.printf("%s\t", texts[i][j]);
					}
					System.out.println();
				}
	}

}
