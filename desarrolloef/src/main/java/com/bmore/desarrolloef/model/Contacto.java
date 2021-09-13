package com.bmore.desarrolloef.model;

public class Contacto {
	private int contacto;
	private String telefono;
	private String tipo;
	private int persona_id;
	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	@Override
	public String toString() {
		return "Contacto [contacto=" + contacto + ", telefono=" + telefono + ", tipo=" + tipo + ", persona_id="
				+ persona_id + "]";
	}
	
}
