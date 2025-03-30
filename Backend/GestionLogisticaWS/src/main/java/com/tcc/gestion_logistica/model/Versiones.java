package com.tcc.gestion_logistica.model;



import lombok.Data;


@Data
public class Versiones {
	String detalle;
	String version;

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	
	
}
