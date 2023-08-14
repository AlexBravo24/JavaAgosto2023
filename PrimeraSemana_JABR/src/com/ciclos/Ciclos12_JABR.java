package com.ciclos;

import java.util.Scanner;

public class Ciclos12_JABR {

	public static void main(String[] args) {
		//12. Se ingresan un conjunto de n edades de personas por teclado. 
		//El programa finalizara cuando el promedio de las edades sea superior a 25.
		Scanner scanner = new Scanner(System.in);
        
        int sumaEdades = 0;
        int cantidadEdades = 0;
        
        while (true) {
            System.out.print("Ingresa una edad (o ingresa un número negativo para terminar): ");
            int edad = scanner.nextInt();
            
            if (edad < 0) {
                break; // Termina el ciclo si se ingresa una edad negativa
            }
            
            sumaEdades += edad;
            cantidadEdades++;
            
            double promedio = (double) sumaEdades / cantidadEdades;
            System.out.println("Promedio actual de edades: " + promedio);
            
            if (promedio > 25) {
                System.out.println("El promedio de edades es superior a 25. Fin del programa.");
                break; //Termina el ciclo cuando el promedio sea mayor a 25
            }
        }
        
        scanner.close();
	}

}
