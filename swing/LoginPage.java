// File: sDemo.java
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
public class LoginPage {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(350, 200);                            // Set frame size
        f.setLayout(new FlowLayout());               // Set layout manager
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        


        JLabel l1=new JLabel("Username:"); // Create a label
        f.add(l1); // Add label to the frame
        JTextField t1=new JTextField(20); 
        f.add(t1); 

        JLabel l2=new JLabel("Password:"); 
        f.add(l2);
        JPasswordField t2=new JPasswordField(20); 
        f.add(t2);

        JButton b1=new JButton("Submit"); // Create a button
        f.add(b1); // Add button to the frame

          //  Add action to the button
          b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = t1.getText();
                String password = new String(t2.getPassword());

                // Example check (hardcoded)
                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(f, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid Credentials!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
    }
    
}