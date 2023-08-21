package com;

public class Venta {
	private FechaHora hora;
	private Producto prod;
	private int cantidad;
	private Servicio servicio;
	private double total;
	
	public Venta () {}

	public Venta(FechaHora hora, Producto prod, int cantidad, Servicio servicio, double total) {
		super();
		this.hora = hora;
		this.prod = prod;
		this.cantidad = cantidad;
		this.servicio = servicio;
		this.total = total;
	}

	public final FechaHora getHora() {
		return hora;
	}

	public final void setHora(FechaHora hora) {
		this.hora = hora;
	}

	public final Producto getProd() {
		return prod;
	}

	public final void setProd(Producto prod) {
		this.prod = prod;
	}

	public final int getCantidad() {
		return cantidad;
	}

	public final void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public final Servicio getServicio() {
		return servicio;
	}

	public final void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public final double getTotal() {
		return total;
	}

	public final void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Venta [cantidad=" + cantidad + ", total=" + total + "]";
	}
	
	
	
	
	
}
