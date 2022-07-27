package try_catch_finally;

public class App {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person();

		try {//예외니깐 메시지도 출력안됨 바로 넘김
			p1.setName(null);
			System.out.println("여기는 출력안됨");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// 예외가 발생하더라도 여기는 무조건 실행됨
			System.out.println("파이널리 무조건 실행");
		}

		System.out.println("프로그램 종료");

	}

}
