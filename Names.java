package firstPackage;

public class Names 
{
	public static void main(String[] args)
	{
		firstLast(); 
		System.out.println("\n");
		firstMiddleLast();
		System.out.println("\n");
		lastFirst();
		System.out.println("\n");
		lastFirstMiddle();
	}
	public static void firstName()
	{
		System.out.print("Arushi");
	}
	
	public static void middleName()
	{
		System.out.print("no middle name");
	}
	
	public static void lastName()
	{
		System.out.print("Sharma");
	}
	
	public static void space()
	{
		System.out.print(" ");
	}
	public static void firstLast()
	{
		firstName();
		space(); 
		lastName(); 
	}
	
	public static void lastFirst()
	{
		lastName(); 
		System.out.print(",");
		space(); 
		firstName(); 
	}
	
	public static void firstMiddleLast()
	{
		firstName();
		space(); 
		middleName(); 
		space(); 
		lastName(); 
	}
	
	
	public static void lastFirstMiddle()
	{
		lastName(); 
		System.out.print(",");
		firstName(); 
		space(); 
		middleName(); 
	}
	
}
