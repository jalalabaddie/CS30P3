package Mastery;

public class Staff extends UEmployee 
{

    private String jobStatus;

    public Staff(String name, double salary, String jobStatus) 
    {
        super(name, salary);
        this.jobStatus = jobStatus;
    }

    public String getJobStatus() 
    {
        return jobStatus;
    }
}