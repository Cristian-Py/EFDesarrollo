package com.bmore.desarrolloef.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmore.desarrolloef.model.Ubicacion;
import com.bmore.desarrolloef.repository.UbicacionRepository;



@RestController
public class ubicacionRest {
	
	@Autowired
	private UbicacionRepository ubicacionRepository;
	
	@PostMapping(value = "/createUbicacion")
	public String create(@RequestBody Ubicacion ubicacion) {
		ubicacionRepository.create(ubicacion);
		return "Ubicacion Ingresada";
	}
	
	@PostMapping(value = "/readUbicacion")
	public List<Ubicacion> readAll(){
		return ubicacionRepository.readAll();
	}
	
	@PostMapping(value = "/updateUbicacion")
	public String update(@RequestBody Ubicacion ubicacion) {
		ubicacionRepository.update(ubicacion);
		return "Ubicacion Actualizada";
	}
	@PostMapping(value = "/deleteUbicacion/{ubicacionId}")
	public String delete(@PathVariable(name = "personaId")Integer ubicacionId) {
		ubicacionRepository.delete(ubicacionId);
		return "Ubicacion Eliminada";
	}
}
