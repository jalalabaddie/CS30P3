package Puck;

public class puck extends Disk implements Comparable 
{
	
	double MIN_STD_WEIGHT = 5;
	double MAX_STD_WEIGHT = 5.5;
	double MIN_YTH_WEIGHT = 4;
	double MAX_YTH_WEIGHT = 4.5;
	
	private double weight;
	private boolean standard, youth;
	
	public puck(double w) {
	
		super(1.5, 1);
		weight = w;
		
		if(weight >= MIN_STD_WEIGHT && weight >= MAX_STD_WEIGHT);
		{
			standard  = true;
			youth = false;
		}
	}
	public String getDivision()
	{
		String div;
		
		if(standard)
			div = "Puck Is Standard";
		else
			div = "Puck Is Youth";
		
		return div;
	}
	
	public double getWeight()
	{
		return weight;		
	}
	
	public boolean equals(Object c)
	{
		puck testObj = (puck)c; 
		
		if(testObj.getDivision() == getDivision())
		{
			return true;
		}
		else
		{
			return (false);
		}
	}
	
	public int compareTo(Object p)
	{
		puck testPuck =(puck)p;
		
		if(testPuck.getWeight() > weight)
		{
			return(-1);
		}
		else if(testPuck.getWeight() == weight)
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
	
	public String toString()
	{
		String puckString;
		
		puckString = "The Puck Has Weight "+ getWeight()+ " and division"+ getDivision()+ ".";
		
		return puckString;

	}
	
	

}
