package com.withgoogle.codein.task;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

//This class is implemented to calculate the Fibonnaci sequence numbers
public class FibonacciSequenceCalculator {
	public static final int MAX_INT = 2000;
	public static final int MIN_INT = 0;

	/*
	 * The main method of the program that initializes the scanner object to accept
	 * the input from the user. The two local variables t1 and t2 holds the initial
	 * value for the Fibonnaci sequence. The method is implemented to validate the
	 * user input and return the Fibonnaci value.
	 */
	public static void main(String[] args) {
		BigInteger t1 = BigInteger.valueOf(0);
		BigInteger t2 = BigInteger.valueOf(1);
		System.out.println("Please enter the index of the Fibonacci number that you would like to see: ");
		Scanner input = new Scanner(System.in);// This is the scanner object to read the user input
		try {
			int userInput = input.nextInt();
			long startTime = System.currentTimeMillis();
			if (isValidInput(userInput, startTime)) {
				/*
				 * This for loop is iterating through i until it becomes a value high enough to
				 * match with the user's input number. During each iteration, it performs
				 * calculation to get the final Fibonnaci value based on user's input.
				 */
				for (int i = 1; i <= userInput; i++) {
					// sum is the next number in the sequence by adding t1 and t2.
					BigInteger sum = t1.add(t2);
					// Terms t1 and t2 both move up as the sequence must continue. So assigning the
					// value of t2 to t1.
					t1 = t2;
					// assigning the value of sum to t2 so the sum is now ready to hold the new
					// value from the next iteration
					t2 = sum;
				}
				// Printing the results to the console.
				System.out.println("For the index number " + userInput + " in the Fibonnaci Sequence:");
				System.out.println("The number you are looking for is " + t1 + ".");
				long endTime = System.currentTimeMillis();
				printElapsedTime(startTime, endTime);
			}
			input.close();
		} catch (InputMismatchException e) {
			// Catching exception and displaying message when the user enters invalid input.
			System.out.println("Please enter valid data (integers only)");
			input.close();
		}
	}

	/*
	 * This method validates the input from the user to make sure that the input
	 * number from the user is <2000 and is >0. Two final class variables, MAX_INT
	 * and MIN_INT are defined to limit this range. It also displays a message about
	 * the accepted range of numbers for user's information.
	 */
	public static boolean isValidInput(int userInput, long startTime) {
		if (userInput > MAX_INT || userInput < MIN_INT) {
			System.out
					.println("ERROR: This Program Only Accounts for the first 2000 positive terms of the sequence...");
			long endTime = System.currentTimeMillis();
			printElapsedTime(startTime, endTime);
			return false;
		}
		/*
		 * If the number is in range, then the isVaslidInput method will return true so
		 * the rest of the program can run to return the Fibonnaci sequence value.
		 */
		return true;
	}

	public static void printElapsedTime(long startTime, long endTime) {
		long processTime = endTime - startTime;
		System.out.println("This process took a total time of: " + processTime / 1000F + " seconds for execution.");
	}

}
