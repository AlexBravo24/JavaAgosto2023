package com.primersemana;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// En un array los datos se almacenan en posiciones
		// [1] [2] [3] [4] [5] ... etc
		
		// El array de 2 posiciones, pasa de ser una estructura lineal
		// a tener un concepto de "tabla" contando ahora no solo
		// con una fila de datos, sino tambien con columnas
		
		// Array - vector de datos
		// Array de 2 dimensiones - matriz
		
		// matriz
		// [columna][fila]
		//		0		1		2
		// 0 [0, 0]	[0, 1]	[0, 2]
		// 1 [1, 0]	[1, 1]	[1, 2]
		// 2 [2, 0]	[2, 1]	[2, 2]
		
		// Declarando 1 array de 2 dimensiones
		
		int [][] matriz = new int[3][3];
		
		// Asignar valores a la matriz, de acuerdo a cada posicion
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		
		// Declarando una matriz con sus valores desde un inicio
		
		int [][] matriz2 = {{1,2,3}, {4,5,6},  {7,8,9}};
		
		// Recorrer los datos de nuestra matriz
		// y mostrarlos en consola con el uso de los ciclos anidados
		
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
		
		

	}

}
