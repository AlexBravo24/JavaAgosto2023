package com.arrays;

public class Arrays2_SVL {
	public static void main(String[] args) {
		
		//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
	   //1 al 100. Obt�n la suma de todos ellos y la media
		
	
		
		int media, suma = 0;
        int[] promedio = new int[100];
        for (int i = 0; i < promedio.length; i++) {
            promedio[i] = i+1;
            System.out.println(promedio[i]);
            suma += i+1;
        }
        media = suma / promedio.length;
        System.out.println("La suma da " +suma);
        System.out.println("La media da " +media);
    }
 	
	}
	

