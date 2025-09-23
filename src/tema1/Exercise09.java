package tema1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Crear un objeto Scanner para obtener la entrada del usuario desde la consola.
		Scanner sc = new Scanner(System.in);

		// Solicitar la edad al usuario.
		System.out.println("Por favor, introduce tu edad:");
		int edad = sc.nextInt();

		// Determinar si es mayor de edad. En muchos países, la mayoría de edad es 18 años.
		boolean mayorDeEdad = edad >= 18;

		// Mostrar el resultado booleano.
		System.out.println("¿Es usted mayor de edad? " + mayorDeEdad);

		// Es importante cerrar el objeto Scanner para liberar recursos.
		sc.close();
	}

}
