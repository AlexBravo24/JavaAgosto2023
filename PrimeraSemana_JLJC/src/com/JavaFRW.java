package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		//Uso de las clases FILE , FILE READER,
		// BufferedReader y FileWriter
		
		// INTENTAR LECTURA DE ARCHIVO DE PRUEBA
		String linea;
				
				/*
				 En ocasiones paa realizar la comunicacion efectiva 
				 en algun documento externo o comunicarnos con otro programa,
				 es recomendable el uso de la estructura try & catch
				   
				 */
		
		try { // intenta ejecutar el siguiente bloque de codigo
			// clase File - Representar el archivo en memoria
			
			File archivo = new File("C:\\Users\\jimen\\Desktop\\fichero.txt"); // le pasamos como argumento la ruta de nuestro archivo
			/*
			// FileReader- Permite abrir el archivo para que lo lea
			FileReader fr = new FileReader(archivo);
			
			//BufferedReader _Puede Leer el contenido del archivo.
			BufferedReader buffer = new BufferedReader (fr);
			
			//vamos a crear un ciclo
			// en caso de que nuestro archivo tenga varias lineas de texto.
			while((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			} */
			
			//----------------------------------------------------------------------------------
			
			String texto = "\n Jose Luis Jimenez\n";
			// hacemos uso de la clase 
			// File Writer - Escribir o pasarle un valor de caracteres 
			// o String a mi archivo
			
			FileWriter line = new FileWriter(archivo, true);
			// para que la clase writer respete el contenido original de mi archivo
			//tengo que indicar un valor boleano true
			
			line.write (texto); // Escribimos el String en el documento
			line.close(); //Confirmamos cambios y se cierra el proceso de escritura
			
			} catch (Exception e){ // si ocurre un error o excepcion, 
				// se atrapa aqui y se ejecuta lo siguiente
				System.out.println("no encontre el archivo");
				
				// si necesito saber que esta ocurriendo con mi bloque de codigo dentro del try
				// puedo mandar a imprimir la traza del error
				e.printStackTrace();
			}
			
	
	}
	

}
