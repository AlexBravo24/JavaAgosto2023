package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Los ciclos o bucles nos ayudan a ejecutar "n" veces una acci�n 
		// de acuerdo a una condici�n.
		
		// En el caso de los cilos nos apoyamos en una cvariable, muchas veces nu�rica
		//puede ser booleana, etc. Porque de acuerdo al cambio de esa variable es como
		// se va a ejecutar la acci�n.
		
		// while - (mientras...., se cumpla una condici�n)

		int x = 1;
		
		while(x<5) {	//mientras x sea menos a 5, se realiza lo siguiente...
			System.out.println("Hola mundo");	//Se ejecuta una vez pero se vuelve a evaluar el valor de X
			// para evitar que el ciclo tienda al infinito, indicamos un incremento o decremento, seg�n sea
			// necesario
			x++; 	//indicamos un incremento de 1 para X
		
		}

			//	do-while  - Similar al ciclo while, pero aseguramos que nuestro c�digo se ejecute
			// 	al menos una vez, en caso de caer en una condici�n que en un inicio sea falsa
			// 	porque la condici�n se evaluar� al final
		
////		do { //haz lo siuiente..
////			System.out.println("hola mundo");
////		}while(x>2); 	// mientras X sea mayor a 2
////		
////		
//		// Ciclo "for" - es un ciclo determinado, se utiliza cuando conocemos o 
//		// tenemos una idea de cuantas veces queremos que se realize una acci�n
//		
//		// Ciclo "for" )variable iniciada; condici�n; incremento)
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo "+ i); // al agregar la "i" estamos indicando una iteraci�n 
			
		}
		
		
		
		
	}	//Cierre de main
}		//Cierre de clase
