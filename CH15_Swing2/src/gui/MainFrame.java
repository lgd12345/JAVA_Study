package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	// 워닝뜬거지우는거
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);

		MainPanel mainpanel = new MainPanel();

		// 레이아웃설정
		setLayout(new BorderLayout());
		// 패널 생성하여 창의 가운데 붙이기
		// 툴바와 패널
		add(new Toolbar(mainpanel), BorderLayout.NORTH);
		add(mainpanel, BorderLayout.CENTER);

		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
