package application;

public class 이중배열연습문제 {

	public static void main(String[] args) {
		// 이중배열
		int[][] values = {
				{1,5,7},
				{9,6,3},
				{2,4,6,10}
		};
		
		int total = 0; 
		for(int i = 0; i < values.length; i++) {
			
			for(int j = 0; j < values[i].length; j++) {
				total = total + values[i][j];
			}
		}
		
		System.out.println("총합은 : "+total);
	
	}

}
