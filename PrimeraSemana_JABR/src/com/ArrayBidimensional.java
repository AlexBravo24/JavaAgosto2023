package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//[1][2][3][4][5][6][7][8][9]
		
		//Array de dos dimensiones, pasa de ser
		//una esctructura lineal a tener un concepto
		//de "tabla" contando ahora no solo con 
		//una fila de datos, sino también con columnas
		
		//Array - vector de datos
		//Array de dos dimensiones - matriz
		
		//0 [1][2][3]
		//1 [][][]
		//2 [][][]
		
		//Declarando un array de dos dimensiones
		int[][] matriz  = new int[3][3];
		
		//Asignar valores a la matriz, de acuerdo a cada posicion
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;
		
		//Declarando una matriz con sus valores desde un incio
		int[][] matriz2 = {{1,2,3},
						  {4,5,6},
						  {7,8,9}};
		
		//Recorrer los datos de nuestra matriz y mostrarlos
		//en consola con el uso de dos ciclos anidados
		for (int i = 0; i < 3; i++) {
			System.out.println();
		for (int j = 0; j < 3; j++) {
			System.out.print(matriz[i][j] + " ");
		}	
		}
		

	}

}
