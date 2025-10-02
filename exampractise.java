package javaawt;
import java.awt.*;
import java.awt.event.*;
public class exampractise extends Frame implements ActionListener{
	
	TextField t1; Button b1;Label l1;
	exampractise(){
		l1 = new Label("enter your name");
		l1.setBounds(100,50,100,30);
		
		t1 = new TextField();
		t1.setBounds(100,90,200,30);
		
		b1 = new Button("ok");
		b1.setBounds(100,130,60,30);
		b1.addActionListener(this);
		
		setLayout(null);
		
		add(l1);
		add(t1);
		add(b1);
		
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e ) {
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		t1.setText("I am professor alias 'PROFESSOR' ");
	}
	public static void main(String[] args) {
		new exampractise();
	}
}