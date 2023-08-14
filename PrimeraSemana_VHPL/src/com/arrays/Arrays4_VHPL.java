package com.arrays;

public class Arrays4_VHPL {

	public static void main(String[] args) {
		
		/* Dado un array de números de 5 posiciones con los siguientes valores: 
		  {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero 
		  con los valores invertidos, es decir, que el segundo array deberá tener 
		  los valores {5,4,3,2,1}. */
		
		int[] normal = new int [5];
		
		int[] invertido = new int[normal.length];
				
		for (int i = 0; i < normal.length; i++) {
			invertido[] = normal[normal.length - 1 - i]; 
		}
	
		 int[] normal = {1, 2, 3, 4, 5};
	     int[] invertido = new int[normal.length];

	        for (int i = 0; i < normal.length; i++) {
	            invertido[i] = normal[normal.length - 1 - i];
	        }

	        System.out.println("Forma ordenada inicial: " );
	        System.out.println(normal);

	        System.out.println("Forma invertida: ");
	        System.out.println(invertido);
	        
	        
		
} //main
} // clase
