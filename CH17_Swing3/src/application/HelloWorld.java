package application;

import javax.swing.JFrame;

public class HelloWorld {

	public static void main(String[] args) {
		// JFrame은 위도우창
		JFrame mainFrame = new JFrame(); //새창
		mainFrame.setSize(600,400); //창 사이즈 가로 세로
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창을 종료하면 프로그램종료
		mainFrame.setVisible(true); // 보이게하기

	}

}
