package estructuraDatos;

public class Producto {
	//declaramos los atributos privados que nos pide el ejercicio
	
	private String codigo;
	private String nombre;
	private String descripcion;
	private int unidades;
	private float precioCompra;
	
	//creamos un constructor de los parámetros que vamos a usar de la forma que nos dice el ejemplo
	//con boton derecho raton y en source generar constructos con fields
	
	
	public Producto(String codigo, String nombre, String descripcion, int unidades, float precioCompra) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.precioCompra = precioCompra;
	}

	//con source creamos los getters y setters 
	//para mostrar y obtener los valores de los parámetros
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

		//con source tambien creamos un toString para retornar los datos en cadena
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", unidades="
				+ unidades + ", precioCompra=" + precioCompra + "]";
	}
	
	
	
	
	
}
