package reading_writing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {

		String text = "헬로우! \n 하 와 유?";

		/* 파일에 쓰기 */
		Path path = Paths.get("text.txt");// 파일 경로 객체 //상대 경로 ex) html 이미지
		// Files.write(파일경로, 내용) : 파일에 쓰기
		Files.write(path, text.getBytes()); // 바이트로 바꿔서

		/* 파일을 읽기 */
		String recivedText = Files.readString(path);
		System.out.println(recivedText);

	}

}
