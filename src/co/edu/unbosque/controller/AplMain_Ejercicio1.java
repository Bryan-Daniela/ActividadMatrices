package co.edu.unbosque.controller;

import java.util.Random;
import java.util.Scanner;

import co.edu.unbosque.model.Ejercicio1;

public class AplMain_Ejercicio1 {

	public static int matriz1[][];
	public static int matriz2[][];
	private static int tamaño1;
	private static int tamaño2;

	Ejercicio1[] arregloHilos;

	public AplMain_Ejercicio1(int procesadores) {
		arregloHilos = new Ejercicio1[procesadores];
		for (int i = 0; i < arregloHilos.length; i++) {
			arregloHilos[i] = new Ejercicio1(matriz1, matriz2);

		}
		int index = 0;
		while (index< matriz1.length) {
			arregloHilos[index].start();
			index++;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("INGRESE EL TAMAÑO DE LA MATRIZ: ");
		tamaño1 = sc.nextInt();
		matriz1 = new int[tamaño1][tamaño1];
		generarMatriz1();

		System.out.println("INGRESE EL NUMERO DE COLUMNAS:");
		tamaño2 = sc.nextInt();
		matriz2 = new int[tamaño1][tamaño2];
		generarmatriz2();

		System.out.println("LA MATRIZ RESULTANTE DE LA MULTIPLICACION ES:");

		Ejercicio1 e1 = new Ejercicio1(matriz1, matriz2);

		Runtime runtime = Runtime.getRuntime();
		int procesadoresLogicos = runtime.availableProcessors();
		AplMain_Ejercicio1 a1 = new AplMain_Ejercicio1(procesadoresLogicos);

		a1.imprimirMultiplicacion();

	}

	public static void generarMatriz1() {

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				int numeros = matriz1[i][j] = (int) (Math.random() * 100);
				numeros = matriz1[i][j];
				System.out.print(matriz1[i][j] + "   ");

			}
			System.out.println("\n");

		}
	}

	public static void generarmatriz2() {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = (int) (Math.random() * 100);
				System.out.print(matriz2[i][j] + "  ");

			}
			System.out.println("\n");

		}

	}

	public void imprimirMultiplicacion() {
		for (int i = 0; i < Ejercicio1.matriz3.length; i++) {
			for (int j = 0; j < Ejercicio1.matriz3[i].length; j++) {
				System.out.print(Ejercicio1.matriz3[i][j] + "  ");

			}
			System.out.println("\n");
		}

	}

}
