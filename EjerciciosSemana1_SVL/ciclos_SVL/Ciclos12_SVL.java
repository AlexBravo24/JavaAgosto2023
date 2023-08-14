package com.ciclos;

import java.util.Scanner;

public class Ciclos12_SVL {

	public static void main(String[] args) {
		// Ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//cuando el promedio de las edades sea superior a 25

		int edad, suma = 0, Contador = 0, Promedio=0;
		Scanner input = new Scanner (System.in);
		
		do {
			   System.out.println("Ingrese una EDAD");
			   edad=input.nextInt();
			   suma = suma+edad;
			   Contador=Contador+1;
			   Promedio=suma/Contador;
			  System.out.println("El promedio hasta ahora es " +Promedio);
			   if (Promedio>25) {
			   break;
			   }
			   
		  } while (edad>0);
		  System.out.println("LA suma de las edades es :" + suma    + " La Cantidad  de edades ingresadas fueron: "+ Contador);
		  System.out.println("El promedio es igual a: "+Promedio);
		  if (Promedio>25) {
		   System.out.println("El promedio fue mayor que 25 en " +Contador+ " Entradas y ha finalizado");
		  }else {
		   System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
		  }
		  
	}

}
