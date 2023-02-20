package estructuraDatos;

public class Persona {
	
	//declaramos atributos privados que nos pide el ejercicio
	private String nif;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	
	
	// creamos constructor con los parámetros que queremos y los referenciamos con el 
	//indicador this
	public Persona(String nif, String nombre, String apellidos, String direccion, String telefono) {
		
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//creamos los getters y setters desde opcion del menú soruce

	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//creamos un ToString para retornar los datos persona en una cadena 

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	


}
