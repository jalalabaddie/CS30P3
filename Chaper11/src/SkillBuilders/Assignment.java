package SkillBuilders;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.BorderLayout;
import java.io.*;

public class Assignment {

    private JFrame frame;
    private JTextArea textArea;
    private JTextField filePathField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Assignment window = new Assignment();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Assignment() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Assignment Instructions Viewer");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setup top panel with file path and button
        JPanel topPanel = new JPanel();
        filePathField = new JTextField(30);
        JButton btnLoad = new JButton("Load Instructions");
        topPanel.add(new JLabel("File Path: "));
        topPanel.add(filePathField);
        topPanel.add(btnLoad);
        frame.getContentPane().add(topPanel, BorderLayout.NORTH);

        // Area to display file contents
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Button action to load file
        btnLoad.addActionListener(e -> loadInstructions());
    }

    private void loadInstructions() {
        String filePath = filePathField.getText().trim();
        filePath = "C:\\Users\\38327014\\git\\CS30P3\\Chaper11\\src\\SkillBuilders\\" + filePath;
        System.out.print(filePath);       
        if (filePath.isEmpty()) {
            filePath = "assignment.txt";
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            textArea.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (FileNotFoundException fnf) {
            textArea.setText("File not found: " + filePath + "\nPlace the file in the runnable folder or specify the full path.");
        } catch (IOException io) {
            textArea.setText("Error reading file: " + filePath);
        }
    }
}
