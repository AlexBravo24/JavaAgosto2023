package com;

import java.util.Scanner;

public class ArrayBidimensional {
	public static void main(String[] args) {
		//El array de dos dimensiones pasa de ser una estructura lineal
		//a tener un concepto de tabla, pasando a tener ahora filas y columnas
		
		//Array - Vector de datos
		//Array de dos dimensiones - matriz
		
		//Posiciones en array bidimencional
		// 00 01 02
		// 10 11 12
		// 20 21 22
		
		//Declaracion de un array de dos dimensiones
//		int [][] matriz = new int [3][3];
//		
//		//Asignacion de valores de acuerdo a cada posicion
//		matriz[0][0] = 1;
//		matriz[0][1] = 2;
//		matriz[0][2] = 3;
//		matriz[1][0] = 4;
//		matriz[1][1] = 5;
//		matriz[1][2] = 6;
//		matriz[2][0] = 7;
//		matriz[2][1] = 8;
//		matriz[2][2] = 9;
//		
//		//Declarando una matriz con valores iniciales
//		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
//		
//		//Recorrer los datos de la matriz y mostrarlos en pantalla
//		for (int i = 0; i < 3; i++) {
//			System.out.println();
//		for (int j = 0; j < 3; j++) {
//			System.out.print(matriz[i][j] + " ");
//		}
//		}
//		
		//Matriz de asteriscos
		Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el ancho del cuadrado: ");
        int ancho = entrada.nextInt();

        System.out.print("Ingrese la altura del cuadrado: ");
        int altura = entrada.nextInt();
		
		char [][] matrAsteriscos = new char [altura][ancho];
		
		for (int i = 0; i < altura; i++) {
			System.out.println();
			for (int j = 0; j < ancho; j++) {
				System.out.print(matrAsteriscos[i][j] = '*');
			}
		}
		
		
		
	}
}

		