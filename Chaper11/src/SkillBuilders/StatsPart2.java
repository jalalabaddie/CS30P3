package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StatsPart2 {

	private JFrame frame;
	private JTextField FileNameField;
	private JTextField NumStudentsField;
	StudentData inputDialog = new StudentData(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatsPart2 window = new StatsPart2();
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
	public StatsPart2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 627, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		FileNameField = new JTextField();
		FileNameField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(FileNameField.getText().equals("Enter Number Of Students Here: "))
				
				FileNameField.setText("");
			}
		});
		FileNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			}
		});
		FileNameField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		FileNameField.setText("Enter File Name Here:");
		FileNameField.setBounds(27, 119, 337, 41);
		panel.add(FileNameField);
		FileNameField.setColumns(10);
		
		NumStudentsField = new JTextField();
		NumStudentsField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(NumStudentsField.getText().equals("Enter Number Of Students Here: ")){
					
				}
				
			NumStudentsField.setText("");
			}
			
		});
		NumStudentsField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		NumStudentsField.setText("Enter Number Of Students Here:");
		NumStudentsField.setColumns(10);
		NumStudentsField.setBounds(27, 182, 337, 41);
		panel.add(NumStudentsField);
		
		JButton CDF = new JButton("Create Data File");
		CDF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String FileName = FileNameField.getText().trim();
				String NumStudents = NumStudentsField.getText().trim();
				
				if(FileName.isEmpty() || NumStudents.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please Enter both file name and number of students" ,
							"Input Error", JOptionPane.WARNING_MESSAGE); 
							
				}
				try
				{
					int numstu = Integer.parseInt(NumStudents);
					
					StringBuilder studentdata = new StringBuilder();
					
					for(int i =0; i < numstu; i++)
					{
						int result = JOptionPane.showConfirmDialog(null, inputDialog,
								"Enter Data for Student"+ (i + 1),
								JOptionPane.OK_CANCEL_OPTION);
						
						if (result !=JOptionPane.OK_OPTION)
					{
						break;
					}
					
					String stuName = inputDialog.getTxtEnterStudentName().getText().trim();
					String score = inputDialog.getTxtEnterStudentScore().getText().trim();
					
					if(stuName.isEmpty() || score.isEmpty())
					{
						JOptionPane.showMessageDialog(null,"Please Enter both name and score for student "+ (i + 1)
								"Input Error", JOptionPane.WARNING_MESSAGE); 
					}
					}
				}
				
					
		});
		
		CDF.setFont(new Font("Times New Roman", Font.BOLD, 14));
		CDF.setBounds(374, 120, 157, 40);
		panel.add(CDF);
		
		JButton AnalyzeScores = new JButton("Analyze Scores");
		AnalyzeScores.setFont(new Font("Times New Roman", Font.BOLD, 14));
		AnalyzeScores.setBounds(374, 184, 157, 39);
		panel.add(AnalyzeScores);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBackground(new Color(240, 240, 240));
		textArea.setBounds(51, 261, 457, 223);
		panel.add(textArea);
	}
}}
