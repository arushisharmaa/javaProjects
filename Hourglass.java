package firstPackage;

public class Hourglass {

	public static void main(String[]args) {
		//run the methods
		topLine();
		middleArea();
		System.out.println("     ||      ");
		middleArea2();
		topLine();
	}
//add the first line full of the backward slashes(10)
//put in method because it has to be repeated twice
	public static void topLine() {
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
	}
//run the code for the middle method
	public static void middleArea() {
		for(int j=1; j<=4; j++) { //j=1,2,3,4
			for(int i=1; i<=(j); i++) { //i prints out the number of spaces that the line needs(increasing each time)
				System.out.print(" ");
			}
		System.out.print("\\"); //start it method with a backwards slash
			for(int k=1; k<=(10-2*j); k++) {
				System.out.print(":"); //print out 8, 6,4,2 of the : 
			}
		System.out.println("/");
	}
		
		
}
	public static void middleArea2() {
		for(int j=4; j>=1; j--) { //j=4,3,2,1
			for(int i=1; i<=(j); i++) { //the number of spaces is supposed to decrease each time
				System.out.print(" ");
			}
		System.out.print("/");
			for(int k=1; k<=(2*(5-j)); k++) { //start off with 2,4,6,8 of the : so 2(5-1) would print out 8 of them.. 
				System.out.print(":");
			}
		System.out.println("\\"); //end the method with a slash
	}
		
		
}
	
}
