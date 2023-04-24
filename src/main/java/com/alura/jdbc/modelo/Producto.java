package com.alura.jdbc.modelo;

public class Producto {
	private int id;
	private String nombre;
	private String descripcion;
	private int cantidad;
	private Integer categoriaId;
	
	public Producto(String nombre, String descripcion, int cantidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	public Producto(int id, String nombre, String descripcion, int cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	public Producto(int id, String nombre, int cantidad) {
				this.id = id;
				this.cantidad = cantidad;
				this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return String.format(
				"{id: %s, nombre: %s, descripcion: %s, cantidad: %d}", this.id, this.nombre, this.descripcion, this.cantidad);
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public Integer getId() {
		return this.id;
	}
	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
		
	}
	public int getCategoriaId() {
		return this.categoriaId;
	}
	
}
