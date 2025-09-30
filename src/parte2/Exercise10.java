package parte2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		int año;
		double adivinarSiglo;
		int siglo;
		
		// Pedimos al usuario que introduzca un año
		System.out.println("Introduce un año : ");
		año = sc.nextInt();
		
		// Calculamos el siglo
		adivinarSiglo = año / 100;
		siglo = (int)adivinarSiglo + 1;
		
		// Imprimimos por pantalla el siglo
		System.out.println("El año introducido perteneca al siglo "+ siglo);
		
		// Cerramos el Scanner
		sc.close();
			
	}

}
