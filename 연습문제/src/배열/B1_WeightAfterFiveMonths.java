package 배열;

public class B1_WeightAfterFiveMonths {

	public static void main(String[] args) {
		 // 입력값 받기 (main문의 입력변수: 오른쪽 마우스 클릭후 Run As => Run configuration)
	    double start = Double.parseDouble(args[0]);// 72.4 앞에 문자열 5 뒤에 문자열
	    int after = Integer.parseInt(args[1]); // run에서 main을 실행할 때 문자열을 숫자로 변환했다. int,double
	    
	    // 계산
	    double result = weight(start, after);
	    
	    // 결과 출력
	    System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
	  }
	  
	  // 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
	  public static double weight(double currentWeight, int months) {
	    double expectedWeight = currentWeight;
	    for (int i = 0; i < months; i++) {
	      expectedWeight += 0.231;
	    }
	    return expectedWeight;

	}

}
