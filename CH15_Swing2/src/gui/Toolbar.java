package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorListener implements ActionListener{
	
	private MainPanel mainpaner;
	private Color color;
	
	public ColorListener(MainPanel mainpaner, Color color) {
		this.mainpaner = mainpaner;
		this.color = color;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		mainpaner.setBackground(color);	
	}
}

public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainpanel) {
		
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		//여기서 써줌 구현됨
		redButton.addActionListener(new ColorListener(mainpanel,Color.RED));
		blueButton.addActionListener(new ColorListener(mainpanel,Color.BLUE));
		
		add(redButton);
		add(blueButton);
	}
}
