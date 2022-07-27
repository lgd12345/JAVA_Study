package application;

import java.util.Scanner;

//전체 행맨 게임을 실행하는 클래스

public class Hangman {
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);

	public void run() {

		do {
			displayWord(); // 화면에 단어표시 (완료)
			getUserInput(); // 입력받음
			checkUserInput();// 맞는지 체크 = 맞을 시 running = false

		} while (running);
	}

	public void displayWord() {
		// 단어 표시하기
		System.out.println(word.toString());// 랜덤으로 선택된 단어

	}

	public void getUserInput() {
		System.out.println("한 문자 입력: ");
		String guess = scanner.nextLine();
		// 문자열에서 빼낸 한 문자를 랜덤워드 메서드
		word.addGuess(guess.charAt(0));
	}



	public void checkUserInput() {
		if(word.isComplete()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : "+ word.toString());
			running = false; //반복문 종료
		}
	}

	public void close() {
		scanner.close(); // 게임 종료시 스캐너 닫기
	}
}
