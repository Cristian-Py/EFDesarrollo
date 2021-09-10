package com.bmore.desarrolloef.repository;

import java.util.List;



import com.bmore.desarrolloef.model.Ubicacion;

public interface UbicacionRepository {
	public void create(Ubicacion ubicacion);
	public List<Ubicacion> readAll();
	public void update(Ubicacion ubicacion);
	public void delete(Integer ubicacionId);
}
