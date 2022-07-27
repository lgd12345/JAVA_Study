package 예외던지기throwing;

public class App {

	public static void main(String[] args) throws Exception {
		//throw 예외처리는 불러와서 처리함
		Thermostat stat = new Thermostat();
		//완전 처리한게 아니라 미루는 거라서 오류뜸
		stat.setTemperature(-1);

	}

}
