package com.tcc.gestion_logistica.security;

import org.springframework.stereotype.Service;

import com.tcc.gestion_logistica.interfaces.ServicioSeguridad;
import com.tcc.gestion_logistica.model.Roles;
import com.tcc.gestion_logistica.model.Usuarios;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.atomic.AtomicReference;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;


import java.sql.SQLException;
import java.util.*;



@Service
public class AuthenticationService  implements ServicioSeguridad{

	@Override
	public ResponseEntity<?> authenticate(Usuarios datos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Roles> getRoles(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String extendToken(String oldToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateToken(String username, List<Roles> rol, List<String> datosRecursos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logOut(String token) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuarios autenticacion(Usuarios datos) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	 
}
