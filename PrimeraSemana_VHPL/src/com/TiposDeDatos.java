package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {

	/* nombre de los paquetes - inician con minúsculas
	 * nombre de las clases - inicias con Mayúsculas
	 * Respetamos el uso de CamelCase
	 */
		
		//Declaración de tipos de datos
		
		/* Tipos de datos primitivos
		 * números entero
		 */
		
		//Declarando variables de estos tipos de datos
		
		byte numero1; //Variable declarada sin valor asignado
		short numero2; // No pueden existir nombres de variables duplicados aunque contengan distintos tipos de datos
		int numero3; // 
		long numero4; 
		
		numero1=5; //  Con las variables declaradas sin valor, podemos asignarse un valos posteriormente
		numero1=9; // Puedo asignar valores posteriores pero recordemos que existe la verticalidad por lo que ahora numero1 realmente vale 9 y s eomite su valor anterior.
		
		byte numero5 = 127; //Emplea un byte de memoria y contiene desde el valor de los -128 hasta 127
		short numero6 = 32767; //Emplea 2 butes de memoria
		int numero7 = 2147483647; //Emplea 4 bytes de memoria
		long numero8 = 2147483649L; // Las variables de tipo long, una vez exceden el rango de los valores "int" necesitan utilizar un sufijo "L" para poder contener el valor y emplean 8 bytes de meoria
		
		//La variable comodín más utilizada de los numéricos enteros es la tipo "int"
		
		/*TIPOS DE DATOS PRIMITIVPS
		 * NÚMERICOS EN PUNTO O COMA
		 */
		
		float numero9 = 9.89F; //Float ocupa 4 bytes de memoria y necesita emplear el sufijo F para poder contener el valor asignado.
		double numero10 = 9.91544551 ; //ocupa 8 bytes de almacenamiento 
		// La variable comodín a utilizar es la de tipo "double"
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * BOOLEANOS 
		 * CARACTER
		 */
		boolean evaluacion = true ; //Solamente pueden recibir 2 tipos de datos; "true" o "false"
									// Facilitan el trabajo al momento de evaluar condiciones o expresiones
		
		char caracter = 'a'; //puede contener un solo caracter y se le asigna el valor de ese caracter entre comillas simples ''
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATOS OBJETO
		 * TIPOS DE DATOS REFERENCIALES
		 * TIPOS DE DATOS WRAPPLER (ENVOLTORIO)
		 */
		
		//Cadena de Texto (String) 
		
		String cadena = "Hola mundo, hoy es martes 8 de agosto";
		String nombre = "Víctor Hugo" ; 
		// El tipo de dato String admite letras, símbolos, espacios, número, pero no por el hecho de poder admitir valores numéricos podemos hacer operaciones con ellos-
		
		// Tipos de datos Wrapper
		
		Byte numero11 = 127; 
		Short numero12 = 3000;
		Integer numero13 = 200000; 
		Long numero14 = 2000000000L;
		Double numero15 = 55.2666; 
		Float numero16 = 45.664F;
		Character letra = 'b'; 
		
		numero11.toString();  // Las funcionalidades de los tipos de dato envoltorio se visualizan despues del nombre de la variable, para utilizar esa propiedad de acuerdo a lo que necesitemos realizar.
		
		
		//Para poder darle salida a nuestros datos y visualizarlos en la consola
		System.out.println("Hola mundo");
		
		//Atajo para escribir el System.out.println es "syso+ctrl+enter"
		System.out.println(numero12);
		
		System.out.println((numero11+numero12));
		
		// Concatenación 
		System.out.println("El resultado es = " + (numero12+numero11));
		
}
	
}