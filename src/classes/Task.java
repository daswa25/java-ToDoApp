package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Task extends JPanel{
	private JLabel index;
	private JTextField taskname;
	private JButton done;
	private boolean checked;
	Task(){
		this.setPreferredSize(new Dimension(60,20));
		this.setBackground(Color.red);
		this.setLayout(new BorderLayout());
		checked=false;
		index =new JLabel("");
		index.setPreferredSize(new Dimension(25,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
		taskname= new JTextField("Your Task Here");
		
		
		taskname.setBorder(BorderFactory.createEmptyBorder());
		taskname. setBackground(Color.lightGray);
		this.add(taskname,BorderLayout.CENTER);
		done =new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		this.add(done,BorderLayout.EAST);
		
		
	}

	public  void  changeIndex(int num ) {
		this.index.setText(num+"");
		this.revalidate();
	}
    public JButton getdone() {
		return done;
	}
	public void changeState() {
		this.setBackground(Color.green);
		checked=true;
	}
	public boolean getState()
	{
		return checked;
	}

}
