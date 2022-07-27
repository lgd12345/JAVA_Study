package 예외던지기throwing;

public class Thermostat {
	
	//throws 예외는 예외를 미뤄서 이 메소드를 부를 때 처리(메소드를 부르는 곳으로 넘겨버림)
	public void setTemperature(double t) throws Exception {
		if (t < 0 || t > 35) {
			//코드로 직접예외 객체 생성
			throw new Exception("온도가 비정상 입니다.");
		} //오류 최초 발생지점
		
		System.out.println("온도 세팅 : "+ t);
	}
}
