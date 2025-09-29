package parte2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		/* Crear un programa para sumar lo justo para que sea multiplo de 7
		 * usando %
		 * ejemplo:
		 * pedir numero : 6
		 * para que 6 sea multiplo (6+algo)%7 = 0
		 */
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		int numero;
		int resto;
		int cantidadSuma;
		
		// Pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		// Calculamos el resto de dividir el número introducido entre 7
		resto = numero%7;
		
		cantidadSuma = 7 - resto;
		
		// Imprimimos por pantalla la cantidad necesaria que hay que sumarle para que sea multiplo de 7
		System.out.println("Hay que sumarle "+ cantidadSuma +" para que sea multiplo de 7");
		
		// Cerramos el Scanner
		sc.close();
		
		
		
	}

}
