/*Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
ancho y el alto. Ejemplo: 8 x 8*/

package com.ciclos;

import java.util.Scanner;

public class Ciclos11_CIAV {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el ancho del cuadrado: ");
        int ancho = entrada.nextInt();

        System.out.print("Ingrese la altura del cuadrado: ");
        int altura = entrada.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        entrada.close();
    }
}
