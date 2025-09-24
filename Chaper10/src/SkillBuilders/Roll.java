package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll window = new Roll();
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
	public Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon d1 = new ImageIcon("../Chaper10/src/SkillBuilders/die1.gif");
		ImageIcon d2 = new ImageIcon("../Chaper10/src/SkillBuilders/die2.gif");
		ImageIcon d3 = new ImageIcon("../Chaper10/src/SkillBuilders/die3.gif");
		ImageIcon d4 = new ImageIcon("../Chaper10/src/SkillBuilders/die4.gif");
		ImageIcon d5 = new ImageIcon("../Chaper10/src/SkillBuilders/die5.gif");
		ImageIcon d6 = new ImageIcon("../Chaper10/src/SkillBuilders/die6.gif");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 425, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 402, 367);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dieFace = new JLabel("");
		dieFace.setBounds(74, 77, 154, 134);
		panel.add(dieFace);
		
		JLabel dieFace2 = new JLabel("");
		dieFace2.setBounds(215, 85, 154, 126);
		panel.add(dieFace2);
		
		JButton rolldie = new JButton("ROLL\r\n");
		rolldie.setBackground(new Color(0, 255, 64));
		rolldie.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 23));
		rolldie.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1)
				{
					dieFace.setIcon(d1);
				}
				else if(newRoll == 2)
				{
					dieFace.setIcon(d2);
				}
				else if(newRoll == 3)
				{
					dieFace.setIcon(d3);
				}
				else if(newRoll == 4)
				{
					dieFace.setIcon(d4);
				}
				else if(newRoll == 5)
				{
					dieFace.setIcon(d5);
				}
				else if(newRoll == 6)
				{
					dieFace.setIcon(d6);
				}
				
				newRoll2 = (int)(6 * Math.random() + 1);
				
				if(newRoll2 == 1)
				{
					dieFace2.setIcon(d1);
				}
				else if(newRoll2 == 2)
				{
					dieFace2.setIcon(d2);
				}
				else if(newRoll2 == 3)
				{
					dieFace.setIcon(d3);
				}
				else if(newRoll == 4)
				{
					dieFace2.setIcon(d4);
				}
				else if(newRoll2 == 5)
				{
					dieFace2.setIcon(d5);
				}
				else if(newRoll2 == 6)
				{
					dieFace2.setIcon(d6);
				}
				
				
			}
		});
		rolldie.setBounds(40, 269, 344, 61);
		panel.add(rolldie);
		
		
		
		
	}
}