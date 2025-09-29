package parte2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		int horas;
        int minutos;
        int segundos;
        int totalSegundos;
        
        // Pedimos una cantidad de segundos
        System.out.println("Introduce una cantidad de segundos: ");
        totalSegundos = sc.nextInt();
        
        // Calculamos el número de horas, minutos y segundos
        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;
        
        // Imprimimos por pantalla el número de horas, minutos y segundos calculados
        System.out.println("Equivale a: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
        
        // Cerramos el Scanner
        sc.close();
	}

}
