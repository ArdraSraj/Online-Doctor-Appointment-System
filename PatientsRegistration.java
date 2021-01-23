package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientsRegistration {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientsRegistration window = new PatientsRegistration();
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
	public PatientsRegistration() {
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
		
		JLabel lblPatientsRegistration = new JLabel("PATIENTS REGISTRATION");
		lblPatientsRegistration.setFont(new Font("Abyssinica SIL", Font.BOLD, 50));
		lblPatientsRegistration.setBounds(156, 48, 670, 64);
		frame.getContentPane().add(lblPatientsRegistration);
		
		JLabel label = new JLabel("NAME");
		label.setBounds(233, 182, 66, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("PASSWORD");
		label_1.setBounds(233, 230, 95, 15);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("EMAIL ID");
		lblNewLabel.setBounds(233, 275, 66, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DOB");
		lblNewLabel_1.setBounds(233, 327, 66, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setBounds(233, 380, 66, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MOBILE NUMBER");
		lblNewLabel_3.setBounds(233, 443, 126, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(417, 180, 200, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(417, 273, 200, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(417, 325, 200, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(417, 428, 200, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setBounds(233, 490, 66, 15);
		frame.getContentPane().add(lblAddress);
		
		textField_6 = new JTextField();
		textField_6.setBounds(417, 488, 200, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
        JOptionPane.showMessageDialog(null,"Your account created successfully","",JOptionPane.ERROR_MESSAGE);
				
				PatientLogin info= new PatientLogin();
				PatientLogin.main(null);
				
				
			}
		});
		btnRegister.setBackground(Color.YELLOW);
		btnRegister.setBounds(314, 575, 114, 39);
		frame.getContentPane().add(btnRegister);
		String gender[]= {"Male","Female","Others"};
		JComboBox comboBox = new JComboBox(gender);
		comboBox.setBounds(417, 380, 200, 24);
		frame.getContentPane().add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setText("");
		passwordField.setBounds(417, 230, 200, 19);
		frame.getContentPane().add(passwordField);
		
		JButton button = new JButton("BACK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				PatientLogin info= new PatientLogin();
				PatientLogin.main(null);
				
				
			}
		});
		button.setBackground(Color.YELLOW);
		button.setBounds(549, 575, 127, 39);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(UIManager.getColor("Slider.altTrackColor"));
		label_2.setOpaque(true);
		label_2.setBounds(67, 125, 854, 841);
		frame.getContentPane().add(label_2);
		
	
	}
}