package tema1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		boolean llueve;
		boolean tareasTerminadas;
		boolean biblioteca;
		boolean permisoSalir;

		// Pedimos al usuario si esta lloviendo con los valores booleanos
		System.out.print("¿Está lloviendo? (true/false): ");
		llueve = sc.nextBoolean();

		// Pedimos al usuario si a terminado sus tareas con los valores booleanos
		System.out.print("¿Has finalizado tus tareas? (true/false): ");
		tareasTerminadas = sc.nextBoolean();
		
		// Pedimos al usuario si necesita ir a la biblioteca con los valores booleanos
		System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
		biblioteca = sc.nextBoolean();

		// Lógica del permiso para salir
		permisoSalir = (!llueve && tareasTerminadas) || biblioteca;

		// Mostramos resultado
		System.out.println("¿Puedo salir a la calle?: " + permisoSalir);

		sc.close();
	}

}
