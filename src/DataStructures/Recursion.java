package dataStructures;

public class Recursion {

	public static void main(String[] args) {
	
//		walk(5);
		
		int num = 7;
		System.out.println("Factorial " + num + "! = "  + factorial(num));
		
		int base = 2;
		int exponent = 8;
		System.out.println("Power: " + power(base, exponent));
		

	}

	private static int power(int base, int exponent) {
		
		if(exponent < 1) return 1; // base case
		return base * power(base, exponent - 1); // recursive case
		
	}

	private static int factorial(int num) {
		
		if(num < 1 ) return 1; // base case
		return num * factorial(num - 1); // recursive case
		
		
	}

//	private static void walk(int steps) {
		
//		for(int i = 0; i < steps; i++) {
//			System.out.println("You take a step!");
//		}
		
//		if(steps < 1) {
//			return;	// base case
//		}
//		System.out.println("You take a step!");
//		
//		walk(steps - 1); // recursive case
//	}

}
