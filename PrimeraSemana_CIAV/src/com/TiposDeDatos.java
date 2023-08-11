package com;  //nombre del paquete

public class TiposDeDatos { //nombre de la clase
	
	public static void main(String[] args) {  //metodo main
		//comentarios de una linea se les pone dos diagonales
		//antes de cada enunciado
		
		/*
		 * Esto es un comentario
		 * de
		 * multiples lineas
		 * 
		 * */
		
		/*Los nombres de los paquetes - inician con minuscula
		 * Los nombres de las clases - inician con mayusculo
		 * Respetamos el uso de CamelCase
		 */
		
		//Para guardar cambios en el codigo se usa el atajo CTRL + S
		
		
		//DECLARACION DE TIPOS DE DATOS
		
		/*Tipos de datos primitivos
		 * NUMERICOS ENTEROS
		 */
		
		byte numero1; //variable declarada sin valor asignado
		short numero2; 
		//nota: no pueden existir nombres de variables duplicadas aunque contengan distinto tipo de datos
		int numero3;
		long numero4;
		
		numero1 = 5; //Se le asigna valor a una variable ya declarada
		numero1 = 9; /*Se pueden asignar valores posteriores,
		pero recordemos que existe la "verticalidad", por lo que realmente la variable vale 9 
		y se omite el valor pasado*/
		
		byte numero5 = 127; /*byte emplea un byte de memoria por lo que puede contener un valor
		desde -128 hasta 127*/
		
		short numero6 = 32767; //short emplea 2 bytes de memoria
		
		int numero7 = 2147483647; //int emplea 4 bytes de memoria
		
		long numero8 = 21474836499L; /*Las variables de tipo long, aunque maneja 8 bytes en memoria, 
		una vez que excedan el rango de los valores int, necesitan utilizar el sufijo "l" (mayuscula ominuscula)
		para poder contener el valor*/
		
		//NOTA: La variable comodin mas utilizada de los numericos enteros es la tipo "int"
		
		
		/*Tipos de datos primitivos
		 * NUMERICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		 */
		
		float numero9 = 9.430875678F; /*Float ocupa 4 bytes y necesita emplear el sufijo "F"
		para poder contener el valor asignado*/
		
		double numero10 = 893.3498234802384; //Ocupa 8 bytes y no es requerido ningun sufijo
		
		
		
		/*Tipos de datos primitivos
		 * BOOLEANOS
		 */
		
		boolean evaluar1 = true;
		boolean evaluar2 = false;
		/*Facilitan el trabajo para evaluar condiciones o expresiones
		 * y sólo admiten los valores "true" o "false"*/
		
		
		
		/*Tipos de datos primitivos
		 * CARACTERES O LETRAS
		 */
		
		char caracter = 'a';
		/*Puede contener un solo caracter y se le asigna el valor de ese caracter entre comillas simlpes*/
		
		
		
		
		/*Tipos de datos NO primitivos o Compuestos
		 * 
		 */
		
		//CADENA DE TEXTO (String)
		
		String cadena = "Hola mundo";
		
		String nombre = "Ivan Aguilar";
		
		
		//WRAPPER
		/*Envuelven a los datos de tipo primitivo para soportar mas valores del mismo tipo*/
		
		Byte numero11 = 127;
		Short numero12 = 3000;
		Integer numero13 = 2000000;
		Long numero14 = 200000000000l;
		Double numero15 = 32423.234322;
		Float numero16 = 12334.12f;
		Character letraaa = 'f';
		
		numero11.toString(); 
		/*Las funcionalidades de este tipo de dato se visualizan al escribir un punto "."
		 * despues del nombre de la variable para utilizar esa propiedad de acuerdo a lo que
		 * se necesita realizar
		 */
		
		
		
		
		//SALIDA DE DATOS MEDIANTE LA VISUALIZACION EN CONSOLA
		System.out.println("Hola mundo");
		
		/*Atajo para escribir esta linea es:
		 * syso CTRL+espacio*/
		System.out.println(numero12);
		 
		System.out.println(numero11 + numero12);
		System.out.println("El resultado es: " + (numero11 + numero12));
		
		
		
	}

}
