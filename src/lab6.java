import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;


public class lab6 implements ActionListener{

	JFrame frame;
	JMenuBar menu=new JMenuBar();
	JMenu m1,m2;
	JMenuItem i1,i2,i3;
	JPanel p;
	JLabel l;
	JFileChooser fc=new JFileChooser("Choose File");
	
	public lab6(){
		
		frame = new JFrame("Lab06");
		frame.setLayout(new BorderLayout());
		m1 = new JMenu("File");
		m2=new JMenu("Help");
		i1 = new JMenuItem("Open");
		i2=new JMenuItem("Exit");
		i3=new JMenuItem("About");
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		m1.add(i1);
		m1.add(i2);
		m2.add(i3);
		menu.add(m1);
		menu.add(m2);
		frame.setJMenuBar(menu);
		l=new JLabel("User File Choice");
		p=new JPanel();
		p.add(l);
		frame.getContentPane().add("Center",p);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}
	public static void main(String []args){
		
		new lab6();
	}
	
	public void actionPerformed(ActionEvent a) {
		
		if(a.getSource()==i1) {
			
			int x = fc.showOpenDialog(frame);
			
			File fileName;
			
			if (x == JFileChooser.APPROVE_OPTION) {
				
				fileName=fc.getSelectedFile();
				
		 
				l.setText("File Path: "+ fileName.getPath());
				
				
			}
			
			
			     

			
		}
		
		if(a.getSource()== i2) {
			
			System.exit(0);
		}
		
		if(a.getSource()==i3) {
			
			l.setText("show your name and id");
			
		}
	}
	
}

