package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o tambien llamados bucles
		/*Nos ayudan a ejecutar "n" veces una accion (o acciones)
		 * de acuerdo a una condicion*/
		
		/*En el caso de los ciclos nos apoyamos en una variable, muchas veces
		 * numérica, booleana, etc. 	Porque de acuerdo al cambio de valor de dicha variable
		 * es como se va a ejecutar la acción*/
		
		//CICLO WHILE (Mientras..., se cumple la condicion)
		
		int x = 1;
		
//		while(x<5) {
//			System.out.println("Hola mundo");
//			x++; //Se pone este incremento como metodo de control para que la ejecución del programa no tienda al infinito
//		}
		
		
		//Ciclo DO-WHILE - Similar al ciclo while, pero aseguramos que nuestro código se ejecute al menos
		//una vez, en caso de caer en una condicion que en un inicio sea falsa, ya que la
		//condicion se evaluará al final.
//		
//		do {		//haz lo siguiente
//			System.out.println("Hola Shivan");
//		}while(x>2);
//		
//		
		//Ciclo FOR - Ciclo Determinado
		//Se utiliza cuando concemos o tenemos idea de cuantas veces necesitamos que se ejecute una accion
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hola Shivan " + i);
		}
		
	}

}
