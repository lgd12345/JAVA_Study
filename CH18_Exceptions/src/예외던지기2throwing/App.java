package 예외던지기2throwing;

public class App {

	public static void main(String[] args) throws Exception {
		//throw 예외처리는 불러와서 처리함
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(-1);
		} catch (Exception e) {
			//e.printStackTrace();//예외 발생시 빨간 코드!
		    System.out.println(e.getMessage());//에러 메세지만 출력
		}
		

	}

}
