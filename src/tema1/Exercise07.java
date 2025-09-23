package tema1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable nombre
		String nombre;

		// Declaramos la variable dirección
		String direccion;

		// Declaramos la variable telefono
		String telefono;

		// Pedimos que intruduzca su nombre y lo leemos con el Scanner
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();

		// Pedimos que intruduzca su dirección y lo leemos con el Scanner
		System.out.println("Intruduzca su dirección");
		direccion = sc.nextLine();

		// Pedimos que intruduzca su telefono y lo leemos con el Scanner
		System.out.println("Intruduzca su telefono");
		telefono = sc.nextLine();

		// Imprimimos el nombre introducida
		System.out.println("El nombre introducido es: " + nombre);
		
		// Imprimimos la dirección introducida
		System.out.println("El dirección introducido es: " + direccion);
		
		// Imprimimos el telefono introducido
		System.out.println("El telefono introducido es: " + telefono);

		// Cerramos el Scanner
		sc.close();

	}

}
