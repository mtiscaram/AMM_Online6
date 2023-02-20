package utilidades;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ES {
	// creamos un constructor vacio como buena practica de programacion
	// para inicializar lo vacio
	public ES() {

	}

	// creamos método para leer String texto por parametros y devuelva un entero
	//mediante un bucle do-whilw para saber si es un valor valido o no,
	public static int leerEntero(String texto) {

		int numEnt = 0;
		Scanner sc = new Scanner(System.in);
		
		boolean validacion = false;
		do {
			try {
				numEnt = sc.nextInt();

				System.out.println(texto);

				validacion = true;
			} catch (Exception e) {
				System.out.println("Valor no valido, introduzca un numero");
				sc.nextLine();
			}
		} while (validacion == false || numEnt < 0);
			sc.close();
		return numEnt;
	}

	//metodo publico para leer un entero introducido por teclado y 
	//devuelva un entero si el valor es válido
	public static int leerEnt() {
		Scanner sc = new Scanner(System.in);
		int numEnt = 0;
		boolean validacion = false;
		do {
			try {
				numEnt = sc.nextInt();
				validacion = true;
			} catch (Exception e) {
				System.out.println("Valor no válido ");
				sc.nextLine();
			}
		} while (validacion == false);
		sc.close();
		return numEnt;
	}

	//metodo que leer un float introducido por teclado y retorne un float
	public static float leerDecimal() {
		Scanner sc = new Scanner(System.in);
		float numfloat;
		numfloat = sc.nextFloat();
		sc.close();
		return numfloat;
	}

	public static char leerCaracter(String texto) {
		Scanner sc = new Scanner(System.in);
		// devuelve el primer caracter del mensaje
		sc.close();
		return texto.charAt(0);
	}

	
	//metodo para introducir por teclado un mensaje
	public static void escribirln(String mensaje) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println(mensaje);
	}
	//metodo para leer una cadena introducida por teclado
	public static String leerCadena() {
		Scanner sc = new Scanner(System.in);
		String cadena = sc.next();
		sc.close();
		return cadena;

	}
	
	public static int convertirCadenaEnEntero(String cadena) {
		int numeroDeCadena =-1;
		try {
			numeroDeCadena = Integer.valueOf(cadena);
		}catch (NumberFormatException e) {
			System.out.println("El valor introducido no es un número");
		}return numeroDeCadena;
	}

}