package com.tcc.gestion_logistica.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tcc.gestion_logistica.model.Roles;
import com.tcc.gestion_logistica.model.Usuarios;

public interface ServicioSeguridad {

	public ResponseEntity<?> authenticate(Usuarios datos);

	public List<Roles> getRoles(String username);
	
	public String extendToken(String oldToken);
	
	 public String generateToken(String username, List<Roles> rol,List<String> datosRecursos);
	 
	 public boolean logOut(String token);
	 
	 public Usuarios autenticacion(Usuarios datos) throws Exception;
}
