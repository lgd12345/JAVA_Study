package 파일위치;

import java.io.File;

public class App {

	public static void main(String[] args) {
		
		//절대 경로
		String fileLocation = "C:\\JAVA\\WORKSPACE\\CH19_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists()); // true 파일 있다!
		
		

	}

}
