package com.bmore.desarrolloef.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmore.desarrolloef.model.Estado;
import com.bmore.desarrolloef.repository.EstadoRepository;

@RestController
public class EstadoRest {

	@Autowired
	private EstadoRepository estadoRepository;
	
	@PostMapping(value = "/createEstado")
	public String create(@RequestBody Estado estado) {
		estadoRepository.create(estado);
		return "EstadO Ingresado";
	}
	
	@PostMapping(value = "/readEstado")
	public List<Estado> readAll(){
		return estadoRepository.readAll();
	}
	
	@PostMapping(value = "/updateEstado")
	public String update(@RequestBody Estado estado) {
		estadoRepository.update(estado);
		return "Estado Actualizado";
	}
	@PostMapping(value = "/deleteEstado/{estadoId}")
	public String delete(@PathVariable(name = "estadoId")Integer estadoId) {
		estadoRepository.delete(estadoId);
		return "Estado Eliminado";
	}
	
}
