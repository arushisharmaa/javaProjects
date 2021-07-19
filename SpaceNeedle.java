package inClassLessons;

public class SpaceNeedle 
{
	//set your scale for your space needle
	public static final int SCALE=5;
	//write out your main 
	public static void main(String[] args)
	{
		needle();
		topPart();
		bottomPart();
		needle();
		elevator();
		topPart();
	}
	//start off with the needle, only one increases per scale
	
	public static void needle() {
	//run the outer loop with the number of the scale
		for(int i=1; i<=SCALE; i++)
		{
	//multiply the scale by 3 to get the appropriate number of spaces so it always stays in the middle
			for(int j=1; j<=3*SCALE; j++) 
			{
				System.out.print(" ");
			}
	//multiply by 2 so the slash is in the middle
			for(int j=1; j<=SCALE/2; j++) 
			{
				System.out.print("|");
			}
			System.out.println();
		}
	}
//print out the stairs that are shown in the drawing, starts increasing with the colons
//decreases with the number of /\ by two
	public static void topPart()
	{
	//print out the number of spaces again because it needs to be in the middle
		for(int i=1; i<=SCALE; i++) {
			for(int j=1; j<=3*SCALE-i*3; j++) 
			{
				System.out.print(" ");
			}
			//start the steps, you have to take the # of the line you're on and start typing
			System.out.print("__/");
			for(int j=1; j<=3*(i-1); j++) 
			{
			//print out a colon
				System.out.print(":");
			}
			//take the scale and put the | in the middle of the drawing
			for(int j=1; j<=SCALE/2; j++) 
			{
				System.out.print("|");
			}
			//print out the number of colons
			for(int j=1; j<=3*(i-1); j++) {
				System.out.print(":");
			}
			//print out the left side of the step
			System.out.print("\\__");
			System.out.println();
			}
		//print out the scale times 6 and then add that to half of the scale minus 2
		//to make the straight line of "" marks
		for(int i=1; i<=SCALE/4; i++)
		{
			System.out.print("|");
			for(int j=1; j<=(6*SCALE)+(SCALE/2-2); j++) 
			{
				System.out.print("\"");
			}
			System.out.println("|");
		}
	}
	public static void bottomPart() {
	//each number on the scale has a new line
		for(int i=1; i<=SCALE; i++){
	//put the steps in the middle going down
			for(int j=1; j<=2*(i-1); j++) {
				System.out.print(" ");
			}
	//the step is on the left side
			System.out.print("\\_");
	//using the number of \/ we can figure out that we need 6 times the number the scale is
	//next you add that number to the scale and do some math
			for(int j=1; j<=(6*SCALE)+(SCALE/2-4-4*(i-1)); j++){
	//using a boolean if the line number is odd then you put a backward slash
				if(j%2==1) {
					System.out.print("/");
	//if the line number is foward you put a forward slash
				}else {
					System.out.print("\\");
				}
			}
	//finish the step on the right
			System.out.println("_/");
		}
	}
	
	public static void elevator()
	{
		for(int i=1; i<=SCALE*4; i++){
	//using the same formula as earlier to get the "elevator in the middle
			for(int j=1; j<=3*SCALE-(SCALE/2+SCALE/4); j++) {
				System.out.print(" ");
			}
	//divide the scale by four to get the left line on 1/4 of the "page"
			for(int j=1; j<=SCALE/4; j++) {
				System.out.print("|");
			}
	//half way of the design put a percent sign
			for(int j=1; j<=SCALE/2; j++) {
				System.out.print("%");
			}
	//put a straight bar again at the halfway mark
			for(int j=1; j<SCALE/2; j++) {
				System.out.print("|");
			}
	//put another one
			for(int j=1; j<=SCALE/2; j++) {
				System.out.print("%");
			}
	//another
			for(int j=1; j<=SCALE/4; j++) {
				System.out.println("|");
			}
		}
	}
	}

			
	
