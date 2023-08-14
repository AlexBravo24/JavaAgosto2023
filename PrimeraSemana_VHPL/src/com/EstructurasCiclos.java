package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Los ciclos o bucles nos ayudan a ejecutar "n" veces una acción 
		// de acuerdo a una condición.
		
		// En el caso de los cilos nos apoyamos en una cvariable, muchas veces nuérica
		//puede ser booleana, etc. Porque de acuerdo al cambio de esa variable es como
		// se va a ejecutar la acción.
		
		// while - (mientras...., se cumpla una condición)

		int x = 1;
		
		while(x<5) {	//mientras x sea menos a 5, se realiza lo siguiente...
			System.out.println("Hola mundo");	//Se ejecuta una vez pero se vuelve a evaluar el valor de X
			// para evitar que el ciclo tienda al infinito, indicamos un incremento o decremento, según sea
			// necesario
			x++; 	//indicamos un incremento de 1 para X
		
		}

			//	do-while  - Similar al ciclo while, pero aseguramos que nuestro código se ejecute
			// 	al menos una vez, en caso de caer en una condición que en un inicio sea falsa
			// 	porque la condición se evaluará al final
		
////		do { //haz lo siuiente..
////			System.out.println("hola mundo");
////		}while(x>2); 	// mientras X sea mayor a 2
////		
////		
//		// Ciclo "for" - es un ciclo determinado, se utiliza cuando conocemos o 
//		// tenemos una idea de cuantas veces queremos que se realize una acción
//		
//		// Ciclo "for" )variable iniciada; condición; incremento)
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo "+ i); // al agregar la "i" estamos indicando una iteración 
			
		}
		
		
		
		
	}	//Cierre de main
}		//Cierre de clase
