import javax.swing.*;
import java.awt.FlowLayout;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(800,400);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Username");  //First Label l1
        f.add(l1);
        JTextField tf1 = new JTextField(20);
        f.add(tf1);

        JLabel l2 = new JLabel("Password");
        f.add(l2);
        JTextField tf2 = new JTextField(20);
        f.add(tf2);

        JButton b = new JButton("Submit");
        f.add(b);
    }
}
