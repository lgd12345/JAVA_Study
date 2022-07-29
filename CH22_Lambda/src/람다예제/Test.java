package 람다예제;
//람다식은 함수형인터페이스가 필요하다.
@FunctionalInterface //이게 있으면 함수형 인터페이스라는 뜻인데 추상메소드가 없거나 두개가 있으면 아님!

public interface Test {
	void run(); //추상메소드1개 함수형인터페이스는 무조건 추상메소드1개!!!! Runnable..등등
}