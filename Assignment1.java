package coreJavaVariables;

public class Assignment1 {

	public static void main(String[] args) {
		addIntegers();
		addDoubles();
		addIntegerAndDouble();
		divideIntegers();
		castQuotient();
		castQuotient2();
		printConstant();
		simulateCafe();
	}

	/**
	 * Write a program that declares 2 integer variables, assigns 
	 * an integer to each, and adds them together. Assign the sum 
	 * to a variable. Print out the result.
	 */
	public static void addIntegers() {
		int x = 5;
		int y = 10;
		int sum = x + y;
		System.out.println("addIntegers: " + sum);
	}
	
	/**
	 * Write a program that declares 2 double variables, assigns a 
	 * number to each, and adds them together. Assign the sum to a 
	 * variable. Print out the result.
	 */
	public static void addDoubles() {
		double x = 5.0;
		double y = 10.0;
		double sum = x + y;
		System.out.println("addDoubles: " + sum);
	}
	
	/**
	 * Write a program that declares an integer variable and a 
	 * double variable, assigns numbers to each, and adds them 
	 * together. Assign the sum to a variable. Print out the result. 
	 * What variable type must the sum be?
	 */
	public static void addIntegerAndDouble() {
		int x = 5;
		double y = 10.6;
		double sum = x + y;
		// sum must be a double, otherwise you truncate decimal places.
		System.out.println("addIntegerAndDouble: " + sum);
	}
	
	/**
	 * Write a program that declares 2 integer variables, assigns an 
	 * integer to each, and divides the larger number by the smaller 
	 * number. Assign the result to a variable. Print out the result. 
	 * Now change the larger number to a decimal. What happens? What 
	 * corrections are needed?
	 */
	public static void divideIntegers() {
		int x = 5;
		double y = 12;
		double quotient = y / x;
		// If quotient is an int, Eclipse will complain.
		// Though it's possible to cast, making quotient an int
		// will mean truncating decimal places.
		System.out.println("divideInteger: " + quotient);
	}
	
	/**
	 * Write a program that declares 2 double variables, assigns a 
	 * number to each, and divides the larger by the smaller. Assign 
	 * the result to a variable. Print out the result. Now, cast the 
	 * result to an integer. Print out the result again.
	 */
	public static void castQuotient() {
		double x = 5.0;
		double y = 12.0;
		double quotient = y / x;
		System.out.println("castQuotient before cast: " + quotient);
		int quotient2 = (int)(quotient);
		System.out.println("castQuotient after cast: " + quotient2);
	}
	
	/**
	 * Write a program that declares 2 integer variables, x, and y, 
	 * and assign 5 to x and 6 to y. Declare a variable q and assign 
	 * y/x to it and print q. Now, cast y to a double and assign to q. 
	 * Print q again.
	 */
	public static void castQuotient2() {
		int x = 5;
		int y = 6;
		int q = y / x;
		System.out.println("castQuotient2 before cast: " + q);
		// since q is already an int, you will get a type mismatch
		double q2 = (double)(y) / x;
		System.out.println("castQuotient2 after cast: " + q2);
	}
	
	/**
	 * Write a program that declares a named constant and uses it in 
	 * a calculation. Print the result.
	 */
	public static void printConstant() {
		final int X = 10;
		int y = 100;
		int quotient = y / X;
		System.out.println("printConstant: " + quotient);
	}
	
	/**
	 * Write a program where you create 3 variables that represent 
	 * products at a cafe. The products could be beverages like coffee, 
	 * cappuccino, espresso, green tea, etc. Assign prices to each 
	 * product. Create 2 more variables called subtotal and totalSale 
	 * and complete an “order” for 3 items of the first product, 4 items 
	 * of the second product, and 2 items of the third product. Add them 
	 * all together to calculate the subtotal. Create a constant called 
	 * SALES_TAX and add sales tax to the subtotal to obtain the totalSale 
	 * amount. Be sure to format the results to 2 decimal places.
	 */
	public static void simulateCafe() {
		double cappuccino = 5.5;
		double espresso = 3.5;
		double greenTea = 4.5;
		final double SALES_TAX = 2.3;
		
		double subtotal = (3 * cappuccino) + (4 * espresso) + (2 * greenTea);
		double totalSale = subtotal + SALES_TAX;
		System.out.println("simulateCafe: " + ((double)(Math.round(totalSale * 100)) / 100));
	}
}
