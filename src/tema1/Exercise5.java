package tema1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Radio de la circunferencia
		double radio;
		
		// Longitud de la circunferencia
		double longitud;
		
		// Area de la circunferencia
		double area;
		
		// Pedimos introducir el radio
		System.out.println("Introduce el radio: ");
		
		// El usuario introduce el radio
		radio = sc.nextDouble();
		
		
		// Calculamos la longitud
		longitud = 2 * Math.PI * radio;
		
		// Calculamos el área
		area = Math.PI * radio * radio;
		
		// Imprimimos la longitud
		System.out.println("La longitud es: " + longitud);
		
		// Imprimimos el área
		System.out.println("El área es: " + area);
		
		// Cerramos el Scanner
		sc.close();
	}

}
