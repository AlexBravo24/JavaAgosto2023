package com.ciclos;

import java.util.Scanner;

public class Ciclos3_CIAV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Se Solicita la cadena de texto al usuario
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = entrada.nextLine();

        // Verificar si contiene caracteres especiales
        boolean contCharEsp = false;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
            	contCharEsp = true;
                break;
            }
        }

        if (contCharEsp) {
            System.out.println("Favor de introducir una cadena válida solo con letras y/o números.");
        } else {
            // Se Convierte la cadena a minúsculas para la verificar si es palíndromo
            cadena = cadena.toLowerCase();

            // Se Verifica si es palíndromo
            boolean esPal = true;
            int inicio = 0;
            int fin = cadena.length() - 1;
            while (inicio < fin) {
                if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                	esPal = false;
                    break;
                }
                inicio++;
                fin--;
            }

            // Se Muestra el resultado de la verificación de palíndromo
            if (esPal) {
                System.out.println("La cadena es un palíndromo.");
            } else {
                System.out.println("La cadena no es un palíndromo.");
            }
        }

        entrada.close();
    }

}
