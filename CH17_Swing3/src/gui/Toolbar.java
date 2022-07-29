package gui;

import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JToolBar;


public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainpanel) {
		
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		//여기서 써줌 구현됨
//		redButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				mainpanel.setBackground(Color.RED);
//				
//			}
//		});
		redButton.addActionListener(e -> mainpanel.setBackground(Color.RED));
		blueButton.addActionListener(e -> mainpanel.setBackground(Color.BLUE));
				
		
		add(redButton);
		add(blueButton);
	}
}
