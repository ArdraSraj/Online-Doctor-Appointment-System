package Login_Sys;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTextPane;


public class front {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					front window = new front();
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
	public front() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("HOME");
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setBackground(UIManager.getColor("Slider.background"));
		frame.setBounds(300, 300, 1000, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDoctorAppointment = new JLabel("DOCTOR APPOINTMENT");
		lblDoctorAppointment.setBounds(213, 35, 630, 58);
		lblDoctorAppointment.setBackground(Color.BLACK);
		lblDoctorAppointment.setFont(new Font("Abyssinica SIL", Font.BOLD, 50));
		frame.getContentPane().add(lblDoctorAppointment);
		
		
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.setBounds(104, 214, 191, 58);
		btnAdmin.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		btnAdmin.setForeground(SystemColor.activeCaptionText);
		btnAdmin.setBackground(Color.YELLOW);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_S info= new Login_S();
				Login_S.main(null);
				
				
				
			}
		});
		frame.getContentPane().add(btnAdmin);
		
		JButton btnDoctor = new JButton("DOCTOR");
		btnDoctor.setBounds(418, 214, 206, 58);
		btnDoctor.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		btnDoctor.setForeground(Color.BLACK);
		btnDoctor.setBackground(Color.YELLOW);
		btnDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			DoctorLogin	 info= new DoctorLogin();
				DoctorLogin.main(null);
			}});
				
		frame.getContentPane().add(btnDoctor);
		
		JButton btnPatient = new JButton("PATIENT");
		btnPatient.setBounds(738, 214, 173, 58);
		btnPatient.setBackground(Color.YELLOW);
		btnPatient.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientLogin info= new PatientLogin();
				PatientLogin.main(null);
			}});
				
		frame.getContentPane().add(btnPatient);
		
		
		
		JTextPane txtpn = new JTextPane();
		txtpn.setBackground(new Color(238, 238, 238));
		txtpn.setFont(new Font("Bitstream Charter", Font.PLAIN, 26));
		txtpn.setText("WELCOME TO ONLINE DOCTOR APPOINTMENT");
		txtpn.setBounds(215, 554, 603, 51);
		frame.getContentPane().add(txtpn);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/user/Desktop/images.png"));
		label.setBounds(362, 348, 301, 132);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(UIManager.getColor("Slider.altTrackColor"));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(61, 117, 884, 815);
		frame.getContentPane().add(lblNewLabel);
	}
}