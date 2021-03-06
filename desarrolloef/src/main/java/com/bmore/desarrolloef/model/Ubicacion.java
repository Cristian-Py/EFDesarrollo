package com.bmore.desarrolloef.model;

public class Ubicacion {
	private String direccion;
	private String noInterno;
	private String noExterno;
	private String Colonia;
	private String pais;
	private String estado;
	private int persona_id;
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNoInterno() {
		return noInterno;
	}
	public void setNoInterno(String noInterno) {
		this.noInterno = noInterno;
	}
	public String getNoExterno() {
		return noExterno;
	}
	public void setNoExterno(String noExterno) {
		this.noExterno = noExterno;
	}
	public String getColonia() {
		return Colonia;
	}
	public void setColonia(String colonia) {
		Colonia = colonia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	@Override
	public String toString() {
		return "Ubicacion [direccion=" + direccion + ", noInterno=" + noInterno + ", noExterno=" + noExterno
				+ ", Colonia=" + Colonia + ", pais=" + pais + ", estado=" + estado + ", persona_id=" + persona_id + "]";
	}

	
}
