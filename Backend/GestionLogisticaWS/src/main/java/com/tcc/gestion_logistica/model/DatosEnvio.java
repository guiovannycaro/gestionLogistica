package com.tcc.gestion_logistica.model;

public class DatosEnvio {
	
	
	  Integer DATENV_ID;
	  Integer  DATENV_CANTIDAD;
	  Integer  DATENV_REF;
	 Integer  DATENV_Descuento;
	  
	public DatosEnvio() {
	}

	public DatosEnvio(Integer dATENV_ID, Integer dATENV_CANTIDAD, Integer dATENV_REF, Integer dATENV_Descuento) {
		super();
		DATENV_ID = dATENV_ID;
		DATENV_CANTIDAD = dATENV_CANTIDAD;
		DATENV_REF = dATENV_REF;
		DATENV_Descuento = dATENV_Descuento;
	}

	public Integer getDATENV_ID() {
		return DATENV_ID;
	}

	public void setDATENV_ID(Integer dATENV_ID) {
		DATENV_ID = dATENV_ID;
	}

	public Integer getDATENV_CANTIDAD() {
		return DATENV_CANTIDAD;
	}

	public void setDATENV_CANTIDAD(Integer dATENV_CANTIDAD) {
		DATENV_CANTIDAD = dATENV_CANTIDAD;
	}

	public Integer getDATENV_REF() {
		return DATENV_REF;
	}

	public void setDATENV_REF(Integer dATENV_REF) {
		DATENV_REF = dATENV_REF;
	}

	public Integer getDATENV_Descuento() {
		return DATENV_Descuento;
	}

	public void setDATENV_Descuento(Integer dATENV_Descuento) {
		DATENV_Descuento = dATENV_Descuento;
	}

	@Override
	public String toString() {
		return "DatosEnvio [DATENV_ID=" + DATENV_ID + ", DATENV_CANTIDAD=" + DATENV_CANTIDAD + ", DATENV_REF="
				+ DATENV_REF + ", DATENV_Descuento=" + DATENV_Descuento + "]";
	}






}
