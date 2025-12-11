package Mastery;

public class UEmployee 
{

    private String Name;
   
    private double Salary;

    public UEmployee(String Name, double Salary) 

    {
      
    	this.Name = Name;
      
        this.Salary = Salary;
   
    }

    public String getName() 
   
    {
        return Name;
   
    }

    public double getSalary() 
  
    {
        return Salary;
   
    }
}