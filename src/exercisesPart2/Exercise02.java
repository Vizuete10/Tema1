package exercisesPart2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int AÑO_ACTUAL = 2025;
		int añoNacimiento;
		int edad;
		
		System.out.println("¿En que año naciste?");
		añoNacimiento = sc.nextInt();
		
		edad = AÑO_ACTUAL - añoNacimiento;
		
		
		System.out.println("Su edad es : "+ edad);
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
