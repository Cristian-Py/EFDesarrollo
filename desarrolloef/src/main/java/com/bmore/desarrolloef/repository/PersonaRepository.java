package com.bmore.desarrolloef.repository;

import java.util.List;

import com.bmore.desarrolloef.model.Persona;

public interface PersonaRepository {
	public void create(Persona persona);
	public List<Persona> readAll();
	public void update(Persona persona);
	public void delete(Integer personaId);
}
