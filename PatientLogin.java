package Login_Sys;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientLogin {

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
					PatientLogin window = new PatientLogin();
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
	public PatientLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PATIENT LOGIN PAGE");
		frame.getContentPane().setBackground(UIManager.getColor("ScrollPane.background"));
		frame.setBounds(300, 300, 1000, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/home/user/Desktop/images.png"));
		label_1.setBounds(314, 170, 324, 147);
		frame.getContentPane().add(label_1);
		
		JTextPane txtpnPatientLogin = new JTextPane();
		txtpnPatientLogin.setText("                   PATIENT  LOGIN");
		txtpnPatientLogin.setFont(new Font("FreeSerif", Font.PLAIN, 24));
		txtpnPatientLogin.setBounds(257, 378, 422, 47);
		frame.getContentPane().add(txtpnPatientLogin);
		
		JLabel lblPatientsName = new JLabel("USER NAME");
		lblPatientsName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPatientsName.setBounds(257, 486, 130, 15);
		frame.getContentPane().add(lblPatientsName);
		
		JLabel label_3 = new JLabel("PASSWORD");
		label_3.setFont(new Font("Dialog", Font.BOLD, 14));
		label_3.setBounds(257, 542, 107, 15);
		frame.getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(463, 484, 216, 25);
		frame.getContentPane().add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(463, 540, 216, 25);
		frame.getContentPane().add(passwordField);
		
		JButton button = new JButton("LOGIN");
		button.setFont(new Font("FreeSerif", Font.BOLD, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		button.setBackground(Color.YELLOW);
		button.setBounds(257, 627, 114, 41);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("REGISTER");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PatientsRegistration info= new PatientsRegistration();
				PatientsRegistration.main(null);
				
				
			}
		});
		button_1.setFont(new Font("FreeSerif", Font.BOLD, 16));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(546, 627, 137, 47);
		frame.getContentPane().add(button_1);
		
		JLabel label = new JLabel("DOCTOR APPOINTMENT");
		label.setFont(new Font("Abyssinica SIL", Font.BOLD, 50));
		label.setBackground(Color.BLACK);
		label.setBounds(147, 41, 630, 58);
		frame.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBackground(UIManager.getColor("Slider.altTrackColor"));
		label_2.setBounds(49, 129, 899, 775);
		frame.getContentPane().add(label_2);
	}
}