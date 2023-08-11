package com.condicionales;

import java.util.Scanner;

public class Condicionales13_CIAV {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de la donación: ");
        double mtnDonac = entrada.nextDouble();

        double centroSalud;
        double comedorNinos;
        double invBolsa;

        if (mtnDonac >= 10000) {
            centroSalud = mtnDonac * 0.30;
            comedorNinos = mtnDonac * 0.50;
            invBolsa = mtnDonac - centroSalud - comedorNinos;
        } else {
            centroSalud = mtnDonac * 0.25;
            comedorNinos = mtnDonac * 0.60;
            invBolsa = mtnDonac - centroSalud - comedorNinos;
        }

        System.out.println("El monto destinado al centro de salud es: $" + centroSalud);
        System.out.println("El monto destinado al comedor de niños es: $" + comedorNinos);
        System.out.println("El monto destinado a la inversión en la bolsa es: $" + invBolsa);

        entrada.close();
    }

}
