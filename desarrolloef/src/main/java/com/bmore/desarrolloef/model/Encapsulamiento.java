package com.bmore.desarrolloef.model;

public class Encapsulamiento {
	private Persona persona;
	private Ubicacion ubicacion;
	private Contacto contacto;
	private Historial historial;
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Contacto getContacto() {
		return contacto;
	}
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	public Historial getHistorial() {
		return historial;
	}
	public void setHistorial(Historial historial) {
		this.historial = historial;
	}
	@Override
	public String toString() {
		return "Encapsulamiento [persona=" + persona + ", ubicacion=" + ubicacion + ", contacto=" + contacto
				+ ", historial=" + historial + "]";
	}
	
}
