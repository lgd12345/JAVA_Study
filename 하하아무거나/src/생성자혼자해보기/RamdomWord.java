package 생성자혼자해보기;

import java.util.Random;

public class RamdomWord {
	private String books = "knowledge pleasant tolerant executive encourage hardware surround qualified precedent talented craftsman admission designer absorption reluctance copyright orchestra terminal literature reproduction beginning physical population cooperative leftovers resignation therapist frighten fraction congress";
	// 단어를 split을 나누어줌
	private String[] words = books.split(" ");
	private Random random = new Random();
	private String selectWord;
	private char[] characters;

	public RamdomWord() {
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()];

	}

	public void getWords() {
		// ( : ) 뒤에꺼를 차례로 객체를 꺼내서 앞으로 넣는다.
		for (String word : words) {
			System.out.println(word);
		}
	}

	@Override
	public String toString() {
		String text = "";

		for (char c : characters) {
			text += (c == '\u0000') ? '_' : c;
			text += ' ';
		}

		return text;
	}

	public void addGuess(char c) {
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}

	}

	public boolean isComplete() {
		for (char c : characters) {
			if (c == '\u0000') {
				return false;
			}
		}
		return true;
	}

}
