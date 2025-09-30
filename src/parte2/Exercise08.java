package parte2;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables
		double metros;
		int centimetros;

		// Pedimos al usuario que introduzca su logitud en metros
		System.out.println("Introduce la longitud en metros :");
		metros = sc.nextDouble();

		// Hacemos la conversión y nos quedamos con el valor entero
		centimetros = (int) (metros * 100);

		// Imprimimos por pantalla el resultado
		System.out.println("Su logitud es de : " + centimetros + " cm");

		// Cerramos el Scanner
		sc.close();

	}
}
