package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		// 실수 정렬하기
		ArrayList<Double> doubles = new ArrayList<Double>();
		
		doubles.add(7.25);
		doubles.add(4.25);
		doubles.add(3.25);
		doubles.add(2.25);
		
		Collections.sort(doubles); //비교하여 작은 순으로 정렬
		
		for(Double d : doubles) {
			System.out.println(d);
		}
		
		ArrayList<Person> people = new ArrayList<Person>();

		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));

		Collections.sort(people); //정렬에러!!
		
		//Integer compareTo가 있다 객체와 객체끼리 비교하는 기능있음
		for(Person p : people) {
			System.out.println(p);
		}

	}

}
