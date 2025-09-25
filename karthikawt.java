package javaawt;
import java.awt.*;
import java.awt.event.*;
public class karthikawt extends Frame {
	karthikawt(){
		Label lb = new Label("click on Download to continue");
		Button bt = new Button("DOWNLOAD");
		
		setLayout(new FlowLayout());
		
		add(lb);
		add(bt);
		
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