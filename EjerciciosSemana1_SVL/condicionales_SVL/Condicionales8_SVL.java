package com.condicionales;

import java.util.Scanner;

public class Condicionales8_SVL {

	public static void main(String[] args) {
		
		// El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
				//debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
				//cobrar es la siguiente:
				//* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
				//* De 50 a 99 alumnos, el costo es de 70 euros.
				//* De 30 a 49 alumnos, el costo es de 95 euros.
				//* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
				//alumnos.
				//Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
				//pagar cada alumno por el viaje.

				Scanner input = new Scanner (System.in);
				int numeroAl;
				
				System.out.println("Programa calcula el costo de un viaje de estudios para unos alumnos");
				    System.out.print("N�mero de alumnos: ");
				    numeroAl = input.nextInt();
				    
				    if (numeroAl >= 100) {
				        System.out.println("El pago a la agencia es de " + numeroAl*65 + " "
				            + "euros y cada alumno debe pagar 65 euros");
				      } else if (numeroAl <100 && numeroAl >= 50) {
				        System.out.println("El pago a la agencia es de " + numeroAl*70 + " "
				            + "euros y cada alumno debe pagar 70 euros");
				      } else if (numeroAl < 50 && numeroAl >= 30) {
				        System.out.println("El pago a la agencia es de " + numeroAl*95 + " "
				            + "euros y cada alumno debe pagar 95 euros");
				      } else {
				        System.out.println("El coste del autob�s es de 4000 euros y cada alumno "
				            + "debe pagar " + (4000/numeroAl) + " euros.");
				      }
				    
				
				
			}

		}