package com.bmore.desarrolloef.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bmore.desarrolloef.model.Estado;
import com.bmore.desarrolloef.repository.EstadoRepository;

@Repository
public class EstadoRepositoryImpl implements EstadoRepository{
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public void create(Estado estado) {
		Object[] parametros = {
			estado.getNombreEstado()
		};
		JdbcTemplate.update("INSERT INTO estado (nombreEstado) VALUES(?)", parametros);
	}

	@Override
	public List<Estado> readAll() {
		return JdbcTemplate.query("SELECT * FROM estado",BeanPropertyRowMapper.newInstance(Estado.class));
	}

	@Override
	public void update(Estado estado) {
		Object[] parametros = {
				estado.getNombreEstado()
		};
		 JdbcTemplate.update("UPDATE estado SET = nombreEstado", parametros);
		
	}

	@Override
	public void delete(Integer estadoId) {
		JdbcTemplate.update("DELETE estado WHERE estadoId = ?", estadoId);
		
	}
	
	
}
