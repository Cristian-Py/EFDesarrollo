package com.bmore.desarrolloef.repository;

import java.util.List;

import com.bmore.desarrolloef.model.Contacto;

public interface ContactoRepository {
	public void create(Contacto contacto);
	public List<Contacto> readAll();
	public void update(Contacto contacto);
	public void delete(Integer contactoId);
}
