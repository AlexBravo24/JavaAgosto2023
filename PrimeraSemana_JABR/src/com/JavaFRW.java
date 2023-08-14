package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		//Uso de las clases File, FileReader
		//BufferedReader y FileWriter
		
		//Intentar realizar la lectura de archivo de prueba
		String linea;
		
		//En ocasiones para realizar la comunicacion efectiva
		//de algun documento externo o comunicarnos con otro
		//programa, es recomendable el uso de la estructura
		//try & catch
		
		try {//intenta ejecutar el siguiente bloque de codigo
			//Clase File - Representar el archivo en memoria
			File archivo = new File("C:\\Users\\Jorge Alejandro\\Desktop\\fichero.txt");//le pasamos como argumento
			//la ruta del nuestro archivo
//			//FileReader - Permitirnos abrir el archivo para la lectura
//			FileReader fr = new FileReader(archivo);
//			//BufferedReader - Puede leer el contenido o lineas del archivo
//			BufferedReader buffer = new BufferedReader(fr);
//			//Vamos a crear un ciclo, en caso de que nuestro archivo
//			//tenga varias lineas de texto
//			while((linea = buffer.readLine()) !=null) {
//				System.out.println(linea);
//			}
			String texto = "\nJorge Alejandro\n";
			//FileWriter - Escribri o pasarle un valor de caracteres
			//o String a mi archivo
			FileWriter line = new FileWriter(archivo, true);
			//para que la clase Writer respete el contenido original
			//de mi archivo, tengo que indicar un valor booleano
			//true
			
			line.write(texto); //Escribimos el String en el documento
			line.close();//confirmamos cambios y se cierra el proceso
			//de escritura
			
			
		} catch (Exception e) {//si ocurre un error o excepcion,
			//se atrapa aqui y se ejecuta lo siguiente
			System.out.println("No encontre el archivo");
			//Si necesito saber que esta ocurriendo con mi bloque
			//de codigo dentro del try
			//puedo mandar a imprimir la traza del error
			e.printStackTrace();
		}
		
		
		

	}

}
