package firstPackage;
import java.util.Arrays;
import java.util.Scanner;
public class AlphaSort {
	public static void main(String[]args)
		{
	//question 1: the middle element by the binary search is on index 5, and has a value of 25
	//question 2: the middle element by the binary search is on index 6, and has a value of 22
	//question 3: the middle element by the binary search is on index 7 and has a value of 60
		//declare your variables and scanner 
			String og = ""; 
			int num = 0; 
			Scanner alpha = new Scanner(System.in); 
			
		//ask the user how many strings they want in the array 
			System.out.println("Enter the number of strings you want in the array: "); 
			num = alpha.nextInt(); 
			
		//create an array and another scanner
			String str[] = new String[num]; 
			Scanner alpha2 = new Scanner(System.in);
			
		//make the user enter the Strings 
			System.out.println("Enter the Strings you want in the array"); 
			for(int i=0; i<num; i++)
			{
				str[i] = alpha2.nextLine(); 
			}
		//use the sorting compare to method to make the strings in alpha order
		for(int i =0; i< num; i++)
		{
			for(int j = i+1; j< num; j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
				og = str[i]; 
				str[i] = str[j]; 
				str[j] = og;
				}
			}
		}
		//print out the array 
		System.out.println("The String In Alphabetical Order: " + Arrays.toString(str));
		}
	}


