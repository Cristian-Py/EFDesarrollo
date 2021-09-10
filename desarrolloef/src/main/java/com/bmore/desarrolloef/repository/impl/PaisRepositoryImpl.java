package com.bmore.desarrolloef.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bmore.desarrolloef.model.Pais;
import com.bmore.desarrolloef.repository.PaisRepository;

@Repository
public class PaisRepositoryImpl implements PaisRepository{

	private JdbcTemplate JdbcTemplate;
	
	@Override
	public List<Pais> readAll() {
		return JdbcTemplate.query("SELECT * FROM pais", BeanPropertyRowMapper.newInstance(Pais.class));
	}

}
