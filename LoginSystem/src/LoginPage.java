import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.util.HashMap;

public class LoginPage implements ActionListener{

	JFrame frame = new JFrame(); 
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userJPasswordField = new JPasswordField();
	JLabel userIDJLabel = new JLabel("userID");
	JLabel userPassJLabel = new JLabel("Password");
	JLabel messageLable = new JLabel("Test");
	
	
	
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	 LoginPage(HashMap<String, String> loginInfoOriginal){
		 
		 loginInfo = loginInfoOriginal;
		 
		 userIDJLabel.setBounds(50,100,75,25);
		 userPassJLabel.setBounds(50,150,75,25);
		 
		 messageLable.setBounds(125,255,250,35);
		 messageLable.setFont(new Font( null,Font.ITALIC,25));
		 
		 userIDField.setBounds(125,100,200,25);
		 userJPasswordField.setBounds(125,150,200,25);

		 
		 loginButton.setBounds(125,200,100,25);
		 loginButton.addActionListener(this);
		 
		 resetButton.setBounds(225,200,100,25);
		 resetButton.addActionListener(this);
		 
		 frame.add(messageLable);
		 frame.add(userIDField);
		 frame.add(userIDJLabel);
		 frame.add(userPassJLabel);
		 frame.add(userJPasswordField);
		 frame.add(loginButton);
		 frame.add(resetButton);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(420,420);
		 frame.setLayout(null);
		 frame.setVisible(true);
		 
		 
		 
		 
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 
		 if (e.getSource()==resetButton) {
			userIDField.setText("");
			userJPasswordField.setText("");

		}
		 
		 if (e.getSource()==loginButton) {
			 String userID = userIDField.getText();
			 String password = String.valueOf(userJPasswordField.getPassword());
			 
			 if(loginInfo.containsKey(userID)) {
				 if(loginInfo.get(userID).equals(password)) {
					 messageLable.setForeground(Color.green);
					 messageLable.setText("login");
					 frame.dispose();
					 WelcomePage welcomePage = new WelcomePage(userID);
					 
				 }
				 else {
					 messageLable.setForeground(Color.red);
					 messageLable.setText("Wrong Password");
				}
			 }
			 else {
				messageLable.setForeground(Color.red);
				messageLable.setText("Invalid ID");
			}
			 
			
		}
	 }
}
