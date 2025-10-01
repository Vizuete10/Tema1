package aceptaElReto;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos la varible para el número de casa
		int numeroCasa;

		// Pedimos al usuario el número de vivienda
		System.out.println("Introduce el número de vivienda : ");
		numeroCasa = sc.nextInt();

		// Imprimos por pantalla si esta en la derecha o la izquierda
		System.out.println((numeroCasa % 2 == 0) ? "Derecha" : "Izquierda");
		
		// Cerramos el Scanner
		sc.close();
	}

}
