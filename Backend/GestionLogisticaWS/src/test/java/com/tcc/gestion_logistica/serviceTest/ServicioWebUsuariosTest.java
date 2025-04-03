package com.tcc.gestion_logistica.serviceTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.tcc.gestion_logistica.dao.UsuariosControllerDao;
import com.tcc.gestion_logistica.model.Usuarios;
import com.tcc.gestion_logistica.service.ServicioWebUsuarios;
import com.tcc.gestion_logistica.util.ExceptionUtil;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;


@ExtendWith(SpringExtension.class)
@SpringBootTest 
@AutoConfigureMockMvc 
public class ServicioWebUsuariosTest {

	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
    private MockMvc mockMvc;
	
	
	@MockBean
	private UsuariosControllerDao servicioUsuario;
	
	@Test
	 void testListarDetalleUsuarios() throws SQLException {
		
		 
		 List<Usuarios> usuariosMock = Arrays.asList(
				 new Usuarios(1, "Juan","calle falsa 123","3164567212","jgabriel@gmail.com",
						 "41562258","Admin123",1,1,1),
				 new Usuarios(1, "Maria","calle 4 # 12 - 123","3104567010","maria@gmail.com",
						 "170458962","Admin1234-1",1,2,1)
				 );
		
	        when(servicioUsuario.listadoUsuarios()).thenReturn(usuariosMock);

	        
	        MockHttpServletResponse response;
			try {
				response = mockMvc.perform(get("/tcc/gestion/CrudUsuarios/ListarUsuarios")
				        .accept(MediaType.APPLICATION_JSON))
				.andReturn().getResponse();
				
				assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
			} catch (Exception e) {
				log.error(ExceptionUtil.format(e));
			
			}
	        
	        
	}
	
	@Test
	 void testBuscarUsuariosById() throws SQLException {
		
		 
		 Usuarios usuariosMock = 
				 new Usuarios(1, "Juan","calle falsa 123","3164567212","jgabriel@gmail.com",
						 "41562258","Admin123",1,1,1);
		
	        when(servicioUsuario.buscarUsuariosXId(1)).thenReturn(usuariosMock);

	        
	        MockHttpServletResponse response;
			try {
				response = mockMvc.perform(get("/tcc/gestion/CrudUsuarios/buscarUsuariosById")
						.param("id", "1")
				        .accept(MediaType.APPLICATION_JSON))
				.andReturn().getResponse();
				verify(servicioUsuario).buscarUsuariosXId(1);
				
				
			} catch (Exception e) {
				log.error(ExceptionUtil.format(e));
			
			}
	        
	        
	}

	@Test
void testCrearUsuarios() throws SQLException,Exception {
	
		 Usuarios usuariosMock = 
				 new Usuarios(0, "felipe","calle 23 # 12 - 3","345125678","felipe.perez@gmail.com",
						 "41562258","Admin124",1,1,1);
		 String rpt = "{\"codigo\":\"200\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro fue ingresado De Manera Correcta\"}";
			when(servicioUsuario.crearUsuarios(usuariosMock)).thenReturn(rpt);
			MockHttpServletResponse response;
			
			try {
				  response = mockMvc.perform(post("/tcc/gestion/CrudUsuarios/crearUsuarios")
				            .contentType(MediaType.APPLICATION_JSON)
				            .content(new ObjectMapper().writeValueAsString(usuariosMock)) 
				            .accept(MediaType.APPLICATION_JSON))
				            .andReturn().getResponse();
				
				 assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	@Test
void testEditarUsuarios() throws SQLException,Exception {
	
		 Usuarios usuariosMock = 
				 new Usuarios(1, "felipe","calle 23 # 12 - 3","345125678","felipe.perez@gmail.com",
						 "41562258","Admin124",1,1,1);
		 String rpt = "{\"codigo\":\"200\",\"mensaje\":\"Mensaje Informativo\",\"descripcion\":\"El registro fue ingresado De Manera Correcta\"}";
			when(servicioUsuario.editarUsuarios(usuariosMock)).thenReturn(rpt);
			MockHttpServletResponse response;
			
			try {
				  response = mockMvc.perform(post("/tcc/gestion/CrudUsuarios/editarUsuarios")
				            .contentType(MediaType.APPLICATION_JSON)
				            .content(new ObjectMapper().writeValueAsString(usuariosMock)) 
				            .accept(MediaType.APPLICATION_JSON))
				            .andReturn().getResponse();
				
				 assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}
