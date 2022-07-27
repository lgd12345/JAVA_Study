package 한줄씩쓰기;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileLocation = "C:\\JAVA\\WORKSPACE\\CH19_Reading_Writing\\text.txt";
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation)); //예외처리도해줌
			br.write("오렌지");
			br.newLine(); //한줄 띄움
			br.write("사과");
			br.newLine();
			br.write("banana");
			br.newLine();
			br.close();//파일 닫아야 완벽히 적힌다. 
			
		} catch (IOException e) {
			//파일을 쓸때 파일 없으면 새로 만듬.
			System.out.println("파일 쓸 수 없을: " + fileLocation);
		}
		System.out.println("파일 쓰기 완료: "+ fileLocation);

	}

}
