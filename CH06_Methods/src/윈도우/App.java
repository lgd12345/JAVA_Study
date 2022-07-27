package 윈도우;

public class App {

	public static void main(String[] args) {
		//
		
		Window window = new Window();
		window.setWidth(300);
		window.setHeight(300);
		window.setTop(50);
		window.setLeft(100);
		
		System.out.println(window.getTop());

	}

}
