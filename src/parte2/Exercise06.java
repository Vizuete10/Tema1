package parte2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables para cada una de las diferentes medidas
		double milimetros;
		double centimetros;
		double metros;
		double totalCentimetros;
		
		// Pedimos al usuario una primera medida en milímetros
		System.out.println("Introduce una primera medida en milímetros: ");
		milimetros = sc.nextDouble();
		
		// Pedimos al usuario una segunda medida en centímetros
		System.out.println("Introduce una primera medida en centímetros: ");
		centimetros = sc.nextDouble();
		
		// Pedimos al usuario una tercera medida en metros
		System.out.println("Introduce una primera medida en metros: ");
		metros = sc.nextDouble();
		
		// Calculamos el total de las medidas a centímetros
		totalCentimetros = (milimetros/ 10) + centimetros + (metros * 100);
		
		// Imprimimos por pantalla el total de la suma de las tres medidas en centímetros
		System.out.println("Total de las medidas en centímetros: "+ totalCentimetros);
		
		// Cerramos el Scanner
		sc.close();
		
		
		
	}

}
