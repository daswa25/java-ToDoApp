package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonBar extends JPanel {
 private JButton Addtask;	
 private JButton clear;
 Border emptyBorder=BorderFactory.createEmptyBorder();
 ButtonBar() 
   {
 	 this.setPreferredSize(new Dimension(400,60));
 
 	 Addtask = new JButton("Add Task");
 	 Addtask.setBorder(emptyBorder);
 	 Addtask.setFont(new Font("sans-serif", Font.PLAIN ,15));
 	 this.add (Addtask);
	 this.add(Box.createVerticalStrut(20));
 	 clear = new JButton("clear completed task");
	 clear.setBorder(emptyBorder);
	 clear.setFont(new Font("sans-serif", Font.PLAIN ,15));
	 this.add(clear);
 	 
       }

 public JButton Addtask() {
	 return Addtask;
 }
 public JButton clear() {
	 return clear;
 }
}
