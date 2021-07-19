package firstPackage;
import java.util.*;
public class ProccesingNumbers {
public static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("How many numbers are in your set of numbers?");
		int times = console.nextInt();
		System.out.println("Choose A Number: ");
		int firstNum = console.nextInt();
		int max = firstNum;
		int min = firstNum;
		int sum = 0; 
		for(int counts = 0; counts < times-1; counts++){
			System.out.println("Choose A Number: ");
			int num = console.nextInt();
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
			if(num % 2 == 0) { 
			 sum+=num;
				
			}
		}
		System.out.println("The minimum value is: " + min);
		System.out.println("The maximum value is: " + max);
		System.out.println("The sum of all the even numbers is: " + sum);
	}

}
