package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			//ruta de nuestro archivo
			//FileReader - permitirnos abrir el archivo para la lectura 
			FileReader fr = new FileReader(archivo);
			//BufferedREader - puede leer el contenido o lineas del archivo
			BufferedReader buffer = new BufferedReader(fr);
			//vamos a crear un ciclo, en caso de que nuestro archivo tenga 
			//varias lineas de texto
			while((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
			
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

}
