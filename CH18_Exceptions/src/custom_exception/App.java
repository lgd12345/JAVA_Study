package custom_exception;

import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class App {

	public static void main(String[] args) {

		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(88);
		} catch (TempTooLowException e) {
			System.out.println("온도가 0도 미만으로 비정상이닷");// 에러 메세지만 출력
		} catch (TempTooHighException e) {
			//캐치 추가!!
			System.out.println("온도가 35도 초과로 비정상이닷");
		}

	}

}
