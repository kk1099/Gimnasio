package com.utn.controlador;

public class Aspirantes{
	
	public Aspirantes nombre;
	public Categorias[] categorias;
	public static int peso=0;
	
	public Aspirantes getNombre() {
		return nombre;
	}
	public void setNombre(Aspirantes nombre) {
		this.nombre = nombre;
	}
	public Categorias[] getCategorias() {
		return categorias;
	}
	public void setCategorias(Categorias[] categorias) {
		this.categorias = categorias;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		Aspirantes.peso = peso;
	}
	
}
