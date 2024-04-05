package ar.edu.unju.fi.pv.ejemplo1;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		String saludo = "Hola PV 2024";
		System.out.println(saludo);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un nombre: ");
		String nombre = scanner.next(); 
		System.out.println("Hola: " + nombre);
	}
 
}