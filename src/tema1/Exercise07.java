package tema1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		String direccion;
		
		String telefono;
		
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		
		System.out.println("Intruduzca su dirección");
		direccion = sc.nextLine();
		
		System.out.println("Intruduzca su telefono");
		telefono = sc.nextLine();
		
		System.out.println("El nombre introducido es: "+ nombre);
		System.out.println("El dirección introducido es: "+ direccion);
		System.out.println("El telefono introducido es: "+ telefono);
		
		sc.close();

	}

}
