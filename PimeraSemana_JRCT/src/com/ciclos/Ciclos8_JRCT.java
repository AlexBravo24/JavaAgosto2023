package com.ciclos;

import java.util.Scanner;

public class Ciclos8_JRCT {

	public static void main(String[] args) {
		/*
		 * Programa Java que lea dos números y muestre 
		 * los números desde el menor hasta el mayor 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
	    int n = input.nextInt();
	    
	    System.out.println("ingrese otro un numero: ");
	    int na = input.nextInt();
	    input.nextLine();
	    
	    int suma = 0;
	    int suma1 = 0;
	    
	   if(n<=na) {
	    while(n<=na) {
	    	suma = n++;
	    	System.out.println(suma);
	    }
	   }else if(n>=na) {
		    while(n>=na) {
		    	suma1 = n++;
		    	System.out.println(suma1);
		    }
	   }
		
		
		
		
	  
	}

	}
