package tema1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables 
		double euros;
		double pesetas;
		
		// Pedimos un número de euros y la leemos con el Scanner
		System.out.println("Introduce un valor en euros: ");
		euros = sc.nextDouble();
		
		// Calculamos el cambio a pesetas
		pesetas = euros * 166;
		
		// Imprimimos el resultado de la conversión
		System.out.println("Serian: " + pesetas +"pesetas");
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
