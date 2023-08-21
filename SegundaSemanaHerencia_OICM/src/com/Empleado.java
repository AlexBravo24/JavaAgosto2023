package com;

//La HERENCIA, se realiza con la palabra
//reservada "extends", despúes del nombre
//de la clase que hereda
public class Empleado extends Persona {
	
	//Esta sería la case hija
	//Puede tener sus propios atributos
	
	private double salario;
	private String rfc;
	private String horario;
	
	public Empleado () {}
	
	//Constructor con todos los parametros de Empleado
	//Más los paraámetros de la clase padre persona
	
	public Empleado(String nombre, String genero, int edad, double salario, String rfc, String horario) {
		super(nombre, genero, edad);
		this.salario = salario;
		this.rfc = rfc;
		this.horario = horario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", rfc=" + rfc + ", horario=" + horario + ", toString()="
				+ super.toString() + "]";
	}
	
	//Al heredar de una clase abstracta, la clase hija 
	//debe implementar y definir como se van a realizar
	//los m[etodos abstractos o m[etodos no implementados
	//en la clase Padre
	@Override
	public void trabajar() {
		System.out.println("Trabajando...");
	}
	
	public void trabajar(int horas) {
		System.out.println("Trabajando "+horas+" Horas en el turno.");
	}
	
}
