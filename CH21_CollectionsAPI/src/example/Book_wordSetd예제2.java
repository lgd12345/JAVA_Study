package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSetd예제2 {

	public static void main(String[] args) {
		//
		File wordsFranken = new File("Frankenstein.txt");

		System.out.println(wordsFranken.exists());// 있다고 나옴 true!!&출력!

		// 메소드에 집어넣을거임 TreeSet을 썼기때문에 정렬도 하고 중복도 제거했다.
		TreeSet<String> franken = loadWords(wordsFranken);
		System.out.println(franken.size());//중복빠진 단어개수 &출력!
		displayWords(franken); //displayWords메소드에 franken메소드 들어감! &출력!!

	}
	
	private static void displayWords(TreeSet<String> list) {
		//단어길이 6자 이상인 콘솔에 한줄에 6개씩 출력하라
		int count = 0; //카운트는 처음에 0부터 시작하는데
		for(String w : list) {
			if(w.length() < 6)
				continue;
			System.out.printf("%-10s \t", w);// 문자열을-10 앞에서부터 정렬해라
			count++;
			if(count == 6 ) { // 6까지 카운트하고 줄을 맞추면 (1줄에 6개)
		    	System.out.println(); //줄 바꾼뒤에
				count = 0;  //0이 되어라 그리고 다시 6 카운트한다.
			}
		}
	}
	

	private static TreeSet<String> loadWords(File file) {
		// 책 파일의 모든 단어들을 set리스트에 넣어서 리턴한다.
		TreeSet<String> wordSet = new TreeSet<String>();
				
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			
			while ((line=br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");
				
				for(String word : words) {
					wordSet.add(word.toLowerCase()); // 영어 배열 만든걸 TreeSet에 집어 넣는다.
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못 함");
			
			e.printStackTrace();
		}catch(IOException e1) {
			System.out.println("파일을 못 읽음");
		}
		
		return wordSet;
	}

}
