package estructuraDatos;
//con la palabra extends, la clase Trabajador hereda todos los atributos y m�todos de la clase Persona
public class Trabajador extends Persona {

	//declaramos los atributos propios de la clase Trabajador
	private String codigoSede;
	private String numeroSS;
	private CampoLaboral tipo;
	
	//creamos el constructor, que no se heredan pero si heredan los atributos.Ponemos los atributos que heredamos de Persona
	//y los nuevos de Trabajador
	public Trabajador(String nif, String nombre, String apellidos, String direccion, String telefono, String codigoSede, String numeroSS, CampoLaboral tipo) {
		
		//con la palabra super accedo a los atributos de la clase Persona
		super(nif, nombre, apellidos, direccion, telefono);
		
		//referenciamos los atributos propios de Trabajador
		this.codigoSede = codigoSede;
		this.numeroSS = numeroSS;
		this.tipo = tipo;
		
	}
	
	//creamos los getters and setters con source, de los atributos propios
	//de la clase Trabajador

	public String getCodigoSede() {
		return codigoSede;
	}

	public void setCodigoSede(String codigoSede) {
		this.codigoSede = codigoSede;
	}

	public String getNumeroSS() {
		return numeroSS;
	}

	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}

	public CampoLaboral getTipo() {
		return tipo;
	}

	public void setTipo(CampoLaboral tipo) {
		this.tipo = tipo;
	}
	
	@Override
	//creamos un toString para devolver el toString de los atributos heredados más
	//los atributos propios.
	public String toString() {
		
		return super.toString() + "Código Sede: " + codigoSede + "Número de Seguridad Social: " + numeroSS + "Tipo de trabajo " + tipo;
	}
	
}
