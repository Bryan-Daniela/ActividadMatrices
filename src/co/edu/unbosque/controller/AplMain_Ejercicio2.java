package co.edu.unbosque.controller;

import java.util.Scanner;

public class AplMain_Ejercicio2 {

	private static int[][] matriz1;
	private static int[][] matrizTranspuesta;

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("DIGITE EL TAMA�O DE FILAS: ");
		int tama�o1 = leer.nextInt();
		System.out.println("DIGITE EL TAMA�O DE COLUMNAS: ");
		int tama�o2 = leer.nextInt();

		matriz1 = new int[tama�o1][tama�o2];
		System.out.println("MATRIZ:");
		generarMatriz();
		System.out.println("\n");

		matrizTranspuesta = new int[tama�o2][tama�o1];
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
