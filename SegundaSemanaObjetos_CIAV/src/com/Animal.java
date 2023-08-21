package com;

public class Animal {
	
	//La clase nos sirve como plantilla de un objeto
	
	//El objeto lo vamos a "modelar" con atributos y comportamientos
	//Aqui empleamos el pilar de la ABSTRACCIÓN
	
	//Para ENCAPSULAR, o proteger la innformación. conamos con modificadores de acceso
	//Estos se aplican tanto a los atributos como a los metodos.
	
	private String nomrbe;
	private double peso;
	private int edad;
	private double tamaño;
	private String color;
	
	//Contamos con metodos para construir o definir valores en nuestros objetos
	
	//Métodos constructores
	
	//Principalmente se usan 2:
	
	//Método contructor vacío
	public Animal () {
		//Nos sirve para crear o instanciar un objeto sin valores asignados inicialmente
		//Nos sirve de comodín para posteriomente dar valor al ibjeto
	}
	
	//Metodo Constructor con todos los argumentos
	public Animal(String nomrbe, double peso, int edad, double tamaño, String color) {
		super();
		this.nomrbe = nomrbe;
		this.peso = peso;
		this.edad = edad;
		this.tamaño = tamaño;
		this.color = color;
	}

	public Animal(String nomrbe, double peso) {
		super();
		this.nomrbe = nomrbe;
		this.peso = peso;
	}

	
	//Por convencion casi siempre solo tenemos el constructor con todos los parametros y el constructor vacio
		//Gracias a ellos, o gracias al uso del constructor vacio podemos asignar valores a nuestro objeto
		//posteriormente con ayuda de los métodos de asignación y de obtención de valores
		
	//Metodos Getters y Setters
	//Click derecho > Source > Generate Getters y Setters
		
	//Los metodos getters permiten asignar valores
	//Los metodos setter permiten retornar valores
	
	public String getNomrbe() {
		return nomrbe;
	}

	public void setNomrbe(String nomrbe) {
		this.nomrbe = nomrbe;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//El Método toString() nos va a servir como una especie de Radiografía
	//para poder visualizar toda la composición de nuestro objeto
	@Override
	public String toString() {
		return "Animal [nomrbe=" + nomrbe + ", peso=" + peso + ", edad=" + edad + ", tamaño=" + tamaño + ", color="
				+ color + "]";
	}
	
	
}
