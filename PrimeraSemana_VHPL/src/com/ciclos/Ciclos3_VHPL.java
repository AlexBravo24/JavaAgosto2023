package com.ciclos;

import java.util.Scanner;

public class Ciclos3_VHPL {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.
		
		
		Scanner input = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabras;				// La variable es de tipo caracter y tenemos que usar una string 
        palabras = input.nextLine();
        
        boolean palindromo;			// usamos un boolean para determinar si es verdadera o falsa la decisión
        palindromo = true;
       
        
        for (int i = 0; i < palabras.length() / 2; i++) {			//el .length se usara para determinar el límite de una palabra
			if(palabras.charAt(i) != palabras.charAt(palabras.length()-1-i)) {		//El charAt es para seleccionar una posición de la palabra o sea la letra, y con ()-1-i) lo posicionamos del último dígitp al primero
			palindromo = false;
			break; 
			}
		}
        if (palindromo) {
        	System.out.println("La palabra seleccionada es un palíndromo");
        } else {
        	System.out.println("La palabra seleccionada NO es un palíndromo");
        }
        
        input.close();
        
        
        
        
        

//        boolean esPalindromo = true;
//
//        for (int i = 0; i < cadena.length() / 2; i++) {
//            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
//                esPalindromo = false;
//                break;  // Salir del bucle si se encuentra una diferencia
//            }
//        }
//
//        if (esPalindromo) {
//            System.out.println("La cadena es un palíndromo.");
//        } else {
//            System.out.println("La cadena no es un palíndromo.");
//        }
//
//        scanner.close();

	}

}
