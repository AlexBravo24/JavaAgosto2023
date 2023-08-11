package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader
		// BufferdReader y FileWriter

		// Intentar realizar la lectura de un archivo de prueba

		String linea;
		/*
		 * En ocaciones para realizar la comunicacion efectiva de algun documento
		 * externo o comunicarnos con otro programa, es recomendable el uso de la
		 * estructura try & catch
		 */
		
		try {// intenta ejecutar el siguiente bloque de codigo
             //Clase File - Representar el archivo en memoria
			File archivo = new File("C:\\Users\\chave\\Desktop\\Archivo.txt");
			// la ruta de nuestro archivo
			// FileReader - Permitirnos abrir el archivo para la lectura
//			FileReader fr = new FileReader(archivo);

			// BufferReader puede leer el contenido o lineas del archivo

//			BufferedReader buffer = new BufferedReader(fr);
//	        while ((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
			
			String texto = "\nSergio Martinez\n";
			FileWriter line = new FileWriter(archivo, true);
			line.write(texto);
			line.close();
			
		} catch (Exception e) {// si ocurre un error o ecepcion,
			// se atrapa aqui y se ejecuta lo siguiente
			System.out.println("No encontre el archivo");
			/*Si necesito saber que esta corriendo con mi bloque*/
			e.printStackTrace();

		}

	}

}
