package com.condicionales;

import java.util.Scanner;

public class Condicionales6_SVL {

	public static void main(String[] args) {
		// La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		//clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
		//es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		//entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
		//es de tamaño 2.
		//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		//tamaño 2.
		//Precio inicial se recibe desde teclado

		Scanner input = new Scanner (System.in);
		int kilos;
		double precioInicial;
		String tipo;
		int tamaño;
		
		System.out.println("Este programa calcula el precio final de las uvas segun su tipo y tamaño");
		System.out.println("Introduce los kilos de uva");
		kilos = input.nextInt();
		System.out.println("Precio por Kilo Inicial");
		precioInicial = input.nextDouble();
		System.out.println("Uva de COSTO \"A\" ó \"B\": ");
		tipo = input.next(); input.nextLine();
		System.out.println("Tipo de UVA \"1\" ó \"2\": ");
		tamaño = input.nextInt();
		
		if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
		        (tamaño == 1 || tamaño == 2))) {
		      System.out.println("ERROR EN DATOS¡¡.");
		    } else {
		      if (tipo.toUpperCase().equals("A") && tamaño == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.toUpperCase().equals("A") && tamaño == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamaño == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamaño == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		
		    }
		
		
		
		
		
		
	}

}
