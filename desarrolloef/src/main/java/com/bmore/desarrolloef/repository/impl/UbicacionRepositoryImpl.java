package com.bmore.desarrolloef.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bmore.desarrolloef.model.Ubicacion;
import com.bmore.desarrolloef.repository.UbicacionRepository;

@Repository
public class UbicacionRepositoryImpl implements UbicacionRepository{
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public void create(Ubicacion ubicacion) {
		Object[] parametros = {
			ubicacion.getDireccion(),
			ubicacion.getNoInterno(),
			ubicacion.getNoExterno(),
			ubicacion.getColonia(),
			ubicacion.getPais(),
			ubicacion.getEstado(),
			ubicacion.getPersona_id()
		};
		JdbcTemplate.update("INSERT INTO ubicacion (direccion, noInterno, noExterno,"
				+ "colonia, pais, estado, persona_id)"
				+ " VALUES(?,?,?,?,?,?,?)",parametros);
	}

	@Override
	public List<Ubicacion> readAll() {
		
		return JdbcTemplate.query("SELECT * FROM ubicacion", BeanPropertyRowMapper.newInstance(Ubicacion.class));
	}

	@Override
	public void update(Ubicacion ubicacion) {
		Object[] parametros = {
				ubicacion.getDireccion(),
				ubicacion.getNoInterno(),
				ubicacion.getNoExterno(),
				ubicacion.getColonia(),
				ubicacion.getPais(),
				ubicacion.getEstado(),
				ubicacion.getPersona_id()
			};
		JdbcTemplate.update("UPDATE ubicacion SET direccion = ?, noInterno = ?, noExterno = ?, "
				+ "colonia = ?, pais = ?, estado= ?",parametros);
		
	}

	@Override
	public void delete(Integer ubicacionId) {
		JdbcTemplate.update("DELETE ubicacion WHERE ubicacionId = ?", ubicacionId);
		
	}

}
