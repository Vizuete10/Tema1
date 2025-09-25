package tema1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
 /*
  * pedir kilos de peras y manzanas
  * 1 kilo de manzanas 2,35
  * 1 kilo de peras 1,95
  * 
  */
		
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		double manzanas;
		double peras;
		double importe;
		final double MANZANAS = 2.35;
		final double PERAS = 1.95;
		
		
		// Pedimos los kilos de manzanas
		System.out.println("¿Cuántos kilos de manzanas necesita?");
		manzanas = sc.nextDouble();
		
		// Pedimos los kilos de peras
		System.out.println("¿Cuántos kilos de peras necesita?");
		peras = sc.nextDouble();
		
		// Calculamos el importe
		importe = (manzanas * MANZANAS) + (peras * PERAS);
		
		// Imprimimos el importe total
		System.out.println("El importe sería: "+ importe +" euros");
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
