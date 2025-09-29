package parte2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables
		int num1;
		int num2;
		int resto;
		int cantidadSuma;

		// Pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();

		// Pedimos al usuario que introduzca otro número
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();

		// Calculamos el resto de dividir el num1 introducido entre num2
		resto = num1 % num2;

		cantidadSuma = num2 - resto;

		// Imprimimos por pantalla la cantidad necesaria que hay que sumarle para que
		// sea multiplo de 7
		System.out.println("A " + num1 + " hay que sumarle " + cantidadSuma + " para que sea multiplo de " + num2);

		// Cerramos el Scanner
		sc.close();

	}

}
