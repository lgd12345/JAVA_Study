package 한줄씩읽기;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class App {

	public static void main(String[] args) {
		
		String fileLocation = "C:\\JAVA\\WORKSPACE\\CH19_Reading_Writing\\text.txt";
		System.out.println(new File(fileLocation).exists()); // true 파일 있다!
		System.out.println();//한칸띄우기
		
		//BufferedReader 한번에 여러글자를 읽는 클래스 <= (()=>바이트단위로 먼저 읽고)
		//파일 못 찾았을 때 예외처리
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line); //파일에서 읽는 한줄을 그대로 출력
				
			}
		} catch (FileAlreadyExistsException e) {
			System.out.println("파일을 찾지 못함 : "+ fileLocation);
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함 : "+ fileLocation);
		}
		
	}

}
