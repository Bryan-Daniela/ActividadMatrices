package co.edu.unbosque.controller;

import java.util.Scanner;

public class AplMain_Ejercicio3 {

	static int[][] matriz;

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		System.out.println("DIGITE EL TAMAÑO DE LA MATRIZ: ");
		int tamaño1 = leer.nextInt();
		matriz = new int[tamaño1][tamaño1];
		generarMatriz();
		System.out.println("MATRIZ CON 0 Y 1");
		System.out.println("\n");
		generarMatriz01();
	}

	public static void generarMatriz() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100);

				System.out.print(matriz[i][j] + "   ");
			}
			System.out.println("\n");
		}

	}

	public static void generarMatriz01() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (matriz[i][j] % 2 == 0) {
					matriz[i][j] = 0;

				} else if (matriz[i][j] % 2 != 0) {

					matriz[i][j] = 1;

				}
				System.out.print(matriz[i][j] + "    ");
			}
			System.out.println("\n");

		}

	}

}
