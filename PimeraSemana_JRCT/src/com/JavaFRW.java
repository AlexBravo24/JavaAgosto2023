package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		/*
		 * Uso de las clases file, FileReader
		 * BufferedReader y FileWriter
		 */
		
		//intentar realizar la lectura del archivo de prueba
		
		String linea;
		
		//En ocaciones para realizar la comunicacion efectiva
		//de algun documento externo o comunicarnos con otro
		//programa es recomendable ul¿tlizar la estructura
		// try catch
		
		try {//intenta ejecutar el siguiente bloque de codigo
			//clase file -representar el archivo de memoria
			File archivo = new File("C:\\Users\\JRkar\\Desktop\\fichero.txt");//le pasamos como argumento la 
//			//ruta de nuestro archivo
//			//FileReader - permitirnos abrir el archivo para la lectura 
//			FileReader fr = new FileReader(archivo);
//			//BufferedREader - puede leer el contenido o lineas del archivo
//			BufferedReader buffer = new BufferedReader(fr);
//			//vamos a crear un ciclo, en caso de que nuestro archivo tenga 
//			//varias lineas de texto
//			while((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
			
			String texto = "\nJuan Rafael\n";
			//FileWrite - escribir o pasarle un valor  de caracater
			//o sString a mi archivo
			FileWriter line = new FileWriter(archivo, true);
			//para que la clase writer respete el contenido original
			//de mi archivo, tengo que indicar un valor booleano
			//true
			
			line.write(texto);//escribimos en el string del documento
			//
			line.close();//confirmamos cambios y cierra el proceso
			

			
			
		} catch (Exception e) {//si ocurre un error o excepcion,
			//se atrapa aqui y se ejecuta lo siguiente
			System.out.println("No encontre el Archivo");
			// si necesito saber que esta ocurriendo
			//con mi bloque del codigo try
			//puedo mandar a imprimir ta taza del error
			e.printStackTrace();
		}

	}

}
