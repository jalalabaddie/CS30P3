package SkillBuilders;


import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.Font;

public class semesterAvg extends JFrame {
    private JTextField grade1Input, grade2Input, grade3Input, showAverage;
    private JButton submitBut;

    public semesterAvg() {
        setTitle("Semester Average");
        setSize(419, 263);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel grade1 = new JLabel("Enter the first grade:");
        grade1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        grade1.setBounds(20, 20, 150, 25);
        getContentPane().add(grade1);

        grade1Input = new JTextField(5);
        grade1Input.setBounds(219, 22, 100, 25);
        getContentPane().add(grade1Input);

        JLabel grade2 = new JLabel("Enter the second grade:");
        grade2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        grade2.setBounds(20, 50, 178, 25);
        getContentPane().add(grade2);

        grade2Input = new JTextField(5);
        grade2Input.setBounds(219, 52, 100, 25);
        getContentPane().add(grade2Input);

        JLabel grade3 = new JLabel("Enter the third grade:");
        grade3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        grade3.setBounds(20, 80, 178, 25);
        getContentPane().add(grade3);

        grade3Input = new JTextField(5);
        grade3Input.setBounds(221, 82, 98, 25);
        getContentPane().add(grade3Input);

        
        submitBut = new JButton("Submit");
        
        submitBut.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
        
        submitBut.setBounds(70, 144, 100, 25);
        getContentPane().add(submitBut);

        showAverage = new JTextField(10);
        showAverage.setBounds(201, 146, 86, 23);
        showAverage.setEditable(false);
        getContentPane().add(showAverage);

        DecimalFormat df = new DecimalFormat("0.00");
        
        submitBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double g1 = Double.parseDouble(grade1Input.getText());
                
                double g2 = Double.parseDouble(grade2Input.getText());
                double g3 = Double.parseDouble(grade3Input.getText());

                double avg = (g1 + g2 + g3) / 3;

                showAverage.setText(Double.toString(avg));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new semesterAvg();
    }
}









