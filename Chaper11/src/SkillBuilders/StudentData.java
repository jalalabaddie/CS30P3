package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class StudentData {

	private JFrame frame;
	private JTextField txtEnterStudentName;
	private JTextField txtEnterStudentScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentData window = new StudentData();
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
	public StudentData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 287, 155);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		txtEnterStudentName = new JTextField();
		txtEnterStudentName.setText("Enter Student Name:");
		panel.add(txtEnterStudentName);
		txtEnterStudentName.setColumns(10);
		
		txtEnterStudentScore = new JTextField();
		txtEnterStudentScore.setText("Enter Student Score:");
		txtEnterStudentScore.setColumns(10);
		panel.add(txtEnterStudentScore);
	}

	public JTextField getTxtEnterStudentName() {
		return txtEnterStudentName;
	}
	public JTextField getTxtEnterStudentScore() {
		return txtEnterStudentScore;
	}
}
