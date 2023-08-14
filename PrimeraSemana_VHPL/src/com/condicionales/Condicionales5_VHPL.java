package com.condicionales;

import java.util.Scanner;

public class Condicionales5_VHPL {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptaci�n de una solicitud en 
		//	base a los siguientes par�metros: edad, nota y sexo. 
		//	* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE 
		// 	* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		//  * Otros casos -> NO ACEPTADA

		int edad;
		double nota;
		char sexo;
		
		Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la edad: ");
        edad = input.nextInt();
        
        System.out.print("Ingrese la nota: ");
        nota = input.nextDouble();
        
        System.out.print("Ingrese el sexo (M/F): ");
        sexo = input.next().charAt(0);
        
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE - Solicitud aceptada (sexo masculino)");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA - Solicitud aceptada (sexo femenino)");
            } else {
                System.out.println("NO ACEPTADA - Sexo no v�lido");
            }
        } else {
            System.out.println("NO ACEPTADA - No cumple los requisitos m�nimos");
        }
        
        input.close();
		
	}
}
