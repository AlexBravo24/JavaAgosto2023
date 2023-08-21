package com;

import java.util.HashMap;
//import java.util.Map;

public class ColeccionMapa {
	
	public static void main(String[] arg) {
		
		/*
		 * Los diccionarios (también conocidos como mapas o matrices asociativas) 
		 * son estructuras de datos donde cada elemento tiene asociado una clave 
		 * que usaremos para recuperarlo (en lugar del índice de una lista). 
		 * Para definirlos se utiliza la interfaz Map<K,V>. 
		 * En este caso se trabaja con dos clases una que se utiliza como clave (K) 
		 * y otra para almacenar los valores (V). 
		 * La idea es que cada elemento se almacena mediante un par de objetos (K,V). 
		 * Esta estructura de datos nos permite obtener el objeto V muy rápidamente, 
		 * a partir de su clave K.
		 */
		
		HashMap<Integer,String> diccionario = new HashMap<>();
		diccionario.put(1, "Christian");
		diccionario.put(3, "Oscar");
		diccionario.put(5, "Juan");
		diccionario.put(7, "Pedro");
		diccionario.put(0,"Alanis");
		
		System.out.println(diccionario);
		
		System.out.println("\n" + diccionario.get(3));
		
		diccionario.remove(3);
		
		System.out.println("\n" + diccionario);
		
		diccionario.put(4, "Aaron");
		
		System.out.println("\n" + diccionario);
		
		System.out.println();
		
		if (diccionario.containsKey(3)) {
			System.out.println("La clave 3 en el diccionario es: " + diccionario.get(3));
		}else {
			System.out.println("La clave 3 no esta en el diccionario");
		}
		
		System.out.println();
		
		diccionario.put(3, "Oscar");
		if (diccionario.containsKey(3)) {
			System.out.println("La clave 3 en el diccionario es: " + diccionario.get(3));
		}else {
			System.out.println("La clave 3 no esta en el diccionario");
		}
		
		System.out.println();
		for(Integer key : diccionario.keySet()) {
			System.out.println(diccionario.get(key));
		}
		
	}
}
