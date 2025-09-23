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
		
		// Realizamos las cuentas
		suma = primerNumero + segundoNumero;
		resta = primerNumero - segundoNumero;
		division = primerNumero / segundoNumero;
		multiplicacion = primerNumero * segundoNumero;
		
		// Imprimimos las cuentas
		System.out.println("La suma de ambos es:"+ suma);
		System.out.println("La resta de ambos es:"+ resta);
		System.out.println("La división de ambos es:"+ division);
		System.out.println("La multiplicación de ambos es:"+ multiplicacion);
		
		sc.close();
		
		

	}

}
