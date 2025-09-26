package ExamUnit1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		/*
		 * 1. Preguntar al usuario el número de horas que ha trabajado durante la semana
		 * 2. Preguntar al usuario el precio por hora. El precio es una cantidad con decimales.
		 * 3. Calcular el salario bruto multiplicando horas trabajadas por precio por hora
		 * 4. Aplicar el descuento por impuestos:
		 *    - Si cobra menos de 1000 → 10%
		 *    - Si cobra 1000 o más → 15%	 
		 * 5. Mostrar el salario neto después del impuesto
		 */
		
		// Creamos un objeto Scanner para leer datos desde teclado
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables necesarias
		
		// Número de horas trabajadas
		double horaTrabajo;  
		
		// Precio por cada hora trabajada
		double precioPorHora; 
		
		// Salario antes de impuestos
		double salarioBruto;  
		
		// Salario después de aplicar impuestos
		double salarioNeto; 
		
		// Porcentaje de impuesto aplicado
		double impuesto;      
		
		// Pedimos al usuario cuántas horas trabajó
		System.out.println("¿Cuántas horas trabaja? ");
		horaTrabajo = sc.nextDouble();
		
		// Pedimos al usuario el precio por hora
		System.out.println("¿Cuál es el precio por hora? ");
		precioPorHora = sc.nextDouble();
		
		// Calculamos el salario bruto
		salarioBruto = horaTrabajo * precioPorHora;
		
		// Determinamos el impuesto: 10% si <1000, 15% si >=1000
		impuesto = (salarioBruto < 1000) ? 0.10 : 0.15;
		
		// Calculamos el salario neto restando los impuestos
		salarioNeto = salarioBruto - (salarioBruto * impuesto);
		
		// Mostramos el resultado final al usuario
		System.out.println("Su salario neto tras aplicarle su debido impuesto es: " + salarioNeto);
		
		// Cerramos el Scanner
		sc.close();
	}
}

