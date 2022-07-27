package custom_exception;

import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class Thermostat {
	
	//RuntimeException은 안 적어도 됨 
	public void setTemperature(double t) throws TempTooLowException, TempTooHighException  {
		
		setMachinTemperature(t);
		
		System.out.println("온도 세팅 : "+ t);
	}
	

	private void setMachinTemperature(double t) throws TempTooLowException, TempTooHighException {
		
		if (t <0) {
			//코드로 직접예외 객체 생성//오류 최초 발생지점
			throw new TempTooLowException("온도가 비정상 입니다.");
		} else if (t > 35) {
			throw new TempTooHighException("온도가 비정상 입니다.");
		}
		
	}
}
