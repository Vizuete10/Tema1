package aceptaElReto;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables
		int casos;
		String palabra;

		// Pedimos al usuario el número de casos
		System.out.println("Introduce el número de casos: ");
		casos = sc.nextInt();
		sc.nextLine(); // limpiar el salto de línea después de leer el número

		// Realizamos el número de casos
		for (int i = 0; i < casos; i++) {
			// Pedimos una palabra
			System.out.println("Introduce una palabra: ");
			palabra = sc.nextLine();

			// Convertimos a minúsculas para ignorar mayúsculas
			System.out.println(palabra.equalsIgnoreCase("colgadas") ? "Bien" : "Mal");
			}
		// Cerramos el Scanner
		sc.close();
	}
}
