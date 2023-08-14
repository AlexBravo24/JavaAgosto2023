package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class JavaFRW {

	public static void main(String[] args) {
		
		/*Uso de las clases: 
		 * File
		 * FileReader
		 * BufferedReader
		 * FilerWriter 
		 */
		// Intentar realizar la lectura de archivo de prueba
		
		String linea;
		
		/* En ocasiones, para realizar la comunicación efectica de algún documento externo o comunicación efectiva
		 * de algún documento o comunicarnos con otro programa, es recomendable el uso de la estructura try & catch
		 */
		
		try {	//intenta ejecutar el siguiente bloque de código
			//ClaseFile - Representar el archivo en memoria
			File archivo = new File("C:\\Users\\victo\\Desktop\\archivo.txt");// Le pasamos como argumento, la ruta de nuestro archivo
			// la ruta de nuestro archivo
			//FileReader -  Permite abrir el archivo para su lectura
			/*FileReader fr = new FileReader(archivo);
			// BuuferedReader - Puede leer el contenido o líneas del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Vamos a crear un ciclo, en caso de que nuestro archivo tenga varias líneas de texto
			
			while((linea = buffer.readLine()) != null ) {
				System.out.println(linea);
			}
			*/
			String texto = "\n Victor Hugo\n";
			/* FileWriter - Escribir o pasarle un valor de caracteres
			 * o string a mi archivo*/
			
			FileWriter line =new FileWriter(archivo, true);
			/* Para que la clase Writer respere el contenido original
			del archivo, debo indicar un valor booleano*/
			
			
			line.write(texto);	//Aquí escribimos el String en el documento
			line.close();		// Aquí confirmamos cambios y cerramos el proceso de escritura
			
			
			
		} catch (Exception e) {
			// Dentro del catch nosotros elegimos lo que qeremos realizar.
			
			// si ocurre un error o exepción, se atrapa aquí y se ejecuta lo siguiente:
		System.out.println("No encontré el archivo");
		/* Si necesito saber que está ocurriendo con mi bloque de 
		 * código, dentro del try, puedo mandar a imprimir la traza
		 * del error*/
		
			e.printStackTrace();
		 
		
		
		}
	}

}
