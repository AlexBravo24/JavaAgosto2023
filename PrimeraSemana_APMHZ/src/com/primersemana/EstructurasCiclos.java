package com.primersemana;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS O TAMBIEN LLAMADOS BUCLES
		// Nos ayudan a ejecutar "n" veces una acción
		// de acuerdo a una condición
		
		// En el caso de los ciclos nos apoyamos en una
		// variables, muchas veces numérica, puede ser booleana
		// etc. Porque de acuerdo al cambio de esa variable
		// es como se va a ejecutar la acción
		
		//while (Mientras..., se cumpla una condicion)
		
		int x = 1;
		
//		while(x<5) { //mientras x sea menor que 5, realiza lo sig.
//			System.out.println("Hola mundo"); // se ejecuta 1 vez
//			// pero se vuelve a evaluar el valor de x
//			// para evitar que el ciclo tienda a infinito
//			// indicamos un incremento o decremento, segun sea necesario
//			
//			x++; // indicamos un incremento de 1 para x
//			
//		}
		
		// do-while - Similar al ciclo while, pero asegurarnos que
		// nuestro codigo se ejecute al menos 1 vez,
		// en caso de caer en una condicion que en un inicio sea falsa
		// porque la ejecucion se evaluara al final
		
//		do { // Haz lo siguiente
//			System.out.println("Hola mundo");
//		} 
//		while (x>2); //mientras x sea mayor que 2
		
		// FOR - Determinado - Se utiliza cuando conocemos
		// o tenemos una idea de cuantas veces queremos que 
		// se realice una accion
		
		// Ciclo for (variable iniciada; condicion; incremento)
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo " + i);
			
		}
		

	}

}
