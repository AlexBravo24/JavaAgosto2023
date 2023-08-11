package com.primersemana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader
		// BufferedReader y FileWriter
		
		// Intentar realizar la lectura de un archivo de prueba
		
		String linea;
		
		// En ocasiones para realizar la comunicacion efectiva
		// de algun documento externo o comunicarnos con otro
		// programa, es recomendable el uso de la estrctura try & catch
		
		try { // intenta ejecutar el sig bloque de codigo
			//Clase File - Representar el archivo en memoria
			
//			File archivo = new File("C:\\Users\\alami\\OneDrive\\fichero.txt"); con esta direccion manda el error 
			File archivo = new File("C:\\Users\\alami\\OneDrive\\Escritorio\\fichero.txt"); //le pasamos como argumento
//																							//la ruta de nuestro archivo
//			
//			//FileReader - Nos permite abrir el archivo para la lectura
//			FileReader fr = new FileReader(archivo);
//			
//			// BufferedReader - Puede leer el contenido o lineas del archivo
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			// Vamos a crear un ciclo, en caso de que nuestro archivo
//			//tenga varias lineas de texto
//			
//			while((linea = buffer.readLine()) != null) {
//				 System.out.println(linea);
//			}
			String texto = "\nAlanis Paulina\n";
			
			// FileWriter - Escribir o pasarle un valor de caracteres
			// o string a mi archivo
			
			FileWriter line = new FileWriter(archivo, true);
			// para que la clase writer respete el contenido original
			// de mi archivo, tengo que indicar un valor booleano
			// true
			
			line.write(texto); // Escribimos el String en el doc
			line.close(); // confirmamos cambios y se cierra el proceso
			// de escritura
			
		} catch (Exception e) { // si ocurre un error o excepcion,
			//se atrapa aqui y se ejecuta lo siguiente
			System.out.println("No encontré el archivo");
			// si necesito saber que esta ocurriendo con mi bloque
			// de codigo dentro del try
			// puedo mandar a imprimir la traza del error
			e.printStackTrace();
		}
		
		
		
		

	}

}
