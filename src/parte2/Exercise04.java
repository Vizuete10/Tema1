package parte2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//y=ax2+bx+c
		/*
		 * pedir valor a, b, c, x y calcular y
		 * muestro la ecuación
		 * Pido a
		 * pido b
		 * pido c
		 * pido x
		 * sustituyo los valores
		 * calculo
		 * imprimimos
		 */
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables a, b, c, x, y
		int a;
		int b;
		int c;
		int x;
		int y;
		
		// Imprimimos la ecuación
		System.out.println("Según esta ecuación y=ax2+bx+c");
		
		// Pedimos que introduzca un valor para a
		System.out.println("Introduce valor de a: ");
		a = sc.nextInt();
		
		// Pedimos que introduzca un valor para b
		System.out.println("Introduce valor de b: ");
		b = sc.nextInt();
		
		// Pedimos que introduzca un valor para c
		System.out.println("Introduce valor de c: ");
		c = sc.nextInt();
		
		// Pedimos que introduzca un valor para x
		System.out.println("Introduce valor de x: ");
		x = sc.nextInt();
	
		// Calculamos el valor de y
		y = (a*a)*+b*x-c;
		
		// Imprimimos por pantalla el valor de y
		System.out.println("La solución con los valores introducidos es: "+ y);
		
		// Cerramos el Scanner
		sc.close();
		
	
		
		
		
	}

}
