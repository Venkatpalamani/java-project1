package javaawt;
import java.awt.*;
import java.awt.event.*;

// 1st step
public class actionlistener extends Frame implements ActionListener {

    TextField tf;  // instance variable

    // Constructor
    actionlistener() {
        super("ActionListener Example"); // Set frame title

        // Create components
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);

        // Add ActionListener
        b.addActionListener(this);

        // Add components to frame
        add(tf);
        add(b);

        // Frame settings
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // 3rd step
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to Java.");
    }

    public static void main(String[] args) {
        new actionlistener();
    }
}
