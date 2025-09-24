package SkillBuilders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MetricConversion extends JFrame {
    private JComboBox<String> conversionBox;
    private JLabel resultLabel;

    public MetricConversion() {
       
    	super("MetricConversion");
        setSize(431, 255);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] conversions = {
            "inches to centimeters",
            "feet to meters",
            "gallons to liters",
            "pounds to kilograms"
        };

        conversionBox = new JComboBox<>(conversions);
        conversionBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
        conversionBox.setBounds(206, 51, 193, 20);
        getContentPane().setLayout(null);
        JLabel selectConv = new JLabel("Select a conversion type:");
        selectConv.setFont(new Font("Tahoma", Font.PLAIN, 17));
        selectConv.setBounds(11, 44, 200, 35);
        getContentPane().add(selectConv);
        getContentPane().add(conversionBox);

        resultLabel = new JLabel("Results:");
        resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        resultLabel.setBounds(118, 100, 223, 20);
        getContentPane().add(resultLabel);

        conversionBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String choice = (String) conversionBox.getSelectedItem();
                switch (choice) {
                  
                case "inches to centimeters":
                        resultLabel.setText("1 inch = 2.54 centimeters");
                        break;
                    case "feet to meters":
                        resultLabel.setText("1 foot = 0.3048 meters");
                        break;
                    case "gallons to liters":
                        resultLabel.setText("1 gallon = 4.5461 liters");
                        break;
                    case "pounds to kilograms":
                        resultLabel.setText("1 pound = 0.4536 kilograms");
                        break;
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MetricConversion();
    }
}

