package fracCalc;
import java.util.*;

public class FracCalc {

		public static void main(String[] args) 
	    {
//run this code until the user types in quit
			//makes a Scanner to get input from the user
	    	Scanner console = new Scanner(System.in);	
	    	//says the intro to the user so they get know what to do!
	    	System.out.println("Welcome to the Frac Calc!");
			System.out.println("Type in an equation to solve: ");;
			//save this as the fraction to print out
	    	String fraction = console.nextLine(); 
	    	
	    	//while user's input, fraction does not equal the word 'quit'
	    	// the program will continue running 
	    	while(!fraction.equals("quit")) {
	    		//what the program keeps on running: 
	    		System.out.print(produceAnswer(fraction));
	    		//use that input into the function produceAnswer
	    		fraction = console.nextLine();
	      	}
	      
//it will print out "Program Has Stopped", when the user types in "quit	
	    	System.out.print("Program Has Stopped For Now.");
	    }
		

//this function will find the GCF of the fraction so it can simplfy it. 
	    public static int greatestCommonDenom(int numerator, int denominator) {
	    //if the denominator is equal to zero
	    //the the answer would just be the numerator
	    	if(denominator==0) {
	    		return numerator;
	    	}
	    	//if that's not true, then just print out the new denominator and the whole number
	    	return greatestCommonDenom(denominator, numerator % denominator);
	    }
	    //this function will find the LCM of the fraction to help simplify it
	    public static int leastCommonMultiple(int numerator, int denominator) {
	    //this will find a common multiple
	    	int commonMultiple= greatestCommonDenom(numerator,denominator);
	    //and then simplify it to find the correct numbers
	    	return (numerator/commonMultiple)*denominator;
	    }
	    
	    
	    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
	    // This function takes a String 'input' and produces the result
	    //
	    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
	    //      e.g. input ==> "1/2 + 3/4"
	    //        
	    // The function should return the result of the fraction after it has been calculated
	    //      e.g. return ==> "1_1/4"
//runs the function that does a lot of the calculations and prints out the answer
	    public static String produceAnswer(String input)
	    { 
// this function will declare all the values of the equation
	        String firstWholeNumber;
	        String firstNumerator;
	        String firstDenominator;
	        String secondWholeNumber;
	        String secondNumerator;
	        String secondDenominator;
	           
	     //it will split up the equation into the different fractions
	     String firstFraction = input.substring(0,input.indexOf(" "));
	     String operator = input.substring(input.indexOf(" ") +1, input.lastIndexOf(" "));
	     String secondFraction = input.substring(input.lastIndexOf(" ")+1);
	     
	     //next it will find the small parts of the fraction 
	     if(firstFraction.indexOf('_') > 0) { //checks this fraction is a mixed fraction
	 		firstWholeNumber = firstFraction.substring(0, firstFraction.lastIndexOf('_'));
	 		firstNumerator = firstFraction.substring(firstFraction.lastIndexOf('_')+1, firstFraction.lastIndexOf('/'));
	 		firstDenominator = firstFraction.substring(firstFraction.lastIndexOf('/')+1);
	 	//if it doesn't have a whole number then it won't print it out
	     }else if (firstFraction.indexOf('/') > 0){ 
	 		firstWholeNumber = "0"; //checks if this fraction is a improper fraction
	 		firstNumerator = firstFraction.substring(firstFraction.lastIndexOf('_')+1, firstFraction.lastIndexOf('/'));
	 		firstDenominator = firstFraction.substring(firstFraction.lastIndexOf('/')+1);
	 	//if there isn't any number then it will just print out 0 when you solve
	     }else { //not a fraction, just a whole number
	 		firstWholeNumber = firstFraction;
	 		firstNumerator = "0";
	 		firstDenominator = "1";
	 	} 
	     //using the second fraction it will split it up into three different parts
	     //if it has a whole number it will print it out
	     if(secondFraction.indexOf('_') > 0) { //checks if it's a mixed number
	  		secondWholeNumber = secondFraction.substring(0, secondFraction.lastIndexOf('_'));
	  		secondNumerator = secondFraction.substring(secondFraction.lastIndexOf('_')+1, secondFraction.lastIndexOf('/'));
	  		secondDenominator = secondFraction.substring(secondFraction.lastIndexOf('/')+1);
	  	//if it doesn't have a whole number then it won't print it out
	      }else if (secondFraction.indexOf('/') > 0){ //improper
	    	secondWholeNumber = "0";
	    	secondNumerator = secondFraction.substring(secondFraction.lastIndexOf('_')+1, secondFraction.lastIndexOf('/'));
	    	secondDenominator = secondFraction.substring(secondFraction.lastIndexOf('/')+1);
	  	//if there isn't any number then it will just print out 0 when you solve
	      }else { //not a fraction
	    	secondWholeNumber = secondFraction;
	    	secondNumerator = "0";
	    	secondDenominator = "1";
	  	}
	    	//create the function for the input of the variable
	        String answer = "";
	        //declare all of the variables in the function(uses the built in function to convert the values)
	        int newfirstWholeNumber =  Integer.parseInt(firstWholeNumber);
	        int newfirstNumerator=  Integer.parseInt(firstNumerator);
	        int newfirstDenominator =  Integer.parseInt(firstDenominator);
	        int newsecondWholeNumber =  Integer.parseInt(secondWholeNumber);
	        int newsecondNumerator =  Integer.parseInt(secondNumerator);
	        int newsecondDenominator = Integer.parseInt(secondDenominator);
	        //checks to see if the first fraction is a whole number
	        if(newfirstWholeNumber<0) {
	        //if it is, multiply the numerator by -1 to make it a negative value
	        	newfirstNumerator *=-1;
	        }
	        //checks to see if the second fraction is a whole number
	        if(newsecondWholeNumber<0) {
	        //if it is, multiply the numerator by -1 to make it a negative value
	        	newsecondNumerator *= -1;
	        }
	        //declare new variables to store the calculations
	        int finalWholeNumber = 0;
	        int finalNumerator = 0;
	        //since the value of the denominator is always the first times the second
	        //it will ALWAYS be this
	        //so we can just declare it in the very beginning
	        int finalDenominator = newfirstDenominator*newsecondDenominator;
	   //After having all the variables you need declared
	   //Figure out which if statement works with the operator

	   //if the operator is addition run this if statement
	        if(operator.equals("+")) {
	    //add the whole numbers together
	        	finalWholeNumber = (newfirstWholeNumber + newsecondWholeNumber);
	   //make an improper fraction of the numerators and the denominators
	        	finalNumerator = (newfirstNumerator*newsecondDenominator) + (newsecondNumerator*newfirstDenominator);
	    
	   //if the operator is subtraction run this if statement
	        } else if(operator.equals("-")) {
	   //make the equation into a positive fraction so it'll be easier to add
	        	/*
	        	newsecondWholeNumber *= -1;
	        	System.out.println(newsecondWholeNumber);
	        	newsecondNumerator *=-1;
	        	System.out.println(newsecondNumerator);
	        	*/
	   //add the whole numbers together again    	
	        	
	 //make an improper fraction of the numerators and the denominators    	
	        	finalNumerator = (((newfirstDenominator * newfirstWholeNumber)+ newfirstNumerator)*newsecondDenominator) - (((newsecondDenominator * newsecondWholeNumber)+ newsecondNumerator)*newfirstDenominator);
	        	//System.out.println(finalNumerator);
	        	//System.out.println(finalDenominator);
	        	finalWholeNumber= (finalNumerator / finalDenominator);
	        	finalNumerator %= finalDenominator;
	 //if the operator is multiplication run this if statement      	
	        } else if(operator.equals("*")) {
	        //this just multiplies the whole numbers
	        	finalWholeNumber = (newfirstWholeNumber * newsecondWholeNumber);
	        //this is a long equation but it basically multiplies all the numbers
	        //and adds them up correctly
	        	finalNumerator = newfirstWholeNumber * newsecondNumerator * newfirstDenominator
	        	+ (newfirstNumerator * newsecondWholeNumber * newsecondDenominator) 
	        	+(newfirstNumerator * newsecondNumerator);
	 //if the operator is divison run this if statement    
	        } else if(operator.equals("/")) {
	        //as everyone knows divison and multiplication are opposites
	        //therefore in this function 
	        //we used "beforeSwitched" to switch the numerator and denominator
	        	newsecondNumerator += newsecondWholeNumber*newsecondDenominator;
	        	int beforeSwitched= newsecondDenominator;
	        	newsecondDenominator = newsecondNumerator;
	        	newsecondNumerator = beforeSwitched;
	        	newsecondWholeNumber = 0;
	        	System.out.println(newsecondNumerator);
	        	//if the denominator(orginally the numerator) is less that zero 
	        	//you multiply them by -1 to make it postive
	        	if(newsecondDenominator<0) {
	        		newsecondDenominator*=-1;
	        		newsecondNumerator*=-1;
	        	}
	        	//this will just make the new denominator
	        	finalDenominator = newfirstDenominator*newsecondDenominator;
	        	//this will just multiply the whole numbers
	        	finalWholeNumber = newfirstWholeNumber * newsecondWholeNumber;
	        	//same equation that multiplied the numbers before
	        	finalNumerator = newfirstWholeNumber * newsecondNumerator * newfirstDenominator
	    	        	+ (newfirstNumerator * newsecondWholeNumber * newsecondDenominator) 
	    	        	+(newfirstNumerator * newsecondNumerator);       	
	        }
	        //this will just simplfy the num and denom using the division
	        // this means that this will be no reminaders making it equal
	        int simplified = greatestCommonDenom(finalNumerator, finalDenominator);
	        finalNumerator /= simplified;
	        finalDenominator /= simplified;
	       //check all of the equation for errors
	       // if there is no wholeNumber or the numerator was a negative number
	       //make sure that the negative is on the numerator
	        if(finalWholeNumber!=0 && finalNumerator<0) {
	        	finalNumerator *= -1;
	        }
	        //IF the denomintor is less that 0, meaning that the "numerator" in the divison 
	        //is less than 0 mutiply everything to make it positive
	        if(finalDenominator<0) {
	        	finalDenominator*=-1;
	        	finalNumerator*=-1;
	        }
	        //this will keep on running until the fraction is completely simiplfied
	        //you have to make sure to take the abs value
	        //every single time you make whole circle around the numerator
	        //subtract 1 from the whole number
	        while(Math.abs(finalNumerator)>finalDenominator || Math.abs(finalNumerator)==finalDenominator) {
	        	if(finalWholeNumber<0||finalNumerator<0) {
	        		finalWholeNumber--;
	        //if there is none of that then you just add one to the whole number
	        	}else {
	        		finalWholeNumber++;
	        	}
	        //keep adding if the absolute value numerator is not equal to the numerator
	        	if(Math.abs(finalNumerator)!=finalNumerator) {
	        		finalNumerator+=finalDenominator;
	        //if not, just subtract the denominator to the numerator	
	        	} else {
	        		finalNumerator-=finalDenominator;
	        	}
	        }
	        //make the numerator the correct value
	        //by multiplying it by -1
	        if(finalWholeNumber<0 && finalNumerator<0) {
	        	finalNumerator*=-1;
	        }
	        //THIS WILL PRINT OUT YOUR ANSWER
	        //YOURE ALMOST DONE
	        //YAY 
	        //this would mean that there is no fraction and it's just a whole number
	        if(finalNumerator==0) {
	        	answer  = finalWholeNumber + "";
	        //if the whole number isn't a value then you just print out
	        //the num and denom
	        } else if(finalWholeNumber==0) {
	        	answer  = finalNumerator + "/" + finalDenominator;
	        //if none of that is applicable
	        //print out the whole fraction
	    	} else {
	    		answer = finalWholeNumber + "_" + finalNumerator + "/" + finalDenominator;
	        }
	        //return the answer and you're done!
	        return answer;
	        
	    }        
	}