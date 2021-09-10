package com.bmore.desarrolloef.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmore.desarrolloef.model.Pais;
import com.bmore.desarrolloef.repository.PaisRepository;

@RestController
public class PaisRest {
	
	@Autowired
	private PaisRepository paisRepository;
	
	@PostMapping(value = "/readPais")
	public List<Pais>readAll(){
		return paisRepository.readAll();
	}
}
