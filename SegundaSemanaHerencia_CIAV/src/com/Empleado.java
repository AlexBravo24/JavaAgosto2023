package com;

public class Empleado extends Persona{
	
	private double salario;
	private String rfc;
	private String horario;
	
	public Empleado () {}

	public Empleado(String nombre, String sexo, int edad, double salario, String rfc, String horario) {
		super(nombre, sexo, edad);
		this.salario = salario;
		this.rfc = rfc;
		this.horario = horario;
	}

	public final double getSalario() {
		return salario;
	}

	public final void setSalario(double salario) {
		this.salario = salario;
	}

	public final String getRfc() {
		return rfc;
	}

	public final void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public final String getHorario() {
		return horario;
	}

	public final void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", rfc=" + rfc + ", horario=" + horario + ", toString()="
				+ super.toString() + "]";
	}

	
	//Al heredar una clase abstracta, la clase hija de definir e implementar
	//COMO se van a realizar los metodos abstractos o no implementados en la clase Padre
	@Override
	public void trabajar() {
		System.out.println("Trabajando...");
		
	}

	@Override
	public void trabajar(int horas) {
		System.out.println("Trabajando " + horas + " horas durante el turno");
		
	}
	
	
}
