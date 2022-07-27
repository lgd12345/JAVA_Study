package 자바시작하기;

public class A5_TotalSales {

	public static void main(String[] args) {
		//연습문제 5번
		int[] a = {2000*57,6000*29,5000*34};
		int total = 0;
		
		for(int i = 0; i < a.length; i++ ) {
		System.out.println(a[i]);
		total = total + a[i];
		}
		
		System.out.println("총 매출: " + total+"원");
	
		
		
		
		
		
		

	}

}
