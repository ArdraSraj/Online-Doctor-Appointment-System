package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoctorRegistration {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorRegistration window = new DoctorRegistration();
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
	public DoctorRegistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("REGISTRATION PAGE");
		frame.getContentPane().setBackground(UIManager.getColor("Slider.background"));
		frame.setBounds(300, 300, 1000, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(194, 179, 66, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(194, 231, 95, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOCATION");
		lblNewLabel_2.setBounds(194, 285, 81, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblSelectGender = new JLabel("SELECT GENDER");
		lblSelectGender.setBounds(194, 344, 118, 15);
		frame.getContentPane().add(lblSelectGender);
		
		JLabel lblNewLabel_3 = new JLabel("EMAIL ID");
		lblNewLabel_3.setBounds(194, 407, 66, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TIMING");
		lblNewLabel_4.setBounds(194, 543, 66, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CATEGORY");
		lblNewLabel_5.setBounds(194, 474, 95, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblMobileNumber = new JLabel("MOBILE NUMBER");
		lblMobileNumber.setBounds(194, 617, 118, 15);
		frame.getContentPane().add(lblMobileNumber);
		String gender[]={"Male","Female","Others"};
		JComboBox comboBox = new JComboBox(gender);
		comboBox.setBounds(490, 339, 192, 24);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(490, 172, 192, 30);
		frame.getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(490, 610, 192, 30);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(490, 278, 192, 30);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(490, 400, 192, 30);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(490, 467, 192, 30);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(490, 536, 192, 30);
		frame.getContentPane().add(textField_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(490, 224, 192, 30);
		frame.getContentPane().add(passwordField);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Your account created successfully","",JOptionPane.ERROR_MESSAGE);
				
				DoctorLogin info= new DoctorLogin();
				DoctorLogin.main(null);
				
				
			}
		});
		btnRegister.setBackground(Color.YELLOW);
		btnRegister.setBounds(356, 726, 132, 49);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblDoctorRegistration = new JLabel("DOCTOR  REGISTRATION");
		lblDoctorRegistration.setFont(new Font("Abyssinica SIL", Font.BOLD, 50));
		lblDoctorRegistration.setBackground(UIManager.getColor("ScrollBar.trackHighlight"));
		lblDoctorRegistration.setBounds(215, 42, 659, 58);
		frame.getContentPane().add(lblDoctorRegistration);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(UIManager.getColor("Slider.altTrackColor"));
		lblNewLabel_6.setBounds(53, 112, 873, 779);
		frame.getContentPane().add(lblNewLabel_6);
	}
}