package controladores;

//importo las clases para poder acceder a ellas
import java.util.Arrays;

import estructuraDatos.Producto;
import estructuraDatos.Persona;
import estructuraDatos.Sede;

public class Controlador {

	// declaracion de un vector llamado producto para meter objetos de la clase
	// persona
	private Producto[] ListaProductos;
	// creo un vector donde solo voy a meter objetos de la clase personas
	private Persona[] ListaPersonas;
	// creo un vector donde se va a meter objetos de sedes
	private Sede[] ListaSedes;

	// Declaracion variable nElementos para indicar numero de elementos del vector
	// producto
	private int nElementos1;
	// declaracion variable nElementos para indicar numero de elementos del vector
	// persona
	private int nElementos2;
	// declaracion variable nElementos para indicar numero de elementos del vector
	// sede
	private int nElementos3;

	// creo constructor controlador donde
	public Controlador() {

		// la inicializo a cero. Esto me indica que no hay ning�n elemento en el vector
		ListaProductos = new Producto[100];
		nElementos1 = 0;

		// Hago los mismo con el vector ListaPersonas
		// la inicializo a cero. Esto me indica que no hay ning�n elemento en el vector
		ListaPersonas = new Persona[100];
		nElementos2 = 0;

		// Hago los mismo con el vector ListaSedes
		// la inicializo a cero. Esto me indica que no hay ning�n elemento en el vector
		ListaSedes = new Sede[10];
		nElementos3 = 0;

	}

	// con soruce -> creacion toString, nos crea un string que nos imprime todos los
	// datos
	@Override
	public String toString() {
		return "Controlador [ListaProductos=" + Arrays.toString(ListaProductos) + ", ListaPersonas="
				+ Arrays.toString(ListaPersonas) + ", ListaSedes=" + Arrays.toString(ListaSedes) + ", nElementos1="
				+ nElementos1 + ", nElementos2=" + nElementos2 + ", nElementos3=" + nElementos3 + "]";
	}

	//creo un metodo privado para buscar producto por su codigo
	private int buscarProducto(String codigo) {
		//declaramos una variable de tipo entero por si no encuentra el producto por codigo 
		//devuelva -1
		int pos = -1;
		//recorremos la longitud del vector ListaProductos con un bucle for
		for (int i = 0; i < ListaProductos.length; i++) {
			//con un condicional if si el vector es diferente a null
			if(ListaProductos[i] != null) {
			//si el codigo coincide con algun codigo del vector ListaProductos
			//retorna la posicion igualando i con pos.
			 
			if (ListaProductos[i].getCodigo().equalsIgnoreCase(codigo)) {
				pos = i;
			}
		}
		}
		return pos;
	}
	
	//metodo para decir la primera posicion vacia del vector, recorriendo el vector
	//con un bucle for y cuando la variable i coincida con un null devuelva la posicion de la casilla
	
	private int primeraPosicionVacia() {

		int pos = -1;
		for (int i = 0; i < ListaProductos.length; i++) {

			if (ListaProductos[i] == null) {
				pos = i;
				break;
			}

		}
		return pos;
	}

	//metodo publico para obtener producto que devuelve el vector ListaProductos
	public Producto [] obtenerTodosProductos() {
		return ListaProductos;
	}
	
	//metodo mostrarProductos donde declaramos un array que lo igualamos al vector
	//de obtenerTodosProductos
	public void mostrarProductos() {
		Producto[] productos = obtenerTodosProductos();
		//con un bucle for recorremos ese vector creado y con el condicional if, 
		//si ese vector no es nulo, se muestra por pantalla llamando al metodotoString
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {

				System.out.println("Todos los productos son: " + productos[i].toString());
			}
		}
	}
	
	//metodo para obtener producto con codigo primero ver que no es nulo
	//luego lo buscamos con el metodo buscarProducto y si esta retorne el valor producto
	// no es nulo
	public Producto obtenerProducto(String codigo) {
		Producto producto=null;
		int pos=buscarProducto(codigo);
		if(pos !=-1) {
			producto=ListaProductos[pos];
		}
		
		return producto;
	}
	//metodo publico de tipo String que si la variable prod de obtenerProducto no es encontrado 
	//salga mensaje por pantalla,, y si es lo encuentra sera guardado en varible largo
	public String ToStringProducto(String codigo) {
		String largo="";
		Producto prod = obtenerProducto(codigo);
		if (prod !=null) {
			largo = prod.toString();
		}else {
			System.out.println("Producto no encontrado ");
		}return largo;
	}
	
	
	//metodo publico  que nos devuelva un booleano de true si se añade o false si no se hace
	//para añadir producto en la primera posicion vacia usa el metodo primeraPosicionVacia
	//y se añade a vector de ListaProductos
	public boolean anydirProducto(String codigo, String nombre, String descripcion, int unidades, float precioCompra) {
		boolean anidido = false;
		int pos=primeraPosicionVacia();
		if (pos != -1) {
			Producto prod = new Producto(codigo, nombre, descripcion, unidades, precioCompra);
			ListaProductos[pos]= prod;
			anidido= true;
		}return anidido;

	}
	
	//metodo publico que devuelve un entero de la posicion del nuevo producto buscado por codigo
	
	public int pocisionProducto(String codigo) {
		//inicializamo variable pos a -1 para recorrer todo el vector 
		int pos =-1;
		//creamos una variable pro que se inicializa con obtenerProducto por codigo
		Producto prod = obtenerProducto(codigo);
		//donde si esa variable pro no es nula, se recorra vector y si codigo coincide
		//con algun codigo de ListaProductos, se igual variable pos a casilla del vector
		//y retorne ese valor pos
		if(prod !=null) {
			for (int i = 0;  i < ListaProductos.length; i++) {
				if (ListaProductos[i] != null) {
					if
					(ListaProductos[i].getCodigo().equalsIgnoreCase(prod.getCodigo())) {
						pos =i;
						break;
					}
				}
			}
		}return pos;
	}
	//metodo publico que elimina un producto por codigo
	public void eliminar(String codigo) {
		//iniicalizamos la variable pos con buscarProducto.
		//si esa variable pos es distinta  a -1, se elimene ese producto del 
		//vector ListaProductos, Si no es encontrada devuelva mensaje de producto no encontrado
		int pos = buscarProducto(codigo);
		if (pos != -1) {
			ListaProductos[pos] = null;
			//recorremos el vector con un for
			for (int i = pos + 1; i < ListaProductos.length; i++) {
				//si valor i del array ListaProductos es distina a null
				if (ListaProductos[i] != null) {
					//creamos e inicializamos una variable entera para primeraposicion vacia
					//pueda ser ocupada por un Producto nuevo o rellenado con el producto que existe
					//en el vector
					int posVacio = primeraPosicionVacia();
					ListaProductos[posVacio] = ListaProductos[i];
					ListaProductos[i] = null;
				}

			}
			System.out.println("El producto ha sido eliminado.");

		} else {
			System.out.println("Producto no encontrado.");
		}
	}

	

}

	



