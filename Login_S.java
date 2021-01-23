package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Login_S {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ADMIN LOGIN PAGE");
		frame.getContentPane().setBackground(UIManager.getColor("Slider.background"));
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 30));
		frame.setBounds(300, 300, 1000, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN LOGIN");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Abyssinica SIL", Font.BOLD, 48));
		lblNewLabel.setBounds(343, 24, 386, 56);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("FreeSerif", Font.BOLD, 18));
		lblUsername.setBounds(280, 176, 137, 15);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("FreeSerif", Font.BOLD, 18));
		lblPassword.setBounds(282, 283, 81, 19);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(548, 168, 257, 33);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(548, 277, 257, 33);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.YELLOW);
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=txtPassword.getText();
				String username=txtUsername.getText();
				if(password.contentEquals("king") && username.contentEquals("one")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					
					admin info= new admin();
					admin.main(null);
					
					
					
					
			}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid login details","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
				
			}
		});
		btnLogin.setBounds(165, 435, 121, 55);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.YELLOW);
		btnReset.setFont(new Font("Dialog", Font.BOLD, 18));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtUsername.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnReset.setBounds(492, 438, 114, 49);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.YELLOW);
		btnExit.setFont(new Font("Dialog", Font.BOLD, 18));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem,"Confirm if you want to exit","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setBounds(782, 435, 114, 55);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(221, 376, 601, 15);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 92, 576, -5);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(UIManager.getColor("Slider.altTrackColor"));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(74, 92, 859, 814);
		frame.getContentPane().add(lblNewLabel_1);
	}
}