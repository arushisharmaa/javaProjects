package firstPackage;
import java.util.*; 

public class RandomNumbersGame {
	public static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		//introductionMessage();
		playingTheGame(); 
	}
	public static void introductionMessage(){
			
		System.out.println("Hello! Welcome to the Super Slap Jack Game! what is your name? "); 
		String userName = console.nextLine();
		System.out.println("Wow what a beautiful name! " + userName); 
		System.out.println("Are you ready to play the best game ever? Don't answer that we know the answer is yes!");
		System.out.println("Here's how you play, it's kind of like Slap Jack, but better! ");
	
	}
	public static void playingTheGame() {
		System.out.println("The computer is going to have a random number printed out and if your number matches that number, you get the point");
		System.out.println("You're going to keep guessing until you get at least 8 points and you have 15 tries."); 
		for(int i=1; i<= 15; i++)
		{
			System.out.println("Choose a number between 2 and 10? "); 
			
			
		}
	}
	

}
