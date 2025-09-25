package tema1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		boolean llueve;
		boolean tareasFinalizadas;
		boolean biblioteca;
		boolean permisoSalir;

		// Pedimos al usuario los valores booleanos
		System.out.print("¿Está lloviendo? (true/false): ");
		llueve = sc.nextBoolean();

		System.out.print("¿Has finalizado tus tareas? (true/false): ");
		tareasFinalizadas = sc.nextBoolean();

		System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
		biblioteca = sc.nextBoolean();

		// Lógica del permiso para salir
		permisoSalir = (!llueve && tareasFinalizadas) || biblioteca;

		// Mostramos resultado
		System.out.println("¿Puedes salir a la calle?: " + permisoSalir);

		sc.close();
	}

}
