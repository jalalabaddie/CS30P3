package Mastery;

public class UniTest {
    public static void main(String[] args) {

        // Create Faculty object
        Faculty f1 = new Faculty("Dr. Rasheed", 95000, "Computer Science");

        // Create Staff object
        Staff s1 = new Staff("Marc-Andre Fleury", 50000, "Lab Technician");

        // Print Faculty information
       
        System.out.println("Faculty Member:");
      
        System.out.println("Name: " + f1.getName());
      
        System.out.println("Salary: $" + f1.getSalary());
      
        System.out.println("Department: " + f1.getDepartName());
     
        System.out.println();

        // Print Staff information
        System.out.println("Staff Member:");
       
        System.out.println("Name: " + s1.getName());
       
        System.out.println("Salary: $" + s1.getSalary());
        
        System.out.println("Job Title: " + s1.getJobStatus());
    }
}
