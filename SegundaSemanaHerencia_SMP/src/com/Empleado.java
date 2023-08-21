package com;

public class Empleado extends Persona {
	
	private double salario;
	private String rfc;
	private String horario;
	
	public Empleado() {
		
	}

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
	
	

}
