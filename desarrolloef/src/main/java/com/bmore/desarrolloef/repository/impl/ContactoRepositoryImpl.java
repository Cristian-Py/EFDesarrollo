package com.bmore.desarrolloef.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.bmore.desarrolloef.model.Contacto;
import com.bmore.desarrolloef.repository.ContactoRepository;

@Repository
public class ContactoRepositoryImpl implements ContactoRepository{

	@Autowired
	JdbcTemplate JdbcTemplate; 
	
	@Override
	public void create(Contacto contacto) {
		
		Object[]  parametros = {
				contacto.getTelefono(),
				contacto.getTipo(),
				contacto.getPersona_id()
		};
		JdbcTemplate.update("INSERT INTO contactos (telefono, tipo, persona_id) VALUES (?,?,?)",parametros);
		
	}

	@Override
	public List<Contacto> readAll() {
		return JdbcTemplate.query("SELECT * FROM contacto", BeanPropertyRowMapper.newInstance(Contacto.class));
	}

	@Override
	public void update(Contacto contacto) {
		Object[]  parametros = {
				contacto.getTelefono(),
				contacto.getTipo(),
				contacto.getPersona_id()
		};
		JdbcTemplate.update("UPDATE persona SET telefono = ?, tipo = ? WHERE contactoId", parametros);
		
	}

	@Override
	public void delete(Integer contactoId) {
		JdbcTemplate.update("DELETE contacto WHERE contactoId = ?", contactoId);
		
	}

}
