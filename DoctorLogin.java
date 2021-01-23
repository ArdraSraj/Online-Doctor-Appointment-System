package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoctorLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorLogin window = new DoctorLogin();
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
	public DoctorLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("DOCTOR LOGIN PAGE");
		frame.getContentPane().setBackground(UIManager.getColor("Slider.background"));
		frame.setBounds(300, 300, 1000, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JTextPane txtpnDoctorLogin = new JTextPane();
		txtpnDoctorLogin.setText("                   DOCTOR  LOGIN");
		txtpnDoctorLogin.setFont(new Font("FreeSerif", Font.PLAIN, 24));
		txtpnDoctorLogin.setBounds(297, 393, 422, 47);
		frame.getContentPane().add(txtpnDoctorLogin);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/home/user/Desktop/images.png"));
		label_1.setBounds(353, 173, 276, 147);
		frame.getContentPane().add(label_1);
		
		JLabel lblDoctorName = new JLabel("DOCTOR NAME");
		lblDoctorName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDoctorName.setBounds(308, 495, 130, 15);
		frame.getContentPane().add(lblDoctorName);
		
		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(308, 544, 107, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(514, 493, 216, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(514, 539, 216, 25);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("FreeSerif", Font.BOLD, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Invalid login details","Login Error",JOptionPane.ERROR_MESSAGE);
				passwordField.setText(null);
				textField.setText(null);
		
				
			}
		});
		btnLogin.setBackground(Color.YELLOW);
		btnLogin.setBounds(325, 621, 137, 58);
		frame.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DoctorRegistration info= new DoctorRegistration();
				DoctorRegistration.main(null);
				
				
			}
		});
		btnRegister.setBackground(Color.ORANGE);
		btnRegister.setFont(new Font("FreeSerif", Font.BOLD, 16));
		btnRegister.setBounds(568, 621, 137, 58);
		frame.getContentPane().add(btnRegister);
		
		JLabel label_2 = new JLabel("DOCTOR APPOINTMENT");
		label_2.setFont(new Font("Abyssinica SIL", Font.BOLD, 50));
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(166, 50, 630, 58);
		frame.getContentPane().add(label_2);
		
		JLabel lblL = new JLabel("");
		lblL.setBackground(UIManager.getColor("Slider.altTrackColor"));
		lblL.setOpaque(true);
		lblL.setBounds(64, 120, 857, 786);
		frame.getContentPane().add(lblL);
	}
}