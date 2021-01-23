package Login_Sys;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientsReq {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientsReq window = new PatientsReq();
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
	public PatientsReq() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Slider.background"));
		frame.setBounds(300, 300, 1000, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("HOME");
		button.setBackground(Color.YELLOW);
		button.setBounds(73, 167, 114, 51);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				front info= new front();
				front.main(null);
			}});
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("VIEW DOCTORS");
		button_1.setBackground(Color.YELLOW);
		button_1.setBounds(292, 167, 137, 51);
		frame.getContentPane().add(button_1);
		
		
		
		JButton button_3 = new JButton("PATIENTS REQ");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setBackground(Color.YELLOW);
		button_3.setBounds(523, 167, 137, 51);
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
		button_5.setBounds(741, 167, 114, 51);
		frame.getContentPane().add(button_5);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/home/user/Desktop/images.png"));
		label_1.setBounds(343, 230, 376, 207);
		frame.getContentPane().add(label_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("            VIEW PATIENTS BOOKING REQUEST");
		textPane.setFont(new Font("FreeSerif", Font.PLAIN, 24));
		textPane.setBounds(251, 449, 538, 47);
		frame.getContentPane().add(textPane);
		
		table = new JTable();
		table.setBounds(110, 544, 797, 124);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Doctor");
		lblNewLabel.setBounds(168, 555, 72, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("DOCTOR APPOINTMENT");
		label.setFont(new Font("Abyssinica SIL", Font.BOLD, 50));
		label.setBackground(Color.BLACK);
		label.setBounds(225, 46, 630, 58);
		frame.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBackground(UIManager.getColor("Slider.altTrackColor"));
		label_2.setBounds(38, 128, 908, 685);
		frame.getContentPane().add(label_2);
	}
}