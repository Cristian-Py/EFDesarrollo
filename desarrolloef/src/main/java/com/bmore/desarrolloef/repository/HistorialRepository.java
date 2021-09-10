package com.bmore.desarrolloef.repository;

import java.util.List;

import com.bmore.desarrolloef.model.Historial;

public interface HistorialRepository {
	public void create(Historial historial);
	public List<Historial> readAll();
	public void update(Historial historial);
	public void delete(Integer historialId);
}
