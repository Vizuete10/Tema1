package exercisesEnglishPart2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/*BEGIN
		 * DISPLAY título del programa
		 * DISPLAY mensaje solicitando el precio
		 *ENTER precio
		 *DISPLAY mensaje solicitando el impuesto
		 *ENTER impuesto
		 *SET precio A precio * (1 + impuesto/100)
		 *DISPLAY nuevo precio
		 *END
		 */
		
		// Create a Scanner
		Scanner sc = new Scanner(System.in);

		// Declare variables for the price without tax, the tax, and the price with tax
		double precioSinTax;
		double taxas;
		double precioConTax;

		// Print the name of the program
		System.out.println("Price calculator with taxes");

		// Ask the user to enter the price
		System.out.println("Enter the price: ");
		precioSinTax = sc.nextDouble();

		// Ask the user to enter the tax value in %
		System.out.println("Enter the tax value (%): ");
		taxas = sc.nextDouble();

		// Calculate the price with tax
		precioConTax = precioSinTax * (1 + taxas / 100);

		// Print the price with tax
		System.out.println("The new price is: " + precioConTax);

		// Close the Scanner
		sc.close();

		
	}

}
