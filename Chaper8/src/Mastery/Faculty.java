package Mastery;

public class Faculty extends UEmployee 
{

    private String DepartName;

    public Faculty(String name, double salary, String Sector) 
    {
        super(name, salary);
        this.DepartName = Sector;
    }

    public String getDepartName() 
    {
        return DepartName;
    }
}