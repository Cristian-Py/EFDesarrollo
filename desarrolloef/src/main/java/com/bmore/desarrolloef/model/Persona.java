package com.bmore.desarrolloef.model;

import java.util.Date;

public class Persona {
	private int personaId;
	private String nombreP;
	private String apePaterno;
	private String apeMaterno;
	private String sexo;
	private Date fecha;
	private String curp;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Persona(int personaId, String nombreP, String apePaterno, String apeMaterno, String sexo, Date fecha,
			String curp) {
		super();
		this.personaId = personaId;
		this.nombreP = nombreP;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.sexo = sexo;
		this.fecha = fecha;
		this.curp = curp;
	}


	public int getPersonaId() {
		return personaId;
	}
	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	@Override
	public String toString() {
		return "Persona [personaId=" + personaId + ", nombre=" + nombreP + ", apePaterno=" + apePaterno + ", apeMaterno="
				+ apeMaterno + ", sexo=" + sexo + ", fecha=" + fecha + ", curp=" + curp + "]";
	}
	
}
