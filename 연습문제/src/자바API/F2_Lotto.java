package 자바API;

import java.util.Random;

public class F2_Lotto {

	public static void main(String[] args) {
		// 객체 생성
		LottoMachine machine = new LottoMachine();
		
		// 로또 번호 가져오기
		int[] numbers = machine.getLottoNumbers();
		
		// 결과 출력
		System.out.print("생성 번호: ");
		for (int i : numbers) {
			System.out.printf("%d ", i);
		}
	}
}

class LottoMachine {
	// 필드
	private int[] LottoNumbers;

	// 생성자
	public LottoMachine() {
		/* 2. 메소드를 이용해서 로또번호 생성  */;
		LottoNumbers = generate();	
	}



	// 메소드
	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();

		/* 1. 임의의 숫자 6개를 만들어 배열 pickedNumbers에 입력한다. */
		int p1;
	    p1 = rand.nextInt(45)+1;

		return pickedNumbers;
	}
    
    /* 3.생성된 로또번호를 가져오는 get메소드를 만드세요. */
		public int[] getLottoNumbers() {			
		return null;
	}
	
	}


