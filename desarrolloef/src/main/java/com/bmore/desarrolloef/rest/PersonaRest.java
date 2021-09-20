package com.bmore.desarrolloef.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmore.desarrolloef.model.Contacto;
import com.bmore.desarrolloef.model.Encapsulamiento;
import com.bmore.desarrolloef.model.Historial;
import com.bmore.desarrolloef.model.Persona;
import com.bmore.desarrolloef.model.Ubicacion;
import com.bmore.desarrolloef.repository.ContactoRepository;
import com.bmore.desarrolloef.repository.HistorialRepository;
import com.bmore.desarrolloef.repository.PersonaRepository;
import com.bmore.desarrolloef.repository.UbicacionRepository;

@RestController
public class PersonaRest {

		@Autowired
		private PersonaRepository personaRepository;
		private HistorialRepository historialRepository;
		private ContactoRepository contactoRepository;
		private UbicacionRepository ubicacionRepository;
		
		
		@PostMapping(value = "/createPersonas")
		public String create(@RequestBody Encapsulamiento encapsulamiento) {	
			return "Persona guardada";
		}
		
		@PostMapping(value = "/createPersona")
		public String create(@RequestBody Persona persona) {
			personaRepository.create(persona);
			return "Persona agregada";
		}
		
		@PostMapping(value = "/readPersona")
		public List<Persona> readAll(){
			return personaRepository.readAll();
		}
		
		@PostMapping(value = "/updatePersona")
		public String update(@RequestBody Persona persona) {
			personaRepository.update(persona);
			return "Persona Actualizada";
		}
		@PostMapping(value = "/deletePersona/{personaId}")
		public String delete(@PathVariable(name = "personaId")Integer personaId) {
			personaRepository.delete(personaId);
			return "Persona Eliminada";
		}
		
}
