package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Ciclos o tambien llamados bucles
		//Nos ayudan a ejecutar "n" veces una acción
		//de acuerdo a una condición
		
		//en el caso de los ciclos nos apoyamos en 
		//una variable, muchas veces numerica, puede ser booleana
		//etc. Por que deacuerdo con el cambio de esa variable
		//es como se va a ejcutar una accion 

		//wile(mientras . . . . , se cumpla una condicion)
		
		int x = 1;
		
//		while (x<5) { //mientras x sea menor a 5, realiza lo sig...
//			System.out.println("Hola mundo"); // se ejecuta una vez
//			//pero vuelve a evaluar x
//			// para evitar que el ciclo este en infinito 
//			//indicamos un incremento  o decremento, segunb sea necesario
//			x++;//indicamos un incremento de 1 para x
//		}
//		
		//do-while	- similar al siclo while pero aseguramos que 
		//nuestro ciclo se ejecute almenos una vez, casa de caer en una condicion
		//que en el inicio se falla 
		//por que la condicion dea al final 
		
//		do {//haz lo siguiente
//			System.out.println("hola mundo");
//		}while(x>2);// mientras x sea mayor a 2
		
		//FOR - ciclo determinado- se utiliza cuando concocemos
		//o tenemos uan idea de cuantas veces queremos que
		//realice una accion 
		
		//ciclo for (variable inciada ; condicion; incremento)
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("hola mundo " + i);
		}
	}

}
