import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Demo30P3 {

	private JFrame frame;
	private JTextField Ln;
	private JTextField Fn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo30P3 window = new Demo30P3();
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
	public Demo30P3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		
		ImageIcon chhs = new ImageIcon("../Chaper10/src/SkillBuilders/Crescent.png");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 549, 514);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Ln = new JTextField();
		Ln.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
			
				if(Ln.getText().equals("Last Name"))
					Ln.setText("");
			
			
			
			
			}
		});
		Ln.setForeground(new Color(192, 192, 192));
		Ln.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Ln.setText("Last Name");
		Ln.setBounds(186, 30, 110, 32);
		panel.add(Ln);
		Ln.setColumns(10);
		
		Fn = new JTextField();
		Fn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
			
			if(Fn.getText().equals("First Name"))
					Fn.setText("");
			
			
			
			
			}
		});
		Fn.setForeground(new Color(192, 192, 192));
		Fn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Fn.setText("First Name");
		Fn.setColumns(10);
		Fn.setBounds(32, 30, 119, 32);
		panel.add(Fn);
		
		JComboBox grades = new JComboBox();
		grades.setForeground(new Color(0, 128, 255));
		grades.setFont(new Font("Tahoma", Font.PLAIN, 17));
		grades.setModel(new DefaultComboBoxModel(new String[] {"Select Grade Level", "12", "11", "10"}));
		grades.setBounds(32, 112, 170, 32);
		panel.add(grades);
		
		JComboBox School = new JComboBox();
		School.setModel(new DefaultComboBoxModel(new String[] {"Select School ", "Crescent Heights", "James Fowler ", "Lester B. Pearson"}));
		School.setForeground(new Color(0, 128, 255));
		School.setFont(new Font("Tahoma", Font.PLAIN, 17));
		School.setBounds(225, 112, 129, 32);
		panel.add(School);
		
		JTextArea imga = new JTextArea();
		imga.setBackground(new Color(240, 240, 240));
		imga.setForeground(new Color(0, 0, 255));
		imga.setBounds(64, 294, 422, 209);
		panel.add(imga);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				String grade ="";
				String school ="";
			
			String firstN = Fn.getText();
			String lastN = Ln.getText();
			
			
			if(grades.getSelectedItem().equals("12")) {
				grade = "12";
			}
			else if(grades.getSelectedItem().equals("11")) {
			}
			else
			{
				grade = "10";
			}
			
			
			if(School.getSelectedItem().equals("Crescent Heights")) 
			{
				school = "Crescent Heights";
				
				
			}
			
			else if(School.getSelectedItem().equals("James Fowler")) 
			{
				school = "James Fowler";
			}
			else
			{
				school = "Lester B. Pearson";
			}
			
			
			
			
			
			
			imga.setText(firstN + " " + lastN
					+ " is in grade " + grade 
					+ " and goes to " + school);
			}
		});
		Submit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		Submit.setBounds(427, 38, 106, 245);
		panel.add(Submit);
		
		JLabel lblNewLabel = new JLabel("jlabel");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(156, 332, 46, 14);
		panel.add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setForeground(Color.BLUE);
		textArea_1.setBackground(UIManager.getColor("Button.background"));
		textArea_1.setBounds(32, 155, 383, 128);
		panel.add(textArea_1);
	}
}
