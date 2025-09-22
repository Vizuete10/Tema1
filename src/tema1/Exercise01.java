package tema1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaro una variable numero
		int number;
		
		// Pedimos un número
		System.out.println("Introduzca un número");
		
		// Leemos en la consola
		number = sc.nextInt();
		
		// Imprimo el número
		System.out.println("Número introducido:"+ number);
		
		// Cerramos el Scanner
		sc.close();

	}

}
