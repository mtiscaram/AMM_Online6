package estructuraDatos;

//con la palabra extends, la clase Cliente hereda todos los atributos y m�todos de la clase Persona
public class Cliente extends Persona{
	
	//declaramos los atributos propios de la clase Cliente

	private String numeroCuenta;
	private String localidad;
	
	//creamos el constructor, que no se heredan pero si heredan los atributos.Ponemos los atributos que heredamos de Persona
	//y los nuevos de Cliente
	public Cliente(String nif, String nombre, String apellidos, String direccion, String telefono, String numeroCuenta, String localidad) {
		
		//con la palabra super accedo a los atributos de la clase Persona
		super(nif, nombre, apellidos, direccion, telefono);
		
		//referenciamos los atributos propios de Cliente
		this.numeroCuenta=numeroCuenta;
		this.localidad=localidad;
		
	}

	//creamos los getters and setters con source, de los atributos propios
	//de la clase Cliente
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	@Override
	//creamos un toString para devolver el toString de los atributos heredados más
	//los atributos propios.
	public String toString() {
		
		return super.toString()+ ", Número de cuenta" + numeroCuenta + ", Localidad " + localidad;
		
	}
	
}
