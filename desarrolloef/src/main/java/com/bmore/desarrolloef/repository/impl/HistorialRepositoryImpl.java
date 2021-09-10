package com.bmore.desarrolloef.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bmore.desarrolloef.model.Historial;
import com.bmore.desarrolloef.repository.HistorialRepository;

@Repository
public class HistorialRepositoryImpl implements HistorialRepository{
	
	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	@Override
	public void create(Historial historial) {
		Object[] parametros = {
			historial.getUltimoEmpleo(),
			historial.getFechaInicio(),
			historial.getFechaFinal(),
			historial.getDescripcion(),
			historial.getPersona_id()
		};
		JdbcTemplate.update("INSERT INTO historial (ultimoEmpleo, fechaInicio, fechaFinal, descripcion, persona_id)"
				+ "VALUES(?, ?, ? , ? ,?)",parametros);
		
	}

	@Override
	public List<Historial> readAll() {
		return JdbcTemplate.query("SELECT * FROM historial",BeanPropertyRowMapper.newInstance(Historial.class));
	}

	@Override
	public void update(Historial historial) {
		Object[] parametros = {
				historial.getUltimoEmpleo(),
				historial.getFechaInicio(),
				historial.getFechaFinal(),
				historial.getDescripcion(),
			};
		JdbcTemplate.update("UPDATE historial SET ultimoEmpleo = ?, fechaInicio = ?, fechaFinal = ?"
				+ "descripcion = ? WHERE historialId = ?", parametros);
		
	}

	@Override
	public void delete(Integer historialId) {
		JdbcTemplate.update("DELETE historial WHERE historialId = ?", historialId);
		
	}

}
