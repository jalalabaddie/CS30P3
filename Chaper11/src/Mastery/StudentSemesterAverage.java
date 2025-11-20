package Mastery;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class StudentSemesterAverage {
   
	private static final String DATA_FILE_NAME = "student_grades.txt";
   private JFrame frame;
   private JTextField nameField;
   private JTextField gradeLevelField;
   private JTextField semesterField;
   private JTextField grade1Field;
   private JTextField grade2Field;
   private JTextField grade3Field;
   private JTextField grade4Field;
   private JTextField averageField;
   private JTextArea fileContentsArea;
   /**
    * Launch the application.
    */
   public static void main(String[]args) {
       EventQueue.invokeLater(new Runnable() {
           public void run() {
               try {
                   StudentSemesterAverage window = new StudentSemesterAverage();
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
   public StudentSemesterAverage() {
       initialize();
   }
   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
       frame = new JFrame("Student Grade Application");
       frame.setBounds(100, 100, 787, 554);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setLayout(new BorderLayout());
      
       JPanel formPanel = new JPanel();
       formPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
       formPanel.setBackground(new Color(255, 255, 255));
       formPanel.setLayout(null);
     
       JLabel StuName = new JLabel("Enter Student Name:");
       StuName.setFont(new Font("Times New Roman", Font.BOLD, 15));
       StuName.setBounds(10, 10, 145, 25);
       formPanel.add(StuName);
       
       nameField = new JTextField();
       nameField.setBorder(new LineBorder(new Color(171, 173, 179)));
       nameField.setBackground(new Color(255, 255, 255));
       nameField.setBounds(219, 11, 227, 25);
       formPanel.add(nameField);
      
       JLabel GradeLevel = new JLabel("Enter Grade Level:");
       GradeLevel.setFont(new Font("Times New Roman", Font.BOLD, 15));
       GradeLevel.setBounds(10, 40, 145, 25);
       formPanel.add(GradeLevel);
     
       gradeLevelField = new JTextField();
       gradeLevelField.setBounds(219, 41, 227, 25);
       formPanel.add(gradeLevelField);
     
       JLabel semesterNum = new JLabel("Enter Semester Number:");
       semesterNum.setFont(new Font("Times New Roman", Font.BOLD, 15));
       semesterNum.setBounds(10, 69, 183, 25);
       formPanel.add(semesterNum);
      
       semesterField = new JTextField();
       semesterField.setBounds(219, 70, 227, 25);
       formPanel.add(semesterField);
      
       JLabel grade1 = new JLabel("Enter Grade 1:");
       grade1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
       grade1.setBounds(10, 100, 100, 25);
       formPanel.add(grade1);
       grade1Field = new JTextField();
      
       grade1Field.setBounds(219, 100, 227, 25);
       formPanel.add(grade1Field);
      
       JLabel grade2 = new JLabel("Enter Grade 2:");
      
       grade2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
       grade2.setBounds(10, 130, 100, 25);
       formPanel.add(grade2);
       grade2Field = new JTextField();
       grade2Field.setBounds(219, 130, 227, 25);
       formPanel.add(grade2Field);
      
       JLabel grade3 = new JLabel("Enter Grade 3:");
       grade3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
       grade3.setBounds(10, 160, 100, 25);
       formPanel.add(grade3);
       grade3Field = new JTextField();
       grade3Field.setBounds(219, 160, 227, 25);
       formPanel.add(grade3Field);
    
       JLabel grade4 = new JLabel("Enter Grade 4:");
       grade4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
       grade4.setBounds(10, 190, 100, 25);
       formPanel.add(grade4);
       grade4Field = new JTextField();
       grade4Field.setBounds(219, 190, 227, 25);
       formPanel.add(grade4Field);
   
       JLabel average = new JLabel("Average:");
       average.setFont(new Font("Times New Roman", Font.BOLD, 15));
       average.setBounds(10, 226, 183, 25);
       formPanel.add(average);
       
      averageField = new JTextField();
       averageField.setFont(new Font("Tahoma", Font.BOLD, 11));
       averageField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
       averageField.setBackground(new Color(255, 255, 255));
       averageField.setBounds(219, 226, 227, 25);
       averageField.setEditable(false);
     
       formPanel.add(averageField);
       formPanel.setPreferredSize(new java.awt.Dimension(700, 260));
      
  frame.getContentPane().add(formPanel, BorderLayout.NORTH);
       fileContentsArea = new JTextArea();
       fileContentsArea.setEditable(false);
       fileContentsArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
       
       JScrollPane scrollPane = new JScrollPane(fileContentsArea);
       frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
      
       JPanel buttonPanel = new JPanel();
       frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
       
       JButton saveButton = new JButton("Save to File");
       saveButton.setBackground(new Color(0, 128, 255));
       saveButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
       buttonPanel.add(saveButton);
      
       JButton viewButton = new JButton("View File Contents");
       viewButton.setBackground(new Color(0, 128, 255));
       viewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
       buttonPanel.add(viewButton);
       saveButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               saveData();
           }
       });
       viewButton.addActionListener(new ActionListener() {
          
    	   public void actionPerformed(ActionEvent e) {
             
    		   loadFileContents();
           }
       });
   }
   private void saveData() {
       String name = nameField.getText().trim();
       String gradeLevel = gradeLevelField.getText().trim();
       String semester = semesterField.getText().trim();
       String grade1Text = grade1Field.getText().trim();
       String grade2Text = grade2Field.getText().trim();
       String grade3Text = grade3Field.getText().trim();
       String grade4Text = grade4Field.getText().trim();
       if (name.isEmpty() || gradeLevel.isEmpty() || semester.isEmpty()
               || grade1Text.isEmpty() || grade2Text.isEmpty()
               || grade3Text.isEmpty() || grade4Text.isEmpty()) {
           JOptionPane.showMessageDialog(
               frame,
               "Please fill in all fields!",
               "Error",
               JOptionPane.ERROR_MESSAGE);
           return;
       }
       try {
           double g1 = Double.parseDouble(grade1Text);
           double g2 = Double.parseDouble(grade2Text);
           double g3 = Double.parseDouble(grade3Text);
           double g4 = Double.parseDouble(grade4Text);
         
           double average = (g1 + g2 + g3 + g4) / 4.0;
         
           String averageString = String.format("%.1f%%", average);
          
           averageField.setText(averageString);
          
           String line = "Name: " + name
                   + ", Grade Level: " + gradeLevel
                   + ", Semester: " + semester
                   + ", Grades: " + g1 + ", " + g2 + ", " + g3 + ", " + g4
                   + ", Average: " + averageString;
           BufferedWriter writer =
               new BufferedWriter(new FileWriter(DATA_FILE_NAME, true));
          
           writer.write(line);
           writer.newLine();
           writer.close();
          
           JOptionPane.showMessageDialog(
               frame,
               "Data saved successfully!",
               "Message",
               JOptionPane.INFORMATION_MESSAGE);
    
       } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(
             
        		   frame,
               "Grades must be a number.",
               "Error",
               JOptionPane.ERROR_MESSAGE);
       } catch (IOException ex) {
           
    	   JOptionPane.showMessageDialog(
               frame,
               "Error writing to file.",
               "Error",
             
               JOptionPane.ERROR_MESSAGE);
       }
   }
   private void loadFileContents() {
       StringBuilder builder = new StringBuilder();
       try {
         
    	   BufferedReader reader =
               new BufferedReader(new FileReader(DATA_FILE_NAME));
          
    	   String line = reader.readLine();
           while (line != null) {
               builder.append(line);
               builder.append(System.lineSeparator());
               line = reader.readLine();
           }
           reader.close();
           fileContentsArea.setText(builder.toString());
     
       } catch (IOException ex) {
          
    	   fileContentsArea.setText("No data found. Save some records first.");
       }
   }
}























