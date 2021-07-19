package inClassLessons;

public class Equestria {
	
	public static void main(String[] args) 
		{
//this will find the distance of the certain locations 
		System.out.println("Distance from Blatimae(29,16) to Manhattan(3,8) = " + distance(29,16,34,8));
		System.out.println("Distance from Blatimae(29,16) to Manhattan(3,8) = " + distance(29,16,34,8));
		System.out.println("Distance from Blatimae(29,16) to Manhattan(3,8) = " + distance(25,24,16,14));
//this will find the distance of the total trip using all of the values of the distance
		System.out.println("This distance of the total trip is " + totalTrip(25, 24, 26, 14, 8, 10));
		}
//this will find the circumference using the parameter of the diameter and the math function
	public static double roadTrip(double diameter) 
	{
		double circumference = diameter * Math.PI; 
		return circumference; 
	}
//this will find the distance using four points and the math button 
		public static double distance(int x1, int y1, int x2, int y2) 
		{
			double distance = (double)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			return distance;
		}
//this will find the distance with more than two locations and return that distance
		public static double totalTrip(int x1, int y1, int x2, int y2, int x3, int y3) {
			double distance = 0;
			distance += (double)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			distance = distance + (double)Math.sqrt((y3-y2)*(y3-y2)+(x3-x2)*(x3-x2));
			distance = distance + (double)Math.sqrt((y1-y3)*(y1-y3)+(x1-x3)*(x1-x3));
			return distance;
		}
	}


