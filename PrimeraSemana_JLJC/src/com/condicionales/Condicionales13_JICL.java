package com.condicionales;
import java.util.Scanner;//librer�a scanner


public class Condicionales13_JICL {

	public static void main(String[] args) {
		/*Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:

		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os
		y el resto se invierte en la bolsa.
		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
		ni�os y el resto se invierte en la bolsa.

		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		*/
		Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de la donaci�n: ");
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
        System.out.println("El monto destinado al comedor de ni�os es: $" + comedorNinos);
        System.out.println("El monto destinado a la inversi�n en la bolsa es: $" + invBolsa);

        entrada.close();
	}

}
