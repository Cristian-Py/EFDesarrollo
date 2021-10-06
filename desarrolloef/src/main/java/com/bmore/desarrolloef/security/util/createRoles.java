package com.bmore.desarrolloef.security.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bmore.desarrolloef.security.entity.Rol;
import com.bmore.desarrolloef.security.enums.RolNombre;
import com.bmore.desarrolloef.security.service.RolService;

@Component
public class createRoles implements CommandLineRunner{
	@Autowired
	RolService rolService;
	@Override
	public void run(String... args) throws Exception {
		/**
		Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
		**/
	}
	
	
}
