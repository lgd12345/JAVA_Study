package 생성자혼자해보기;

import java.util.Scanner;

public class Hangman {

	// 정답되기전까진 반복
	private boolean running = true;
	private RamdomWord word = new RamdomWord();
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		do {
			displayWord(); // 단어표시
			getUserInput();// 문자입력
			checkUserInput();// 정답확인

		} while (running);

	}

	public void displayWord() {
		// 단어표시
		System.out.println(word.toString());
	}

	public void getUserInput() {
		// 문자입력
		System.out.println("한 문자 입력: ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));

	}

	public void checkUserInput() {
		if (word.isComplete()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : " + word.toString());
			running = false;
		}

	}

	public void close() {
		scanner.close();

	}

}
