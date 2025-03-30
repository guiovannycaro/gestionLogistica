package com.tcc.gestion_logistica.security.controller;

import com.tcc.gestion_logistica.dao.security.ServicioSeguridadImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.gestion_logistica.model.Roles;
import com.tcc.gestion_logistica.model.Usuarios;
import com.tcc.gestion_logistica.model.Versiones;
import com.tcc.gestion_logistica.util.ExceptionUtil;
import com.tcc.gestion_logistica.config.properties.Propiedad;
import com.tcc.gestion_logistica.security.AuthenticationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

@RestController
@RequestMapping("/gestionol/AppAdmin/Seguridad")
@Api(value = "Administracion de Usuario")
public class ServicioSeguridadController {
	protected final Log log = LogFactory.getLog(this.getClass());
	private final ServicioSeguridadImpl servicio = new ServicioSeguridadImpl();

	@Autowired
	private AuthenticationService authenticationService;

	@GetMapping(value = "/Versiones")
	@ApiOperation(value = "Version del sistema ", response = Versiones.class, notes = "muestra la version del sistema")
	@ApiResponses({ @ApiResponse(code = 200, message = "Ha ingresado de manera correcta", response = Versiones.class),
			@ApiResponse(code = 400, message = "Bad Request.Hay un error al logueares(String)", response = Versiones.class),
			@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Versiones.class),
			@ApiResponse(code = 403, message = "Acceso denegado", response = Versiones.class),
			@ApiResponse(code = 401, message = "No existen Datos Asociados ", response = Versiones.class),
			@ApiResponse(code = 404, message = "No existen Datos Asociados ", response = Versiones.class) })
	public List<Versiones> versionSistema() {
		ArrayList<Versiones> version = new ArrayList<>();

		Versiones datos = new Versiones();
		datos.setDetalle("Version");
		datos.setVersion(Propiedad.getCurrentInstance().getVersion());
		version.add(datos);
		return version;
	}

	/*@PostMapping(value = "/authenticate")
	@ApiOperation(value = "Listado De Usuarios", response = Usuarios.class, notes = "Lista Los Usuarios en el Sistema")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Se Creo el Usuario   de manera correcta", response = Usuarios.class),
			@ApiResponse(code = 400, message = "Bad Request.El Usuario Ingresado Esta Mal Digitado(String)", response = Usuarios.class),
			@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Usuarios.class),
			@ApiResponse(code = 403, message = "Acceso denegado", response = Usuarios.class),
			@ApiResponse(code = 401, message = "No existen Datos Asociados a Ese Usuario", response = Usuarios.class),
			@ApiResponse(code = 404, message = "No existen Datos Asociados a Ese Usuario", response = Usuarios.class), })
	public ResponseEntity<?> validarUsuario(@RequestBody Usuarios datos) {
		try {
			return authenticationService.authenticate(datos);
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error al procesar la solicitud: " + e.getMessage());
		}
		
	}*/

	/*@PostMapping("/generateToken")
	public String authenticateAndGetToken(@RequestBody Usuarios datos) {

		Usuarios user;
		try {
			user = servicio.autenticacion(datos);
			
			if (user.getUsuNombre() != null && user.getUsuRol() != null) {

				List<Roles> rol = authenticationService.getRoles(datos.getUsuNombre());
				System.out.println("" + authenticationService.generateToken(user.getUsuNombre(), rol, Collections.emptyList())
				
						
						);
				return "" + authenticationService.generateToken(user.getUsuNombre(), rol, Collections.emptyList());

			} else {
				throw new UsernameNotFoundException("Invalid user request!");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "No se genero el token";
		}

		
	}

	@PostMapping(value = "/token/update")
	@ApiOperation(value = "Actualizacion de token de usuarios", notes = "Recibe el token actual y le actualiza el tiempo si es valido")
	public ResponseEntity<String> tokenUdate(@RequestHeader("Authorization") String token) {
		HttpHeaders responseHeaders = new HttpHeaders();
		String tokenNew = authenticationService.extendToken(token);
		if (!StringUtil.isNotNullOrEmpty(tokenNew)) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
		responseHeaders.set("Set-Authorization-JWT", tokenNew);
		return ResponseEntity.ok().headers(responseHeaders).body("Accepted");
	}

	@GetMapping(value = "/api/v1/secure")
	public ResponseEntity<?> secure() {
		log.error("Received request: /api/v1/secure");
		return ResponseEntity.ok().build();
	}

	@PostMapping(value = "/token/logout")
	@ApiOperation(value = "Cierra la sesion del token", notes = "Cierra la sesion del token")
	public ResponseEntity<Boolean> logOut(@RequestHeader("Authorization") String token, Principal principal) {
		log.info(String.format("LogOut - > %s", principal.getName()));
		return ResponseEntity.ok().body(authenticationService.logOut(token));
	}
*/
}
