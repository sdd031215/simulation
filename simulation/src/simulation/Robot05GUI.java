package simulation;

/** 
* Robot05GUI.java 
* create by kin. 2004/11/07. 
* Please enjoy this. 
*/ 
import javax.swing.*; 
import javax.swing.event.*; 

import java.awt.event.*; 
import java.awt.*; 

//可以启动windows的notepad程序，并输入 hello world 。 
/**Robot05's GUI version.*/ 
public class Robot05GUI extends JFrame { 

	private JButton b = new JButton("Start Notepad and input \"Hello World\""); 

	public Robot05GUI() { 
		super("Start Notepad and input \"Hello World\""); 
		getContentPane().add(b,BorderLayout.CENTER); 
		b.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				try { 
					new Robot05().main(new String[]{}); 
				} catch (Exception ex) { 
					ex.printStackTrace(); 
				} 
			} 
		}); 
	} 

	public static void main(String[] args) { 
		Robot05GUI r = new Robot05GUI(); 
		r.setSize(200,200); 
		r.setVisible(true); 
	} 
} 