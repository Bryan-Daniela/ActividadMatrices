package co.edu.unbosque.controller;

import java.util.Scanner;

public class AplMain_Ejercicio2 {

	private static int[][] matriz1;
	private static int[][] matrizTranspuesta;

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("DIGITE EL TAMAÑO DE FILAS: ");
		int tamaño1 = leer.nextInt();
		System.out.println("DIGITE EL TAMAÑO DE COLUMNAS: ");
		int tamaño2 = leer.nextInt();

		matriz1 = new int[tamaño1][tamaño2];
		System.out.println("MATRIZ:");
		generarMatriz();
		System.out.println("\n");

		matrizTranspuesta = new int[tamaño2][tamaño1];
		System.out.println("MATRIZ TRANSPUESTA: ");
		generarTranspuesta();

	}

	public static void generarMatriz() {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = (int) (Math.random() * 100);

				System.out.print(matriz1[i][j] + "   ");
			}
			System.out.println("\n");
		}
	}

	public static void generarTranspuesta() {
		for (int i = 0; i < matrizTranspuesta.length; i++) {
			for (int j = 0; j < matrizTranspuesta[i].length; j++) {

				matrizTranspuesta[i][j] = matriz1[j][i];

				System.out.print(matrizTranspuesta[i][j] + "   ");

			}
			System.out.println("\n");

		}

	}

}
