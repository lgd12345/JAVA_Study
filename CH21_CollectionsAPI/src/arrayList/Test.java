package arrayList;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//ArrayList,LinkedList 상황에 따라서 사용하세요
		LinkedList<Double> numbers = new LinkedList<Double>();

		// 평균값구하는것
		double total = 0;

		while (true) {
			System.out.print("숫자 또는 'Q'입력 > ");
			String input = scanner.nextLine();
			input = input.trim(); // trim으로 공백삭제함 (공백삭제된문자열)

			if (input.equalsIgnoreCase("q")) {
				break;
			}

			// System.out.println(input);
			try {
				double value = Double.parseDouble(input);// 실수로 변환
				numbers.add(value);
			} catch (NumberFormatException e) {
				System.out.println("실수를 입력하세요");
				continue; // 반복
			}

		}
		scanner.close();
		System.out.println();// 띄우기
		
		Collections.sort(numbers);//정렬한다.

		if (numbers.size() > 0) {
			System.out.println("입력된 숫자 : ");

			for (Double number : numbers) {
				System.out.printf("%.2f\n", number);
				//total += number;
				total = total + number; // 합계구하기
			}

			System.out.printf("평균은 : %.2f\n", total / numbers.size());// 평균값공식넣어줌

		} else {
			System.out.println("입력된 실수가 없습니다.");

		}

	}

}
