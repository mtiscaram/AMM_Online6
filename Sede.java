package estructuraDatos;

public class Sede {
	
	//declaramos los atributos privados que nos dice el ejercicio
	
	private String codigo;
	private String domicilio;
	private String telefono;
	private String localidad;
	private int metrosQuadrados;
	private String referenciaCatastral;
	
	
	//creamos el constructor de los parámetros declarados con la opcion 
	//source desde boton derecho con el raton o desde opciones de la barra de herramientas. 
	
	
	public Sede(String codigo, String domicilio, String telefono, String localidad, int metrosQuadrados,
			String referenciaCatastral) {
		
		this.codigo = codigo;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.localidad = localidad;
		this.metrosQuadrados = metrosQuadrados;
		this.referenciaCatastral = referenciaCatastral;
	}

	//creamos los getters y setters con el código que nos genera desde 
	//source para mostrar y obtener los datos
	
	//un get sirve para mostrar el valor
	
	public String getCodigo() {
		return codigo;
	}
	//un set sirve para obtener un valor 
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getMetrosQuadrados() {
		return metrosQuadrados;
	}

	public void setMetrosQuadrados(int metrosQuadrados) {
		this.metrosQuadrados = metrosQuadrados;
	}

	public String getReferenciaCatastral() {
		return referenciaCatastral;
	}

	public void setReferenciaCatastral(String referenciaCatastral) {
		this.referenciaCatastral = referenciaCatastral;
	}

	//creamos el toString de los parámetros con el código que nos genera desde  source 
	@Override
	public String toString() {
		return "Sede [codigo=" + codigo + ", domicilio=" + domicilio + ", telefono=" + telefono + ", localidad="
				+ localidad + ", metrosQuadrados=" + metrosQuadrados + ", referenciaCatastral=" + referenciaCatastral
				+ "]";
	}

	
}
