package classes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBarC  extends JPanel{
	TitleBarC(){
		
		this.setPreferredSize(new Dimension(400,90));
		JLabel Titletext= new JLabel("Daswa's To Do List");
		Titletext.setPreferredSize(new Dimension(200,80));
		Titletext.setFont(new Font ("flex titling",Font.ITALIC,20));
		Titletext.setHorizontalAlignment(JLabel.CENTER);
		this.add(Titletext);
		
	}
	

}
