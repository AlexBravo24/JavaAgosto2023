package com.arrays;

import java.util.Scanner;

public class Arrays4_CIAV {
/*Dado un array de números de 5 posiciones con los siguientes valores:
{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
los valores invertidos, es decir, que el segundo array deberá tener los valores 
{5,4,3,2,1}.*/
	
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	
    	//Declaramos 2 arreglos
        int[] nums = new int [5];
        int[] numsInvert = new int[nums.length]; //el segundo arreglo se declara solo con el tamaño del primer array
        
        //Solicitamos los numeros por teclado para crear el primer arreglo
        System.out.println("Ingresa 5 números:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = entrada.nextInt();
        }
        
        //Se genera el segundo arreglo a partir de recorrer el primer arreglo de atras hacia delante
        for (int i = 0; i < nums.length; i++) {
        	numsInvert[nums.length - 1 - i] = nums[i];
        }
        
        //Imprimimos el primer arreglo
        System.out.println("Array original:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        //Imprimir el segundo arreglo
        System.out.println("\nArray invertido:");
        for (int num : numsInvert) {
            System.out.print(num + " ");
        }
        
        entrada.close();
    }
}
