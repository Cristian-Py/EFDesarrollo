package com.bmore.desarrolloef.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmore.desarrolloef.model.Contacto;

import com.bmore.desarrolloef.repository.ContactoRepository;

@RestController
public class ContactoRest {
	@Autowired
	private ContactoRepository contactoRepository;
	
	@PostMapping(value = "/createContacto")
	public String create(@RequestBody Contacto contacto) {
		contactoRepository.create(contacto);
		return "Contacto Ingresado";
	}
	
	@PostMapping(value = "/readContacto")
	public List<Contacto> readAll(){
		return contactoRepository.readAll();
	}
	
	@PostMapping(value = "/updateContacto")
	public String update(@RequestBody Contacto contacto) {
		contactoRepository.update(contacto);
		return "Contacto Actualizada";
	}
	@PostMapping(value = "/deleteContacto/{contactoId}")
	public String delete(@PathVariable(name = "contactoId")Integer contactoId) {
		contactoRepository.delete(contactoId);
		return "Contacto Eliminada";
	}
	
}
