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
import com.tcc.gestion_logistica.dao.EnvioControllerDao;

import com.tcc.gestion_logistica.model.Envio;
import com.tcc.gestion_logistica.service.ServicioWebEnvio;
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
public class ServicoWebEnviosTest {
protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
    private MockMvc mockMvc;
	
	
	@MockBean
	private EnvioControllerDao servicioEnvio;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	
	
	@Test
	void testCrearEnvio_exitoso() throws Exception {
	    Envio envioMock = new Envio(1, 1001, "3101234567", 5, "2025-06-01", "2025-05-24", 1, 2, 1, "REF-ABC123");
	    String respuestaMock = "{\"codigo\":\"200\",\"mensaje\":\"Registro exitoso\"}";

	    when(servicioEnvio.crearEnvio(envioMock)).thenReturn(respuestaMock);

	    MockHttpServletResponse response = mockMvc.perform(post("/crearEnvio")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(objectMapper.writeValueAsString(envioMock))
	            .accept(MediaType.APPLICATION_JSON))
	        .andReturn()
	        .getResponse();

	    assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	    assertThat(response.getContentAsString()).isEqualTo(respuestaMock);
	}
	
	
	@Test
	void testCrearEnvio_excepcionEnServicio() throws Exception {
	    Envio envioMock = new Envio(1, 1001, "3101234567", 5, "2025-06-01", "2025-05-24", 1, 2, 1, "REF-ABC123");

	    // Simulamos que el servicio lanza una excepción
	    when(servicioEnvio.crearEnvio(envioMock)).thenThrow(new RuntimeException("Error en el servicio"));

	    MockHttpServletResponse response = mockMvc.perform(post("/crearEnvio")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(objectMapper.writeValueAsString(envioMock))
	            .accept(MediaType.APPLICATION_JSON))
	        .andReturn()
	        .getResponse();

	    // Validamos que el código HTTP sea 200 (porque el controlador lo atrapa y no lanza error al cliente)
	    assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

	    // Validamos que el contenido sea el mensaje de error personalizado
	    assertThat(response.getContentAsString()).contains("\"codigo\":\"500\"");
	    assertThat(response.getContentAsString()).contains("El registro no fue ingresado De Manera Correcta");
	}
}
