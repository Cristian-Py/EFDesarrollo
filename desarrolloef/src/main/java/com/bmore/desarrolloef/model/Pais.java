package com.bmore.desarrolloef.model;

public class Pais {
	private int paisId;
	private String nombre;
	
	public int getPaisId() {
		return paisId;
	}
	public void setPaisId(int paisId) {
		this.paisId = paisId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Pais [paisId=" + paisId + ", nombre=" + nombre + "]";
	}
	
}
