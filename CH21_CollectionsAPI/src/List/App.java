package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// ArrayList가능
		List<Integer> List1 = new LinkedList<>();

		List1.add(5);
		List1.add(7);
		List1.add(8);

		DisplayList(List1);
		System.out.println();//띄움

		List<Integer> List2 = new ArrayList<>();
		
		List2.addAll(List1);
		List2.add(9);
		List2.add(10);
		
		DisplayList(List2);
	}

	private static void DisplayList(List<Integer> numbers) {
		for (Integer n : numbers) {
			System.out.println(n);
		}

	}

}
