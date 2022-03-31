package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tittlebar extends JPanel {
	
	Tittlebar()
	{
	 this.setPreferredSize(new Dimension(400,90));
	
	 JLabel titleText= new  JLabel("To Do List");
	 titleText.setPreferredSize(new Dimension(200,80));
	 titleText.setFont( new Font("Felix Titling",Font.BOLD,20));
	 titleText.setHorizontalAlignment(JLabel.CENTER);
	 this.add(titleText);
	
	 
	}	
}

