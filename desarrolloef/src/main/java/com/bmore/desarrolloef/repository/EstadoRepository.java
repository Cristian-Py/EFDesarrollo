package com.bmore.desarrolloef.repository;

import java.util.List;

import com.bmore.desarrolloef.model.Estado;

public interface EstadoRepository {
	public void create(Estado estado);
	public List<Estado> readAll();
	public void update(Estado estado);
	public void delete(Integer estadoId);
	
}
