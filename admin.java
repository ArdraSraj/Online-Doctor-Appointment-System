package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTextPane;

public class admin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin window = new admin();
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
	public admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ADMIN PROFILE");
		frame.getContentPane().setBackground(UIManager.getColor("Slider.altTrackColor"));
		frame.setBounds(300, 300, 1000, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(164, 72, 620, 16);
		frame.getContentPane().add(separator);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setBackground(Color.YELLOW);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				front info=new front();
				front.main(null);
			}
		});
		btnHome.setBounds(27, 119, 108, 58);
		frame.getContentPane().add(btnHome);
		
		JButton btnPatientsReq = new JButton("PATIENTS REQ");
		btnPatientsReq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PatientsReq info=new PatientsReq();
				PatientsReq.main(null);
				
			}
		});
		btnPatientsReq.setBackground(Color.YELLOW);
		btnPatientsReq.setBounds(284, 119, 146, 58);
		frame.getContentPane().add(btnPatientsReq);
		
		JButton btnDoctorsReq = new JButton("DOCTORS REQ");
		btnDoctorsReq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DoctorsReq info=new DoctorsReq();
				DoctorsReq.main(null);
			}
		});
		btnDoctorsReq.setBackground(Color.YELLOW);
		btnDoctorsReq.setBounds(565, 119, 146, 58);
		frame.getContentPane().add(btnDoctorsReq);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				if(JOptionPane.showConfirmDialog(null,"Do you want to logout?","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				}
				
				JOptionPane.showMessageDialog(null,"You have successfully logedout","",JOptionPane.ERROR_MESSAGE);
				
				front info= new front();
				front.main(null);
				
				
				
			}
		});
		btnLogout.setBackground(Color.YELLOW);
		btnLogout.setBounds(848, 119, 127, 58);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/user/Desktop/images.png"));
		lblNewLabel.setBounds(347, 215, 298, 176);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnWelcomeAdmin = new JTextPane();
		txtpnWelcomeAdmin.setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		txtpnWelcomeAdmin.setFont(new Font("Bitstream Charter", Font.BOLD, 28));
		txtpnWelcomeAdmin.setText("            WELCOME ADMIN");
		txtpnWelcomeAdmin.setBounds(284, 440, 433, 58);
		frame.getContentPane().add(txtpnWelcomeAdmin);
		
		JLabel label = new JLabel("DOCTOR APPOINTMENT");
		label.setFont(new Font("Abyssinica SIL", Font.BOLD, 50));
		label.setBackground(Color.BLACK);
		label.setBounds(185, 12, 630, 58);
		frame.getContentPane().add(label);
	}
}
