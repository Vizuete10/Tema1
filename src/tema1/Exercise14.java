package tema1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos variables para las notas de los tres trimestres
		int nota1;
		int nota2;
		int nota3;
		
		// Variable para la nota que aparecerá en el boletín
		int notaBoletin;
		
		// Variable para la nota media real
		double notaMedia;

		// Pedimos al usuario la nota del primer trimestre
		System.out.println("¿Cuál es tu nota en el primer trimestre?");
		nota1 = sc.nextInt();
		
		// Pedimos la nota del segundo trimestre
		System.out.println("¿Cuál es tu nota en el segundo trimestre?");
		nota2 = sc.nextInt();
		
		// Pedimos la nota del tercer trimestre
		System.out.println("¿Cuál es tu nota en el tercer trimestre?");
		nota3 = sc.nextInt();
		
		// Calculamos la nota del boletín
		notaBoletin = (nota1 + nota2 + nota3) / 3;

		// Calculamos la nota media real
		notaMedia = (nota1 + nota2 + nota3) / 3.0;
		
		// Mostramos la nota del boletín
		System.out.println("Su nota en el boletin es: "+ notaBoletin);
		
		// Mostramos la nota media real
		System.out.println("Su nota en el media es: "+ notaMedia);
		
		// Cerramos el Scanner
		sc.close();
	}

}
