package com.condicionales;

import java.util.Scanner;

public class Condicionales11_CIAV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        int pesoPaq = entrada.nextInt();

        if (pesoPaq > 5) {
            System.out.println("El paquete no puede ser transportado debido a su peso.");
        } else {
            System.out.println("Seleccione la zona de destino:");
            System.out.println("1. América del Norte");
            System.out.println("2. América Central");
            System.out.println("3. América del Sur");
            System.out.println("4. Europa");
            System.out.println("5. Asia");

            int zonaDestino = entrada.nextInt();
            double costoKlg;

            switch (zonaDestino) {
                case 1:
                	costoKlg = 24.00;
                    break;
                case 2:
                	costoKlg = 20.00;
                    break;
                case 3:
                	costoKlg = 21.00;
                    break;
                case 4:
                	costoKlg = 10.00;
                    break;
                case 5:
                	costoKlg = 18.00;
                    break;
                default:
                	costoKlg = 0.00;
                    System.out.println("Zona inválida. Seleccione una zona del 1 al 5.");
                    break;
            }

            if (costoKlg > 0) {
                double costoTotal = pesoPaq * costoKlg;
                System.out.println("El costo por la entrega del paquete es: " + costoTotal + " euros");
            }
        }

        entrada.close();
    }

}
