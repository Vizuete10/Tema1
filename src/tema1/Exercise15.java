package tema1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		final int IVA = 21;
		double precio;
		double precioIVA;
		
		// Pedimos el precio sin iva y lo leemos con el Scanner
		System.out.println("Introduzca el precio: ");
		precio = sc.nextDouble();
		
		// Calculamos el precio con IVA
		precioIVA = ((precio * IVA)/100) + precio;
		
		// Imprimimos el precio con IVA
		System.out.println("El precio con el IVA es de : " + precioIVA);
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
