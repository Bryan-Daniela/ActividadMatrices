package co.edu.unbosque.model;

import java.util.Scanner;

public class Ejercicio1 extends Thread {

	public static int matriz1[][];
	public static int matriz2[][];
	private int tama�o1;
	private int tama�o2;
	/**
	 * se crean las variable para obtener la matriz y el tama�o <b> pre </b>
	 * calcular el tama�o de la matriz <b> post </b> se obtiene la matriz con el
	 * tama�o que el usuario digite
	 */

	/**
	 * se crea el scanner para pedir los datos por consola
	 */

	Scanner sc = new Scanner(System.in);

	public Ejercicio1() {
		/**
		 * se toma el dato por consola del primer tama�o de la matriz nxn
		 */
		System.out.print("INGRESE EL TAMA�O DE LA MATRIZ: ");
		tama�o1 = sc.nextInt();
		matriz1 = new int[tama�o1][tama�o1];
		generarMatriz1();
		/**
		 * se toma el dato por consola de el tama�o de columnas de la matriz nxf
		 */
		System.out.println("INGRESE EL NUMERO DE COLUMNAS:");
		tama�o2 = sc.nextInt();
		matriz2 = new int[tama�o1][tama�o2];
		generarmatriz2();

		System.out.println("LA MATRIZ RESULTANTE DE LA MULTIPLICACION ES:");
		multiplicacionMatriz(matriz1, matriz2);
	}

	/**
	 * se crea el metodo que genera la matriz y los va llenando con numeros
	 * aleatorios <b>pre</b> generar numeros aleatorios dentro de la matriz <b> post
	 * </b> se obtiene la matriz nxn
	 */

	public void generarMatriz1() {

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				int numeros = matriz1[i][j] = (int) (Math.random() * 100);
				numeros = matriz1[i][j];
				System.out.print(matriz1[i][j] + "   ");

			}
			System.out.println("\n");

		}
	}

	public void generarmatriz2() {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = (int) (Math.random() * 100);
				System.out.print(matriz1[i][j] + "  ");

			}
			System.out.println("\n");

		}

	}

	public void multiplicacionMatriz(int matriz1[][], int matriz2[][]) {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				int multiplicacion = matriz1[i][j] * matriz2[i][j];

			}

		}

	}

}
