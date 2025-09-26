package ExamUnit1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
	
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables
		int numero1;
		int numero2;
		int numero3;
		double media;
		
		// Pedimos un primer número
		System.out.println("Introduza un primer número");
		numero1 = sc.nextInt();
		
		// Pedimos un segundo número
		System.out.println("Introduza un primer número");
		numero2 = sc.nextInt();
		
		// Pedimos un tercer número
		System.out.println("Introduza un primer número");
		numero3 = sc.nextInt();
		
		// Calculamos la media
		media = (numero1 + numero2 + numero3)/ 3.0;
		
		// Imprimimos por pantalla la media
		System.out.println("La media es: "+ media);
		
		// Cerramos el Scanner
		sc.close();
	}

}
