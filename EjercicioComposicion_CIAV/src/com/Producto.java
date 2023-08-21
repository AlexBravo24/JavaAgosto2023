package com;

public class Producto {
	
	public int idProducto;
	public String nomProducto;
	public double precio;
	
	public Producto () {}

	public Producto(int idProducto, String nomProducto, double precio) {
		super();
		this.idProducto = idProducto;
		this.nomProducto = nomProducto;
		this.precio = precio;
	}

	public final int getIdProducto() {
		return idProducto;
	}

	public final void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public final String getNomProducto() {
		return nomProducto;
	}

	public final void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public final double getPrecio() {
		return precio;
	}

	public final void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nomProducto=" + nomProducto + ", precio=" + precio + "]";
	}
	
}
