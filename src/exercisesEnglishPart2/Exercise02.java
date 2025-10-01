package exercisesEnglishPart2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		// Create a Scanner to read input from the user
		Scanner sc = new Scanner(System.in);

		// Define a constant for the current year
		final int CURRENT_YEAR = 2025;

		// Declare variables for the birth year and age
		int birthYear;
		int age;

		// Ask the user for their birth year
		System.out.println("What year were you born?");
		birthYear = sc.nextInt();

		// Calculate the age by subtracting the birth year from the current year
		age = CURRENT_YEAR - birthYear;

		// Print the calculated age
		System.out.println("Your age is: " + age);

		// Close the Scanner to free resources
		sc.close();

	}

}
