package tema1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable nombre
		String nombre;
		
		// Declaramos la variable edad
		int edad;
		
		// Pedir el nombre al usuario
		System.out.println("Por favor, introduce tu nombre:");
		nombre = sc.nextLine();

		// Pedir la edad al usuario
		System.out.println("Por favor, introduce tu edad:");
		edad = sc.nextInt();

		// Mostrar el mensaje por pantalla
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
	}

}
