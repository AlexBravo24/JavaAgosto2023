package com.condicionales;

import java.util.Scanner;

public class Condicionales11_SVL {

	public static void main(String[] args) {
		//Una compañía de transporte internacional tiene servicio en algunos países de
		//América del Norte, América Central, América del Sur, Europa y Asia. El costo
		//por el servicio de transporte se basa en el peso del paquete y la zona a la que
		//va dirigido. Lo anterior se muestra en la tabla:
		//    ZONA    UBICACIÓN            COSTO/KILOGRAMO
	//	    1        América del Norte      24.00 euros
	//      2        América Central        20.00 euros
	//	    3        América del Sur        21.00 euros
	//	    4        Europa                10.00 euros
	//	    5        Asia                  18.00 euros
	//	Parte de su política implica que los paquetes con un peso superior a 5 kg no son
	//	transportados, esto por cuestiones de logística y de seguridad. 
	//	Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en
	//	su caso, el rechazo de la entrega.
		
		Scanner input = new Scanner (System.in);
		int peso;
		int zona;
		
		 System.out.println("Este programa nos va a arrojar el costo del envio segun el peso y destino del paquete.");
		    System.out.println("Zonas de envío:");
		    System.out.println("1.- América del Norte");
		    System.out.println("2.- América Central");
		    System.out.println("3.- América del Sur");
		    System.out.println("4.- Europa");
		    System.out.println("5.- Asia");
		    zona = input.nextInt();
		    System.out.println("Introduce el peso del paquete en gramos: ");
		    peso = input.nextInt();
		
		    if (peso > 5){
		      System.out.println("No se puede enviar Exceso de PESO.");
		    } else if (peso < 1) {
		      System.out.println("SOLO PESOS POSITIVOS");
		    } else {
		      switch (zona) {
		      case 1:
		        System.out.println("El paquete con " + peso + " kgs. enviarlo a América del Norte CUESTA " +(peso*24) + " euros.");
		        break;
		      case 2:
		        System.out.println("El paquete de " + peso + " kgs. enviarlo a América Central CUESTA " +(peso*20) + " euros.");
		        break;
		      case 3:
		        System.out.println("El paquete de " + peso + " kgs. enviarlo a América del Sur CUESTA " +(peso*21) + " euros.");
		        break;
		      case 4:
		        System.out.println("El paquete de " + peso + " kgs. enviarlo a Europa CUESTA " +(peso*10) + " euros.");
		        break;
		      case 5:
		        System.out.println("El paquete de " + peso + " kgs. enviarlo a Asia CUESTA " +(peso*18) + " euros.");
		        break;
		      default:
		        System.out.println("ERROR: zona elegida incorrecta.");
		        break;
		      }
		    }
		

	}

}
