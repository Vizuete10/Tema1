package tema1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
				
		// Declaramos la primera nota
		int primeraNota;
		
		// Declaramos la segunda nota
		int segundaNota;
		
		// Declaramos la media aritmetica
		double mediaAritmetica;
		
		// Pedimos la primera nota y la leemos en la consola
		System.out.println("Introduza su primera nota:");
		primeraNota = sc.nextInt();
		
		// Pedimos la segunda nota y la leemos en la consola
		System.out.println("Introduza su segunda nota:");
		segundaNota= sc.nextInt();
		
		// Calculamos la media aritmetica
		mediaAritmetica = (primeraNota + segundaNota)/2.0;
		
<<<<<<< HEAD
		// Impimimos la media aritmetica
=======
		// Imprimimos la nota media
>>>>>>> branch 'master' of https://github.com/Vizuete10/Tema1.git
		System.out.println("Su media aritmetica seria: " + mediaAritmetica);
		
		// Cerramos el Scanner
		sc.close();
				

	}

}
