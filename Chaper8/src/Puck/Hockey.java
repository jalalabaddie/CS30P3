package Puck;

public class Hockey
{

	public static void main(String[] args)
	{
		
		puck p1 = new puck(1.0);
		
		puck p2 = new puck(5.2);
		
		puck p3 = new puck(4.4);
		
		puck p4 = new puck(5.2);
		
		// Test toString()
		System.out.println("Puck 1:\n" + p1 + "\n");
		
		System.out.println("Puck 2:\n" + p2 + "\n");
		
		System.out.println("Puck 3:\n" + p3 + "\n");
		
		//	Test equality
		if (p2.equals(p4))
		{
			System.out.println("Puck 2 is equal to Puck 4\n");
		}
		else
		{
			System.out.println("Puck 2 is not equal to Puck 4\n");
		}
		
		// Puck Part 2
		System.out.println("Puck 1 compared to Puck 2: " + p1.compareTo(p2));
		
		System.out.println("Puck 2 compared to Puck 1: " + p2.compareTo(p1));
		
		System.out.println("Puck 2 compared to Puck 4: " + p2.compareTo(p4));
		
		System.out.println("Puck 2 compared to Puck 2: " + p2.compareTo(p2));
	}

}