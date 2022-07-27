package 런타임예외;

public class Thermostat {
	
	//RuntimeException은 안 적어도 됨 
	public void setTemperature(double t) {
		
		setMachinTemperature(t);
		
		System.out.println("온도 세팅 : "+ t);
	}

	private void setMachinTemperature(double t) {
		
		if (t < 0 || t > 35) {
			//코드로 직접예외 객체 생성//오류 최초 발생지점
			throw new RuntimeException("온도가 비정상 입니다.");
		} 
		
	}
}
