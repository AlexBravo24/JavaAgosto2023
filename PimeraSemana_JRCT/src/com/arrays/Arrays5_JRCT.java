package com.arrays;

import java.util.Scanner;

public class Arrays5_JRCT {

	public static void main(String[] args) {
		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores:
	{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
	los valores invertidos, es decir, que el segundo array deberá tener los valores
	{5,4,3,2,1}
		 */
		 int g=0;
     
		int[]r = new int[5];
		Scanner input =new Scanner(System.in);
	
		
	
		for (int i = 0; i < r.length; i++) {
			System.out.println("ingrese un valor a invetir");
			 r[i]= input.nextInt();
		     g = i;
		}
		System.out.println("valores invertidos: " );
		
		while(g>=0) {
			System.out.print(""+ r[g] + ",");
			g--;
		}
		
		
		
		
	}

}
