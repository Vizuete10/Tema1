package parte2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las varibales 
		int entradasInfantiles;
		int entradasAdultos;
		double precio;
		double descuento;
		double importe;
		
		// Creamos dos constantes para el precio de cada entrada
		final double INFANTIL = 15.5;
		final double ADULTO = 20;
		
		
		// Pedimos al usuario que introduzca la cantidad de entradas infantiles que desea comprar
		System.out.println("Introduce número de entradas infantiles: ");
		entradasInfantiles = sc.nextInt();
		
		// Pedimos al usuario que introduzca la cantidad de entradas adultas que desea comprar
		System.out.println("Introduce número de entradas adultas: ");
		entradasAdultos = sc.nextInt();
		
		// Calculamos el precio y el posible descuento
		precio = (entradasInfantiles * INFANTIL) + (entradasAdultos * ADULTO);
		descuento = (precio>=100) ? 0.95 : 1;
		importe = precio * descuento;
		
		// Imprimimos por pantalla el total del precio
		System.out.println("El precio total de "+ entradasInfantiles + " entradas infantiles y "+ entradasAdultos +" entradas adultas es de : "+ importe + " euros");
		
		// Cerramos el Scanner
		sc.close();

	}

}
