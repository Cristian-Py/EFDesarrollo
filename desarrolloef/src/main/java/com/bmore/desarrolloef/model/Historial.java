package com.bmore.desarrolloef.model;

import java.util.Date;

public class Historial {
	private int historialId;
	private String ultimoEmpleo;
	private Date fechaInicio;
	private Date fechaFinal;
	private String descripcion;
	private int persona_id;
	
	
	public int getHistorialId() {
		return historialId;
	}
	public void setHistorialId(int historialId) {
		this.historialId = historialId;
	}
	public String getUltimoEmpleo() {
		return ultimoEmpleo;
	}
	public void setUltimoEmpleo(String ultimoEmpleo) {
		this.ultimoEmpleo = ultimoEmpleo;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	@Override
	public String toString() {
		return "Historial [historialId=" + historialId + ", ultimoEmpleo=" + ultimoEmpleo + ", fechaInicio="
				+ fechaInicio + ", fechaFinal=" + fechaFinal + ", descripcion=" + descripcion + ", persona_id="
				+ persona_id + "]";
	}
	
	
}
