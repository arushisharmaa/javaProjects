package inClassLessons;
import java.util.*;
public class PokemonEV {
public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.print("Hit points:");
		int hp = userInput.nextInt();
		
		System.out.print("Level: ");
		int level = userInput.nextInt();
		
		System.out.print("IV: ");
		int iv = userInput.nextInt();
		
		System.out.print("Base: ");
		int base = userInput.nextInt();
		
		int ev = (((hp-10)* 100/level-2*base -iv -100)* 4);
		System.out.println("You have " + ev + " effort value points for your HP stat.");
	}
}
