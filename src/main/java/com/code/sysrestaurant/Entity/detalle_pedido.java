package com.code.sysrestaurant.Entity;

public class detalle_pedido {

	public int iddetalle_pedido;
	public 	double precio;
	public int cantidad;

	public int getIddetalle_pedido() {
		return iddetalle_pedido;
	}

	public void setIddetalle_pedido(int iddetalle_pedido) {
		this.iddetalle_pedido = iddetalle_pedido;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
