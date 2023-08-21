package com;

//Se necesita importar la interfaz HashMap de la biblioteca Java.util
import java.util.HashMap;

public class ColeccionHashMap_CIAV {

	public static void main(String[] args) {
		//Un HashMap es una estructura de datos que implementa la interfaz Map en Java.
		//Representa una colecci�n de pares clave-valor, donde cada clave est� asociada a un valor.
		//Se puede almacenar y recuperar valores utilizando una clave �nica asociada a cada valor.
		//Es muy eficiente para la b�squeda y recuperaci�n de elementos basados en una clave.
		
		//Declaracion e instancia de un objeto de la clase HashMap.
		
		//Para la decalaracion se necesita especifica los tipos de datos de las claves y los valores 
		//que planeas almacenar en el HashMap. Por ejemplo, si deseas almacenar cadenas como claves 
		//y enteros como valores, se puede hacer de la siguiente manera
		
		HashMap<String, Integer> miHashMap = new HashMap<>();
		
		//Se agregan pares clave-valor al HashMap utilizando el m�todo put():
		
		miHashMap.put("Clave1", 10);
		miHashMap.put("Clave2", 20);
		miHashMap.put("Clave3", 30);
		
		System.out.println(miHashMap);
		
		//Para recuperar valores se utilizan las claves con el m�todo get():
		
		int valor = miHashMap.get("Clave2");
		System.out.println("Valor asociado a Clave2: " + valor);
		
		//Se puede hacer de manera inversa:
		
		HashMap<Integer, String> miHashMap2 = new HashMap<>();
		
		miHashMap2.put(1, "aaa");
		miHashMap2.put(2, "bbb");
		miHashMap2.put(3, "ccc");
		
		System.out.println(miHashMap2);
		
		String valor2 = miHashMap2.get(2);
		System.out.println("Valor asociado a la clave 2 es: " + valor2);
		
		//Se puede verificar si una clave espec�fica existe en el HashMap utilizando el m�todo containsKey():
		
		boolean existeClave = miHashMap.containsKey("Clave1");
		System.out.println("�Existe la clave Clave1? " + existeClave);
		
		// Imprimir el tama�o del HashMap
        System.out.println("Tama�o del HashMap: " + miHashMap.size());
        
        // Verificar si el HashMap est� vac�o
        System.out.println("�El HashMap est� vac�o? " + miHashMap.isEmpty());
        
        // Actualizar un valor
        miHashMap.put("OtroValor", 3);
        System.out.println("Nuevo valor: " + miHashMap.get("OtroValor"));
        
     // Recorrer y mostrar todas las claves del HashMap
        System.out.println("Claves en el HashMap:");
        for (String clave : miHashMap.keySet()) {
            System.out.println(clave);
        }

        // Recorrer y mostrar todos los valores del HashMap
        System.out.println("Valores en el HashMap:");
        for (int val : miHashMap.values()) {
            System.out.println(val);
        }
        
     // Eliminar un elemento del HashMap
        miHashMap.remove("Clave2");
        System.out.println(miHashMap);
        System.out.println("Tama�o del HashMap despu�s de eliminar: " + miHashMap.size());

	}

}
