package com;

public class Principal {
	
	//En la POO, solo existe una clase con 
	//el método principal
	//(Una clase que se encargará de ejecutar
	//la lógica de las demás

	public static void main(String[] args) {
		
		//Al momento de crear un objeto, traemos al 
		//nombre de la clase y posteriormente su variable
		//tambien conocida como instancia u objeto
		//Creando un objeto perro con todos sus argumentos
		Animal perro = new Animal("Fido",4.5, 2, 1.5, "Cafe");

		//perro.nombre = "Fido"; //manera incorrecta de asignar un valor a mi variable 
		//a mi atributo
		
		//Crear otro animal, un objeto gato,con el constructor vacio
		Animal gato = new Animal();
		
		gato.setNombre("Kitty");  //Asignando valor a un atributo
		//con su metodo setter
		
		//Dandole salida a  alguno de los datos de mis objetos
		System.out.println(perro.getNombre());
		
		//Darle uns salida a todos los datos d emi i=objeto
		System.out.println(perro);
		System.out.println(gato);
		
		//Crear 5 plantillas para crear 2 objetos de cada una 
		//Uno lo van a crear con el constructor vacio
		//y le asignan un valor a  algun atributo posterirormente
		//Y otro lo crean con todos sus argumentos
		
		Celular iphone = new Celular("Retina", 128, "16", 100, 8);
		Celular samsung = new Celular();
//		Celular.setPrecio(15000); //Aqui vemos como podemos
		//con una variable static, aun asi modificar su precio, pero cambia
		//para todas las instancias de la clase.
		
		samsung.setRam(12);
		
		
		System.out.println(iphone);
		System.out.println(samsung);
		
		
	}

}
