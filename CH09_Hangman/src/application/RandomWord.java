package application;

import java.util.Random;

//렌덤 단어를 생성해주는 클래스

public class RandomWord {

	private String books = "woman user republic system historian childhood magazine error setting meal story recipe courage contract possession honey throat loss patience fortune student climate reaction environment promotion government country energy estate dealer";
	// 스페이스로 단어들을 분리해서 배열
	private String[] words = books.split(" ");
	private Random random = new Random();
	private String selectWord; // .랜덤으로 선택된 단어
	private char[] characters; // 문자열배열

	// 생성자로 생성시 단어가 선택됨
	public RandomWord() {
		this.selectWord = words[random.nextInt(words.length)];
		// 단어의 길이만큼 문자개수 방을 잡아줌
		this.characters = new char[selectWord.length()];
	}

	// 단어배열 words에 있는 모든 단어 출력
	public void getWords() {
		for (String word : words) {
			System.out.println(word);
		}
	}

	@Override
	public String toString() {
		String text = "";
		// 철자를 맞췄을 때
		// characters[3] = 'x';
		for (char c : characters) {
			text += (c == '\u0000') ? '_' : c; // 처음 상태 공백
			text += ' ';//_ _ _ _ 이렇게 해주려고 안 하면 ___이렇게됨
		}
		// System.out.println(selectWord); //임시로보여줌
		return text;
	}

	// 입력된 문자와 같은 문자가 있는지 확인해서 문자배열 characters에 입력
	public void addGuess(char c) {
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}

	public boolean isComplete() {
		// 만약에 전체 characters에서 공백 '\u0000'이 없으면 종료
		for (char c : characters) {
			if (c == '\u0000') {
				return false; // 아직 못맞춤
			}
		}
		// 공백이 하나도 없음면 내려옴
		return true; // 전부 체크해서 완료
	}

}
