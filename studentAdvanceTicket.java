package Practice;

//create the class
public class studentAdvanceTicket {
//define and restrict variables
	private int num; 
	private double price; 
//create a constructor
	public studentAdvanceTicket(int number, int advancedDays, double p)
	{
		num = number; 
		price =p;
//follow the price rules
		if(advancedDays>10)
		{
			p = 15.0; 
		}else {
			p = 20.0; 
		}
	}
//return the price
	public double getPrice()
	{
		return price; 
	}
//return the to string method	
	public String toString() {
		return "Number: " + num + " Price: " + price + " (ID required) ";
	}

}
