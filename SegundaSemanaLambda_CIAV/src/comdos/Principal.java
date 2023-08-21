package comdos;

public class Principal {

	public static void main(String[] args) {
		
		//Lambda - Son expresiones o funciones an�nimas que implementan un m�todo
		//de una interface funcional, lo cual nos permite escribir el m�todo para
		//su uso inmediato, sin necesidad de que una clase defina el C�MO 
		//va a realizarse
		
		//Su operador es (->)
		//Su sintaxis es (par�metros) -> {cuerpo del Lambda}
		
		//Traemos una instancia de la fase funcional y definimos como realizar ese m�todo
		//con los par�metros que tiene
		IMetodo suma = (a,b) -> System.out.println("La suma es: " + (a+b));
		
		//Una vez definido podemos hacer uso inmediato de ese m�todo
		suma.operacion(456, 6898);
		
		IMetodo resta = (i,j) -> System.out.println("La resta es: " + (i-j));
		resta.operacion(3234, 234);
	}

}
