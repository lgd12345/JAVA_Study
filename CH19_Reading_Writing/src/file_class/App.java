package file_class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		//파일의 경로
		File currentDirectory = new File(".");
		
		System.out.println(currentDirectory.getAbsolutePath());
		System.out.println(currentDirectory.getCanonicalPath()); //프로젝트 경로

	}

}
