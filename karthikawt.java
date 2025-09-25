package javaawt;
import java.awt.*;
import java.awt.event.*;
public class karthikawt extends Frame {
	karthikawt(){
	Label l = new Label("welcome");
	Button b = new Button("ok");
	setLayout(new FlowLayout());
	
	add(l);
	add(b);
	
	setSize(300,300);
	setVisible(true);
	
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	}
	public static void main(String[] args) {
		karthikawt obj = new karthikawt();
	}
}