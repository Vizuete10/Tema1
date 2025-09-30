package parte2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		int numeroProblema;
		double adivinarVolumen;
		int numeroVolumen;
		
		// Pedimos al usuario que introduza un número de problema
		System.out.println("Introduce el número de problema que quieras saber en que volúmen se encuentra : ");
		numeroProblema = sc.nextInt();
		
		// Calculamos el volúmen al que pertenece
		adivinarVolumen = numeroProblema / 100;
		numeroVolumen = (int)adivinarVolumen;
		
		// Imprimimos por pantalla el volúmen al que pertenece
		System.out.println("El problema se encuentra en el volúmen "+ numeroVolumen);
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
