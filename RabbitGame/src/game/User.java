package game;

import java.util.Scanner;

public class User {
Scanner scanner = new Scanner(System.in);
	
	private final String Name = scanner.next();

	public String getName() {
		return Name;
	}

}
