package parte2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variable
		double decimal;
		int entero;
		
		// Declaramos una constante para el valor del redondeo
		final double REDONDEO = 0.5;
		
		// Pedimos que se intruduza un valor decimal
		System.out.println("Introduzca un valor decimal: ");
		decimal = sc.nextDouble();
		
		// Calculamos el redondeo
		entero = (int)(decimal + REDONDEO);
		
		// Imprimimos el valor redondeado
		System.out.println("Su valor redondeado es: "+ entero);
		
		// Cerramos el Scanner
		sc.close();
	}

}
