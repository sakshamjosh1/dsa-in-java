import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing{
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Page");
        f.setVisible(true);
        f.setSize(350,200);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Username");
        JTextField tf1 = new JTextField(20);
        f.add(l1);
        f.add(tf1);

        JLabel l2 = new JLabel("Password");
        JPasswordField tf2 = new JPasswordField(20);
        f.add(l2);
        f.add(tf2);

        JButton b = new JButton("Submit");
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String username = tf1.getText();
                String password = new String(tf2.getPassword());
                if (username.equals("admin") && password.equals("1234")){
                    JOptionPane.showMessageDialog(f, "Login Successful");
                } else{
                    JOptionPane.showMessageDialog(f, "Invalid Credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
    }
    
}
