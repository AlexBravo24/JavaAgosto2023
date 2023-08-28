package com; //Clase 
public class TiposDeDatos { //nombre de la clase 
	
	public static void main(String[] args) { // metodo main
		
		//comentario de una linea 
		/*
		 comentarios de mutiples lineas
		 
		 Nombres de los paquetes inician con minuscula
		 Nombre de las clases inician con mayuscula 
		 respetamos el uso de CamelCase
		 */
		
		//guardar cambios del codigo CRTL + s
		
		//DECLARACION DE TIPO DE DATOS
		/* *
		 * TIPO DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 */
		byte numero1; //declarar una variable tipo byte, sin valor asignado.
		short numero2; 
		// no pueden existir variables repetidas
		int numero3;
		long numero4;
		
		numero1 = 5; //le asignamos un valor a las variables
		numero1=9; // puede asignarle un valor.
		
		byte numero5=127; //emplea 1 byte de memoria, contiene desde el valor -128 hasta 127
		short numero6 = 32767; //emplea 2 bytes de memoria
		int numero7 = 2147483647; //emplea 4 bytes de memoria
		long numero8=123; //emplea 8 bytes de memoria
		/* 
		 * las variables de tipo long una vez qu excedad el rango de los valores "int", necesitan utilizar el sufijo "L"
		 * mayuscula
		 * */
		//INT La mas utilizada
		float numero9 = 9.899999999F; 
		
		//cadena de TEXTO (string)
		
		String cadena = "Hola mundo ";
		
		System.out.println("holamundo");

		//SALIDA DE DATOS MEDIANTE LA VISUALIZACION EN CONSOLA
				System.out.println("Hola mundo");
				
				/*Atajo para escribir esta linea es:
				 * syso CTRL+espacio
				 * 
				System.out.println(numero12);
				 
				System.out.println(numero11 + numero12);
				System.out.println("El resultado es: " + (numero11 + numero12));
		*/
	}

}
