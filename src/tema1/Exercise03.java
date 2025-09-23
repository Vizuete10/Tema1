package tema1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para el año actual
		int añoActual;
		
		// Declaramos la variable para el año de nacimiento
		int añoNacimiento;
		
		// Declaramos la variable de la edad
		int edad;
		
		// Pedimos el año en el que estamos y leemos en la consola
		System.out.println("¿En que año estamos?");
		añoActual = sc.nextInt();
		
		// Pedimos el año en el que estamos
		System.out.println("¿En que año naciste?");
		añoNacimiento = sc.nextInt();
		
		// Calculamos su edad
		edad = añoActual - añoNacimiento;
		
		// Imprimo la edad
		System.out.println("Su edad es:"+ edad);
				
		// Cerramos el Scanner
		sc.close();
	}

}
