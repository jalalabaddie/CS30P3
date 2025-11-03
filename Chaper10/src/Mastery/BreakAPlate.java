package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class BreakAPlate extends JFrame implements ActionListener {
    
	private JLabel plateLabel;//shows the plates
	
   
	private JLabel prizeLabel; //shows the prize images
   
    private JLabel messageLabel; //"You Win" Message shows up
   
    private JButton playButton;  //play/playagain button or reset
    
    //images of the plates and prizes
    private ImageIcon plates;
   
    private ImageIcon platesTwoBroken;
    
    private ImageIcon platesAllBroken;
   
    private ImageIcon sticker;
    
    private ImageIcon tiger;
   
    private ImageIcon placeholder;
  
    private JPanel panel;

    public BreakAPlate() {
    	setBackground(new Color(128, 255, 255));
        setTitle("BreakAPlate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (adjust paths if needed)
        plates = new ImageIcon("../Chaper10/src/Mastery/plates.gif");
       
        platesTwoBroken = new ImageIcon("../Chaper10/src/Mastery/plates_two_broken.gif");
       
        platesAllBroken = new ImageIcon("../Chaper10/src/Mastery/plates_all_broken.gif");
       
        sticker = new ImageIcon("../Chaper10/src/Mastery/sticker.gif");
       
        tiger = new ImageIcon("../Chaper10/src/Mastery/tiger_plush.gif");
      
        placeholder = new ImageIcon("../Chaper10/src/Mastery/placeholder.gif");

        // Prize image (starts as placeholder)
        prizeLabel = new JLabel(placeholder);
        prizeLabel.setBounds(175, 231, 126, 98);

        // Play button
        playButton = new JButton("Play");
        playButton.setFont(new Font("Algerian", Font.PLAIN, 18));
        playButton.setBounds(151, 126, 185, 34);
        playButton.addActionListener(this);
        getContentPane().setLayout(null);
        
        panel = new JPanel();
        panel.setBounds(30, 26, 415, 89);
        getContentPane().add(panel);
        panel.setLayout(null);
        
                // Plate image at top
                plateLabel = new JLabel(plates);
                plateLabel.setBounds(0, 0, 415, 89);
                panel.add(plateLabel);
                plateLabel.setForeground(new Color(0, 0, 0));
                plateLabel.setBackground(new Color(0, 128, 255));
       
                getContentPane().add(playButton);
                getContentPane().add(prizeLabel);
        
                // Message label (starts empty)
                messageLabel = new JLabel("");
                messageLabel.setBounds(124, 171, 269, 65);
                getContentPane().add(messageLabel);
                
                messageLabel.setFont(new Font("Algerian", Font.PLAIN, 21));
                messageLabel.setForeground(new Color(0, 0, 0));

        // Frame settings
        setSize(500, 392);
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
       
    	if (playButton.getText().equals("Play")) {
           
        	Random rando = new Random();
           
            int result = rando.nextInt(2); // 0 = sticker, 1 = tiger

            if (result == 0) {
                plateLabel.setIcon(platesTwoBroken);
              
                prizeLabel.setIcon(sticker);
              
                messageLabel.setText("You win a sticker!");
            } else {
                plateLabel.setIcon(platesAllBroken);
              
                prizeLabel.setIcon(tiger);
              
                messageLabel.setText("You win a tiger plush!");
            }

            playButton.setText("Play Again");

        } else { // Reset game
            plateLabel.setIcon(plates);
            
            prizeLabel.setIcon(placeholder);
           
            messageLabel.setText("");
           
            playButton.setText("Play");
        }
    }

    public static void main(String[] args) {
        new BreakAPlate();
    }
}


