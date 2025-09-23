package tema1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable del primer numero
		double primerNumero;
		
		// Declaramos la variable del segundo numero
		double segundoNumero;
		
		// Declaramos la variable de la suma
		double suma;
		
		// Declaramos la variable de la resta
		double resta;
		
		// Declaramos la variable de la division
		double division;
		
		// Declaramos la variable de la multiplicación
		double multiplicacion;
		
		// Pedimos el primer numero y lo leemos en el Scanner
		System.out.println("Introduza un numero:");
		primerNumero = sc.nextDouble();
		
		// Pedimos el segundo numero y lo leemos en el Scanner
		System.out.println("Introduzca otro numero:");
		segundoNumero = sc.nextDouble();
		
		// Realizamos la suma
		suma = primerNumero + segundoNumero;
		
		// Realizamos la resta
		resta = primerNumero - segundoNumero;
		
		// Realizamos la división
		division = primerNumero / segundoNumero;
		
		// Realizamos la multiplicación
		multiplicacion = primerNumero * segundoNumero;
		
		// Imprimimos la solución de la suma
		System.out.println("La suma de ambos es:"+ suma);
		
		// Imprimimos la solución de la resta

		System.out.println("La resta de ambos es:"+ resta);
		
		// Imprimimos la solución de la división

		System.out.println("La división de ambos es:"+ division);
		
		// Imprimimos la solución de la multiplicación
		System.out.println("La multiplicación de ambos es:"+ multiplicacion);
		
		// Cerramos el Scanner
		sc.close();
		
		

	}

}
