package javaawt;

import java.awt.*;
import java.awt.event.*;

public class awtexample2 extends Frame implements ActionListener{
	Button b1; Label l1; TextField t1;
	Button b2; Label l2; TextField t2;
	Button b3; Label l3; TextField t3;
	Button b4; Label l4; TextField t4;
	awtexample2(){
		l1 = new Label("enter your reg no");
		l1.setBounds(50,50,100,30);
		t1 = new TextField();
		t1.setBounds(50,90,100,30);
		b1 = new Button();
		b1.setBounds(50,130,100,30);
		b1.addActionListener(this);
		add(l1);
		add(t1);
		add(b1);
		
		l2 = new Label("enter your name");
		l2.setBounds(50,170,100,25);
		t2 = new TextField();
		t2.setBounds(50,210,100,25);
		b2 = new Button();
		b2.setBounds(50,250,100,25);
		b2.addActionListener(this);
		add(l2);
		add(t2);
		add(b2);
		
		l3 = new Label("enter your age");
		l3.setBounds(50,290,100,25);
		t3 = new TextField();
		t3.setBounds(50,330,100,25);
		b3 = new Button();
		b3.setBounds(50,370,100,25);
		b3.addActionListener(this);
		add(l3);
		add(t3);
		add(b3);
		
		l4 = new Label("enter your class");
		l4.setBounds(50,410,100,25);
		t4 = new TextField();
		t4.setBounds(50,450,100,25);
		b4 = new Button();
		b4.setBounds(50,490,100,25);
		b4.addActionListener(this);
		add(l4);
		add(t4);
		add(b4);
		
		setLayout(null);
		setSize(600,600);
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			t1.setText("99240040339");
		}
		else if(e.getSource() == b2) {
			t2.setText("p.venkata karthik");
		}
		else if(e.getSource() == b3) {
			t3.setText("21");
		}
		else if(e.getSource() == b4) {
			t4.setText("b-tech 2nd year");
		}
	}
	
	public static void main(String[] args) {
		new awtexample2();
		
	}
	
}






































































