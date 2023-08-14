package com.arrays;

public class Arrays4_JABR {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones 
		//con los siguientes valores: {1,2,3,4,5}. 
		//Guardar los valores de este array en otro array distinto 
		//pero con los valores invertidos, es decir, 
		//que el segundo array deberá tener los valores {5,4,3,2,1}.
		
		  int[] originalArray = {1, 2, 3, 4, 5};
	        int[] invertedArray = new int[originalArray.length];
	        
	        for (int i = 0; i < originalArray.length; i++) {
	            invertedArray[i] = originalArray[originalArray.length - 1 - i];
	        }
	        
	        System.out.println("Original Array:");
	        for (int num : originalArray) {
	            System.out.print(num + " ");
	        }
	        
	        System.out.println("\nInverted Array:");
	        for (int num : invertedArray) {
	            System.out.print(num + " ");
	        }

	}

}
