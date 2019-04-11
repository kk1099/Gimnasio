package com.utn.modelo;

import com.utn.modelo.NombreEntrenadores;

public class Entrenadores {

	public NombreEntrenadores[] ListaEntre;
	
	public Entrenadores() {
		this.ListaEntre = new NombreEntrenadores[4];
		this.ListaEntre[0]= (NombreEntrenadores.JUAN);
		this.ListaEntre[1]= (NombreEntrenadores.PABLO);
		this.ListaEntre[2]= (NombreEntrenadores.WILSON);
		this.ListaEntre[3]= (NombreEntrenadores.ANDREAS);
		
	}
}
