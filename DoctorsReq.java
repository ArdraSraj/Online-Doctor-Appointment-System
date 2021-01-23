package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTable;

public class DoctorsReq {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorsReq window = new DoctorsReq();
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
	public DoctorsReq() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("ScrollBar.track"));
		frame.setBounds(300, 300, 1000, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnViewDoctorsBooking = new JTextPane();
		txtpnViewDoctorsBooking.setText("            VIEW DOCTORS BOOKING REQUEST");
		txtpnViewDoctorsBooking.setFont(new Font("FreeSerif", Font.PLAIN, 24));
		txtpnViewDoctorsBooking.setBounds(254, 463, 538, 47);
		frame.getContentPane().add(txtpnViewDoctorsBooking);
		
		JButton button = new JButton("HOME");
		button.setBackground(Color.YELLOW);
		button.setBounds(123, 179, 114, 38);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				front info= new front();
				front.main(null);
			}});
		frame.getContentPane().add(button);		
		
		
		
		JButton button_2 = new JButton("VIEW PATIENTS");
		button_2.setBackground(Color.YELLOW);
		button_2.setBounds(310, 179, 137, 38);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("PATIENTS REQ");
		button_3.setBackground(Color.YELLOW);
		button_3.setBounds(530, 179, 137, 38);
		frame.getContentPane().add(button_3);
		
		
		
		JButton button_5 = new JButton("LOGOUT");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				if(JOptionPane.showConfirmDialog(null,"Do you want to logout?","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				}
				
    JOptionPane.showMessageDialog(null,"You have successfully logedout","",JOptionPane.ERROR_MESSAGE);
				
				front info= new front();
				front.main(null);
				
				
			}
		});
		button_5.setBackground(Color.YELLOW);
		button_5.setBounds(753, 179, 114, 38);
		frame.getContentPane().add(button_5);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/home/user/Desktop/images.png"));
		label_1.setBounds(354, 253, 313, 164);
		frame.getContentPane().add(label_1);
		
		table = new JTable();
		table.setBounds(127, 561, 762, 239);
		frame.getContentPane().add(table);
		
		JLabel label = new JLabel("DOCTOR APPOINTMENT");
		label.setFont(new Font("Abyssinica SIL", Font.BOLD, 50));
		label.setBackground(Color.BLACK);
		label.setBounds(173, 57, 630, 58);
		frame.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(UIManager.getColor("Slider.altTrackColor"));
		label_2.setOpaque(true);
		label_2.setBounds(64, 126, 876, 720);
		frame.getContentPane().add(label_2);
	}
}