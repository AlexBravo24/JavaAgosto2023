package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ColeccionHashMap_APMHZ {

	public static void main(String[] args) {
		
		// Los mapas permiten definir colecciones de elementos
		// que poseen pares de datos "clave-valor".
		// Se utiliza para localizar valores en función de la "clave"
		// (o key) que poseen, no puede contener claves duplicadas.
		// Tanto la "clave" como el "valor" puede ser cualquier objeto
		// En versiones anteriores este mapeado entre claves y valores
		// lo hacía la clase "Dictionary" que ha quedado obsoleta.
		
		// Map(Key, Value)
		
		// Algunos de los métodos más importantes de un Map son:
		// get(Object clave) - Obtiene el valor de una clave
		// put(k clave, V valor) - Añade un par clave-valorv al map, 
		// si ya había un valor para esa clase se lo reemplaza.
		// keySet() - Todas las claves (Devuelve un Set	= sin duplicados)	
		// values() - Todos los valores (Los valores SI pueden estar duplicados)
		// entrySet() - Todos los pares clave-valor (Devuelve un conjunto de
		// objetos Map.Entry
		
		// Ejemplo HashMap
		// Al ser del tipo "Hash" no se garantiza que se respete el orden
		//  de las claves
		Map<Integer, String> ejemploHashMap = new HashMap<>();
		ejemploHashMap.put(1, "Alanis");
		ejemploHashMap.put(4, "Paulina");
		ejemploHashMap.put(3, "Alanis");
		// salida de todo lo contenido en el mapa
		System.out.println(ejemploHashMap);
		// salida del "valor" con la clave "4"
		System.out.println(ejemploHashMap.get(4));
		// imprime solo las claves
		System.out.println(ejemploHashMap.keySet());
		// imprime solo los valores
		System.out.println(ejemploHashMap.values());
		// Imprime todos los pares clave-valor
		System.out.println(ejemploHashMap.entrySet());
		
		// TreeMap
		// Los elementos se encontrarán ordenados por orden
		// ascendente de clave
		
		Map<Double, String> ejemploTreeMap = new TreeMap<>();
		ejemploTreeMap.put(2.5, "Taza");
		ejemploTreeMap.put(4.9, "Mesa");
		ejemploTreeMap.put(0.1, "Tele");
		// salida en orden ascendente
		System.out.println(ejemploTreeMap);
		
		// Linked Hash Map 
		// Los elementos se encontrarán ordenados
		// segun se introduzcan sus valores
		Map<Double, String> ejemploLinked = new LinkedHashMap<>();
		ejemploLinked.put(2.5, "Taza");
		ejemploLinked.put(4.9, "Mesa");
		ejemploLinked.put(0.1, "Tele");
		// salida en orden de introduccion
		System.out.println(ejemploLinked);
		
		
		
		
	}

}
