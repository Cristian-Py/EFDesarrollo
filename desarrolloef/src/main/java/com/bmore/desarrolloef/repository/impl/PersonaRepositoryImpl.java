package com.bmore.desarrolloef.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bmore.desarrolloef.model.Persona;
import com.bmore.desarrolloef.repository.PersonaRepository;

@Repository
public class PersonaRepositoryImpl implements PersonaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(Persona persona) {
		Object[] parametros = { persona.getNombreP(), persona.getApePaterno(), persona.getApeMaterno(),
				persona.getSexo(), persona.getFecha(), persona.getCurp(),

		};
		jdbcTemplate.update("INSERT INTO persona (nombreP, apePaterno,"
				+ "apeMaterno, sexo, fecha,curp) VALUES(?,?,?,?,?,?)",parametros);
	}

	@Override
	public List<Persona> readAll() {
		return jdbcTemplate.query("SELECT * FROM persona", BeanPropertyRowMapper.newInstance(Persona.class));

	}

	@Override
	public void update(Persona persona) {
		Object[] parametros = { persona.getNombreP(), persona.getApePaterno(), persona.getApeMaterno(),
				persona.getSexo(), persona.getFecha(), persona.getCurp(),

		};
		jdbcTemplate.update("UPDATE persona SET nombreP = ?, apePaterno = ?,"
				+ "apeMaterno=?, sexo=?,fecha=?, curp=? WHERE personaId = ?", parametros);

	}

	@Override
	public void delete(Integer personaId) {
		jdbcTemplate.update("DELETE persona WHERE personaId = ?", personaId);

	}
}
