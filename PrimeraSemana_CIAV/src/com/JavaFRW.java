package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader
		//BufferedReader y FileWriter
		
		//Se va a intentar realizar la lectura de acrchivo de prueba
		
		String linea;
		
		//Para realizar la comunicacion efeciva de algun documento o externo
		//o comunicarnos con otro programa, es recomendable el uso de la
		//estructura "Try-Catch"
		
		try { //Se intenta ejecutar el siguiente bloque de código
			
			//Clase File - Representa el archivo de memoria
			File archivo = new File("C:\\Users\\agvil\\texto.txt");	
			
			String texto = "\nHolaMundo\n";
			//FileWriter = Pasarle una cadena a mi archivo
			FileWriter line = new FileWriter(archivo, true);
			//Para que la clase writer respete el contenido original de mi archivo, tengo que
			//indicar el valor booleano true
			
			line.write(texto); //Escribimos el string en el documento
			line.close(); // Confirmamos cambios y se cierra el proceso de escritura
			
			//LECTURA DEL ARCHIVO
			
			//FileReader - Nos permite abrir el archivo para la lectura
			FileReader fr = new FileReader(archivo);
			//BufferedReader - Puede leer el contenido de lineas del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Creamos un ciclo en caso de que el archivo tenga varias lineas de texto
			while((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) { //si ocurre un error o excepcion, se atrapa en estaestructura
			//y se ejecuta la siguiente línea
			System.out.println("No encontré el archivo");
			//Si necesito saber que esta ocurriendo con mi bloque de codigo 
			//dentro del try, puedo mandar a imprimir la traza del error
			e.printStackTrace();
		}

	}

}
