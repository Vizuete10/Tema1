package tema1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
        //  Creamos un Scanner
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario su edad
        System.out.print("Por favor, introduce tu edad actual: ");
        int edadActual = sc.nextInt();

        // Calcular la edad del próximo año
        int edadProximoAnio = edadActual + 1;

        // Mostrar la edad del próximo año
        System.out.println("Su edad el año que viene sera de " + edadProximoAnio + " años.");

        // Cerrar el scanner 
        sc.close();
	}

}
