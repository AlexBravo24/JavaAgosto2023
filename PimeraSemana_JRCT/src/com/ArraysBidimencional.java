package com;

public class ArraysBidimencional {

	public static void main(String[] args) {
		// array de dos dimencione,
		//pasa de ser un estructura lineal
		//a tener un concepto de tabla contando ahora
		//no solo con una linea de datos, 
		//si no tambien con comlumnas
		
		//array - vector de datos 
		//array de dos dimenciones  - matriz
		
		//0 [0,0][0,1][0,2]
		//1 [0,0]
		//0 [0,0]
		
		//declarando un array de dos dimenciones
		int matriz [][] = new int[3][3];
		//asignar valores a la matriz, decauerdo a su pocicion
		
		
		matriz[0][1]=1;
		matriz[0][2]=2;
		matriz[0][1]=1;
		
		matriz[1][1]=4;
		matriz[1][2]=5;
		matriz[1][1]=6;
		
		matriz[2][1]=7;
		matriz[2][2]=8;
		matriz[2][1]=9;
		// declarando una matriz con sus valores de un inicio 
		int matriz2 [][] = {{1,2,3},
				            {4,5,6},
				            {7,8,9,}};
		//recorrer los datos de nuetras matriz
		//y mostrarlo en consola con el ciclo de dos datos anidados
		for (int i = 0; i < 3; i++) {
			System.out.println();
		for (int j = 0; j < 3; j++) {
			System.out.println(matriz[i][j] + " ");
				
			}
			
			
		}
	}

}
