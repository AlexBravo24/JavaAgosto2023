package com.condicionales;
import java.util.Scanner;

public class Condicionales06_CIAV {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio inicial por kilo de uva: ");
        double precioInicial = entrada.nextDouble();

        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipoUva = entrada.next().charAt(0);

        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        int tamUva = entrada.nextInt();

        double precioFinal = precioInicial;

        if (tipoUva == 'A') {
            if (tamUva == 1) {
                precioFinal += 0.20;
            } else if (tamUva == 2) {
                precioFinal += 0.30;
            } else {
                System.out.println("Tamaño de uva no válido. Ingrese 1 o 2.");
                return;
            }
        } else if (tipoUva == 'B') {
            if (tamUva == 1) {
                precioFinal -= 0.30;
            } else if (tamUva == 2) {
                precioFinal -= 0.50;
            } else {
                System.out.println("Tamaño de uva no válido. Ingrese 1 o 2.");
                return;
            }
        } else {
            System.out.println("Tipo de uva no válido. Ingrese 'A' o 'B'.");
            return;
        }

        System.out.println("El precio final por kilo de uva es: " + precioFinal);

        entrada.close();
    }

}
