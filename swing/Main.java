import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{
    public static void main(String[] args){
        JFrame f = new JFrame("Login Page");
	f.setVisible(true);
	f.setSize(300,500);
	f.setLayout(new FlowLayout());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JLabel l1 = new JLabel("Username");
	JTextField tf = new JTextField(20);
	f.add(l1);
	f.add(tf);
	
	JLabel l2 = new JLabel("Password");
	JPasswordField pf = new JPasswordField(20);
	f.add(l2);
	f.add(pf);
	

	JButton b = new JButton("Submit");
	f.add(b);
	
	b.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e){
	    String username = tf.getText();
	    String password = new String(pf.getPassword());
	    
	    if(username.equals("admin") && password.equals("1234")){
		JOptionPane.showMessageDialog(f, "Successfully Executed");
	    } else {
		JOptionPane.showMessageDialog(f, "Incorrect Credentials", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	   }
	});
    }
}
	