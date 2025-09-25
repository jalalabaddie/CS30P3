package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class BreakAPlate extends JFrame implements ActionListener {
    private JLabel plateLabel;    // shows the plates
    private JLabel prizeLabel;    // shows the prize image
    private JLabel messageLabel;  // shows "You win!" message
    private JButton playButton;   // play/reset button
    
    // Images
    private ImageIcon plates;
    private ImageIcon platesTwoBroken;
    private ImageIcon platesAllBroken;
    private ImageIcon sticker;
    private ImageIcon tiger;
    private ImageIcon placeholder;

    public BreakAPlate() {
        setTitle("BreakAPlate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (adjust paths if needed)
        plates = new ImageIcon("../Chaper10/src/Mastery/plates.gif");
        platesTwoBroken = new ImageIcon("../Chaper10/src/Mastery/plates_two_broken.gif");
        platesAllBroken = new ImageIcon("../Chaper10/src/Mastery/plates_all_broken.gif");
        sticker = new ImageIcon("../Chaper10/src/Mastery/sticker.gif");
        tiger = new ImageIcon("../Chaper10/src/Mastery/tiger_plush.gif");
        placeholder = new ImageIcon("../Chaper10/src/Mastery/placeholder.gif");

        // Plate image at top
        plateLabel = new JLabel(plates);
        plateLabel.setBackground(new Color(0, 128, 255));
        plateLabel.setBounds(67, 26, 342, 59);

        // Message label (starts empty)
        messageLabel = new JLabel("");
        messageLabel.setBounds(145, 157, 260, 65);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        messageLabel.setForeground(Color.BLUE);

        // Prize image (starts as placeholder)
        prizeLabel = new JLabel(placeholder);
        prizeLabel.setBounds(188, 233, 108, 65);

        // Play button
        playButton = new JButton("Play");
        playButton.setBounds(145, 96, 165, 34);
        playButton.addActionListener(this);
        getContentPane().setLayout(null);

        // Add components in order
        getContentPane().add(plateLabel);
        getContentPane().add(playButton);
        getContentPane().add(messageLabel);
        getContentPane().add(prizeLabel);

        // Frame settings
        setSize(500, 500);
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (playButton.getText().equals("Play")) {
            Random rand = new Random();
            int result = rand.nextInt(2); // 0 = sticker, 1 = tiger

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


