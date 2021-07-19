package inClassLessons;

public class RocketShip {
	//plan: take each one LINE by LINE b/c it will make it easier to work with and print since each one is increasing with the scale differently
	//choose a number for a scale of your rocketship
	public static final int SCALE = 11;
	public static void main(String[] args)
	{
		fire();
		straightLine();
		topCone();
		bottomCone();
		straightLine();
		bottomCone(); 
		topCone();
		straightLine();
		fire();
	}
	public static void fire() {
	//take the top part line by line
	//takes i and runs the code the scale times two and subtract one that's the pattern
			for(int i=1; i<=2*SCALE-1; i++) 
			{
	//innerloop: same pattern, the number of spaces increases
				for(int j=1; j<=2*SCALE-i; j++) 
				{
					System.out.print(" ");
				}
	//innerloop: print backward slashes, times 2 of the scale
				for(int j=1; j<=i; j++) 
				{
					System.out.print("/");
				}
	//innerloop: doesn't change even if the scale increases
				for(int j=1; j<=2; j++)
				{
					System.out.print("*");
				}
	//innerloop: print forward slashes, times 2 of the scale
				for(int j=1; j<=i; j++) 
				{
					System.out.print("\\");
				}
				System.out.println();
			}
		}
	public static void straightLine()
	{
		//stays the same even with the scale, repeated several times
		System.out.print("+");
		//increases with the scale by 2 
		for(int i=1; i<= 2*SCALE; i++)
		{
			System.out.print("=*");
		}
		//repeat the plus sign again 
		System.out.println("+");
	}
	public static void topCone() 
	{
		//start of with only two lines and then increases by 2 each time 2*SCALE as well
		for(int i=1; i<=SCALE; i++) {
		//doesn't change through scaling, so it doesn't need to be in the for loop
			System.out.print("|");
		//print out the number of periods starts with the SCALE, but decreases each time
			for(int j=1; j<=SCALE-i; j++)
			{
				System.out.print(".");
			}
		//the number of slashes increases by 2 each time the scale goes
			for(int j=1; j<=i; j++)
			{
				System.out.print("/\\");
			}
		//print out the number of periods, again..
			for(int j=1; j<=SCALE-i; j++)
			{
				System.out.print(".");
			}
		//more periods at the end and is the same as the first time
			for(int j=1; j<=SCALE-i; j++)
			{
				System.out.print(".");
			}
		//repeat the slashes again
			for(int j=1; j<=i; j++)
			{
				System.out.print("/\\");
			}
		//more periods
			for(int j=1; j<=SCALE-i; j++)
			{
				System.out.print(".");
			}
		//end it with a straight slash
			System.out.println("|");
		}
	}
	//does the same as topCone, but instead of decreasing the number of periods,
	//and increasing the number of /\, it does the opposite
	public static void bottomCone() 
	{
		for(int i=1; i<=SCALE; i++) {
			System.out.print("|");
			
			for(int j=1; j<=i-1; j++){
				System.out.print(".");
			}
			
			for(int j=1; j<=SCALE-i+1; j++){
				System.out.print("\\/");
			}
			
			for(int j=1; j<=i-1; j++){
				System.out.print(".");
			}
			for(int j=1; j<=i-1; j++){
				System.out.print(".");
			}
			
			for(int j=1; j<=SCALE-i+1; j++){
				System.out.print("\\/");
			}
			
			for(int j=1; j<=i-1; j++){
				System.out.print(".");
			}
			
			System.out.print("|");
			System.out.println();
		}
	}
	}

		


