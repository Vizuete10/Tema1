package tema1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
        //  Creamos un Scanner
        Scanner sc = new Scanner(System.in);
        
        // Declaramos la variable para la edad actual
        int edadActual;
        
        // Declaramos la vartiable para la edad del año que viene
        int edadProximoAño;
        
        // Pedir al usuario su edad, y lo leemos en la consola
        System.out.print("Por favor, introduce tu edad actual: ");
        edadActual = sc.nextInt();

        // Calcular la edad del próximo año
        edadProximoAño = edadActual + 1;

        // Mostrar la edad del próximo año
        System.out.println("Su edad el año que viene sera de " + edadProximoAño + " años.");

        // Cerrar el scanner 
        sc.close();
	}

}
