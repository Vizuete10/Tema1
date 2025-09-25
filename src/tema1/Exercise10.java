package tema1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
	
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean esPar;

		// Pedimos el numero
		System.out.println("Introduzca un numero: ");
		numero = sc.nextInt();
		
		// Comprobamos si el numero es par
		esPar = numero%2 == 0;
		
		// Imprimimos si el número es par o impar
		System.out.println("¿El número es par? " + esPar);
		
		// Cerramos el Scanner
		sc.close();
	}

}
