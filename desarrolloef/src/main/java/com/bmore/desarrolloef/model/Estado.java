package com.bmore.desarrolloef.model;

public class Estado {
	private int estadoId;
	private String nombreEstado;
	public int getEstadoId() {
		return estadoId;
	}
	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}
	public String getNombreEstado() {
		return nombreEstado;
	}
	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}
	@Override
	public String toString() {
		return "Estado [estadoId=" + estadoId + ", nombreEstado=" + nombreEstado + "]";
	}
	
}