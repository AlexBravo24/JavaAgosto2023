package com.ciclos;

import java.util.Scanner;

public class Ciclos9_JRCT {

	public static void main(String[] args) {
		//  Programa Java que lea dos números y muestre 
		//los números pares entre ellos
		
		Scanner input = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
	    int n = input.nextInt();
	    
	    System.out.println("ingrese otro un numero: ");
	    int na = input.nextInt();
	    input.nextLine();
	   
	  
	    
	
	    for(n = 1 ; n<=na ; n++ ) {
	    	if(n %2 == 0) {
				  System.out.println(n+ " es par");
			  }
	    }
	    
		  
	  
		
		
		
		
		
		
		
		
	}

}
