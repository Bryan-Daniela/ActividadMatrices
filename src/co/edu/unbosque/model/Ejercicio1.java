package co.edu.unbosque.model;

import java.util.Scanner;

public class Ejercicio1 extends Thread {

	public static int matriz3[][];
	public static int suma = 0;
	private int matriz1[][], matriz2[][];
	private static int i, j, k = 0;
	private int filas_matriz1;
	private int columnas_matriz1;
	private int columnas_matriz2;

	public Ejercicio1(int matriz1[][], int matriz2[][]) {

		this.matriz1 = matriz1;
		this.matriz2 = matriz2;
		
		filas_matriz1 = matriz1.length;
		columnas_matriz1 = matriz1[0].length;
		columnas_matriz2 = matriz2[0].length;

		matriz3 = new int[filas_matriz1][columnas_matriz2];

	}

	@Override
	public void run() {
		for (; i < filas_matriz1;) {
			for (j = 0 ; j < columnas_matriz2; j++) {
				for (k = 0; k < columnas_matriz1; k++) {
					suma += matriz1[i][k] * matriz2[k][j];
				}
				matriz3[i][j] = suma;
				suma = 0;
				
			}
			
			i++;
			break;
		}
	}

}
