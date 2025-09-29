package exercisesPart2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/*BEGIN
		 * DISPLAY título del programa
		 * DISPLAY mensaje solicitando el precio
		 *ENTER precio
		 *DISPLAY mensaje solicitando el impuesto
		 *ENTER impuesto
		 *SET precio A precio * (1 + impuesto/100)
		 *DISPLAY nuevo precio
		 *END
		 */
		
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables para el precio sin las taxas, las taxas y el precio con taxas
		double precioSinTax;
		double taxas;
		double precioConTax;
		
		// Imprimimos el nombre del programa
		System.out.println("Calculador de precio con taxas");
		
		// Pedimos que nos intruduza el precio
		System.out.println("Introduce el precio: ");
		precioSinTax = sc.nextDouble();
		
		// Pedimos el valor de las taxas en %
		System.out.println("Introduce el valor de las taxas (%): ");
		taxas = sc.nextDouble();
		
		// Calculamos el precio con taxas
		precioConTax = precioSinTax * (1 + taxas/100);
		
		// Imprimimos el precio con taxas
		System.out.println("El nuevo precio es: "+ precioConTax);
	
		// Cerramos el Scanner
		sc.close();
		
	}

}
