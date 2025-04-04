CREATE TABLE SCH_CN.GL_TCLIENTES (
	CLI_ID NUMBER,
	CLI_NOMBRES VARCHAR2(255 CHAR),
	CLI_TIPODOCUMENTO NUMBER,
	CLI_CEDULA VARCHAR2(255 CHAR),
    CLI_CORREO VARCHAR2(255 CHAR),
	CLI_CELULAR VARCHAR2(255 CHAR),
    CLI_DIRECCION VARCHAR2(255 CHAR),
	CLI_CIUDAD_ID NUMBER,
	CLI_ESTADO VARCHAR2(255 CHAR)
	
);


CREATE TABLE SCH_CN.GL_TBODEGA (
	BOD_ID NUMBER,
	BOD_NOMBRES VARCHAR2(255 CHAR),
	BOD_DIRECCION VARCHAR2(255 CHAR),
	BOD_TELEFONO VARCHAR2(255 CHAR),
	BOD_ID_TIPO NUMBER,
	BOD_CIUDAD_ID NUMBER,
	BOD_ZONA_ID NUMBER,
	BOD_ESTADO NUMBER
);


CREATE TABLE SCH_CN.GL_TENVIO (
	ENV_ID NUMBER,
	ENV_CLIE_ID NUMBER,
	ENV_TELEFONO VARCHAR2(255 CHAR),
	ENV_BOD_ID NUMBER,
	ENV_FECHA_ENTREGA VARCHAR2(255 CHAR),
	ENV_FECHA_ENVIO VARCHAR2(255 CHAR),
	ENV_ORIG_CIU_ID NUMBER,
	ENV_DEST_CIU_ID NUMBER,
	ENV_ESTADO NUMBER,
	ENV_REFERENCIA VARCHAR2(255 CHAR)
);

CREATE TABLE SCH_CN.GL_TDETALLEENVIOTEMP (
    ENVDT_ID number,
	ENVDT_PROD_ID NUMBER,
	ENVDT_CANTIDAD NUMBER,
	ENVDT_PRECIO NUMBER,
	ENVDT_TOTAL NUMBER,
	ENVDT_IDP NUMBER
	
);

CREATE TABLE SCH_CN.GL_TDETALLEENVIO (
	ENVD_ID NUMBER,
	ENVD_PROD_ID NUMBER,
	ENVD_CANTIDAD NUMBER,
	ENVD_PRECIO NUMBER,
	ENVD_SUBTOTAL NUMBER,
	ENVD_IVA NUMBER,
	ENVD_TOTAL NUMBER,
	ENVD_DESCUENTO NUMBER,
	ENVD_ENV_ID NUMBER
);

CREATE TABLE SCH_CN.GL_TZONAS (
	ZON_ID NUMBER,
	ZON_NOMBRE VARCHAR2(255 CHAR),
	ZON_DESCRIPCION VARCHAR2(255 CHAR)
);


CREATE TABLE SCH_CN.GL_TUSUARIOS (
	USU_ID NUMBER,
	USU_NOMBRES VARCHAR2(255 CHAR),
	USU_DIRECCION VARCHAR2(255 CHAR),
	USU_TELEFONO VARCHAR2(255 CHAR),
	USU_CORREO VARCHAR2(255 CHAR),
	USU_NUMDOCUMENTO VARCHAR2(255 CHAR),
	USU_PASSWORD VARCHAR2(255 CHAR),
	USU_TDOC_ID NUMBER,
	USU_ROL_ID NUMBER,
	USU_ESTADO NUMBER
);

CREATE TABLE SCH_CN.GL_TTIPOPRODUCTO (
	TIPOPR_ID NUMBER,
	TIPOPR_NOMBRE VARCHAR2(255 CHAR),
	TIPOPR_DESCRIPCION VARCHAR2(255 CHAR)
);

CREATE TABLE SCH_CN.GL_TTIPODOCUMENTO (
	TDOC_ID NUMBER,
	TDOC_NOMBRE VARCHAR2(255 CHAR),
	TDOC_DESCRIPCION VARCHAR2(255 CHAR)
);

CREATE TABLE SCH_CN.GL_TTIPOBODEGA (
	TIPOB_ID NUMBER,
	TIPOB_NOMBRE VARCHAR2(255 CHAR),
	TIPOB_DESCRIPCION VARCHAR2(255 CHAR)
);

CREATE TABLE SCH_CN.GL_TROLES (
	ROL_ID NUMBER,
	ROL_NOMBRE VARCHAR2(255 CHAR),
	ROL_DESCRIPCION VARCHAR2(255 CHAR)
);

CREATE TABLE SCH_CN.GL_TPRODUCTOS (
	PRO_ID NUMBER,
	PRO_NOMBRES VARCHAR2(255 CHAR),
	PRO_DESCRIPCION VARCHAR2(255 CHAR),
	PRO_OBSERVACION VARCHAR2(255 CHAR),
	PROD_VALOR VARCHAR2(255 CHAR),
	PROD_CANTIDAD VARCHAR2(255 CHAR),
	PRO_ESTADO VARCHAR2(255 CHAR)
);







