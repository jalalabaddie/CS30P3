package Cresmart;

public abstract class employee {
	private String firstName, lastName;
	
	//Constructor method
	
	

	public employee(String fn, String ln)
	{
		
		firstName = fn;
		lastName = ln;
	}


	public String toString()
	{
		return(firstName+ " " + lastName);
	}
	
	
	
	abstract double pay(double period);
}