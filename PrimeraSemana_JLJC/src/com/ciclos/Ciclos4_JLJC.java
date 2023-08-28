package com.ciclos;

import java.util.Scanner;

public class Ciclos4_JLJC {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Se Solicita una frase al usuario
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = entrada.nextLine();

        // Se solicita el caracter a verificar
        System.out.print("Ingrese un caracter para indicar cuantas veces se repite en la cadena: ");
        char letra = entrada.next().charAt(0);

        // Se convierte la cadena a minúsculas para hacer la búsqueda sin importar si son mayúsculas/minúsculas
        cadena = cadena.toLowerCase();

        // Se cuenta la cantidad de veces que aparece la letra en la cadena
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }

        // Mostrar el resultado
        if (contador > 0) {
            System.out.println("El carácter '" + letra + "' aparece " + contador + " veces en la cadena.");
        } else {
            System.out.println("Carácter no encontrado.");
        }

        entrada.close();
    }

}
