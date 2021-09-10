package com.bmore.desarrolloef.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmore.desarrolloef.model.Historial;
import com.bmore.desarrolloef.repository.HistorialRepository;

@RestController
public class HistorialRest {
	@Autowired
	private HistorialRepository historialRepository;
	@PostMapping(value = "/createHistorial")
	public String createHistorial(@RequestBody Historial historial) {
		historialRepository.create(historial);
		return "Historial Ingresado";
	}
	
	@PostMapping(value = "/readHistorial")
	public List<Historial>readAllHitorial(){
		return historialRepository.readAll();
	}
	
	@PostMapping(value = "/updateHistorial")
	public String update(@RequestBody Historial historial) {
		historialRepository.update(historial);
		return "Historial Actualizado";
	}
	@PostMapping(value = "/deleteHistorial/{}")
	public String deleteHistorial(@PathVariable(name = "historialId")Integer historialId) {
		historialRepository.delete(historialId);
		return "Historial Eliminado";
	}
}
