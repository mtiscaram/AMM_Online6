package controladores;

import java.util.Scanner;


import estructuraDatos.Producto;
import utilidades.ComprobarDatos;
import utilidades.ES;

public class Principal {

	

	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		//declaramos la varable opción como entero
		int opcion;
		String codigo="";
		//creo objeto tipo vector para crear un producto
		Controlador controlador= new Controlador();
		ComprobarDatos comprobar= new ComprobarDatos();
		
		//imprimimos por consola las opciones del menú haciendo un bucle do-while
		
			
		
		do	{
				
		System.out.println("Opciones de menú: ");
        System.out.println("Pulse 1 para añadir productos ");
        System.out.println("Pulse 2 para eleminar productos ");
        System.out.println("Pulse 3 para mostrar el producto ");
        System.out.println("Pulse 4 para salir ");
                
        //utilizo teclado para introducir opción de tipo enteros
        
        opcion = ES.leerEnt();
        
        //utilizo la estructura switch para las diferentes opciones del menu
        switch(opcion) {
        //caso de añadir producto
        case 1:
        	//declaro una variable boleana inicializada en false, donde si es false salga 
        	//menaje de que no es valido
        	boolean rpatron=false;
        	//miestras sea variable rpatron true entra en el bucle
        	while(!rpatron){
        		//nos sale mensaje para introducor codigo e inicializamos 
        		//variable con la llamada de metodo ES leer cadena 
        	System.out.println("Introduce codigo del producto: ");
        	codigo = ES.leerCadena();
        	//declaro variable patronvalido de tipo boleana y la inicializo llamando 
        	//llamando al metodo de comprobarCodProducto 
        	
        	boolean patronvalido=comprobar.combrobarCodProducto(codigo);
        	//si patron es valido-true- nos sale por pantalla unas directrices para añadir el producto
        	
        	if(patronvalido==true) {
        		
        		System.out.println("Introduce nombre del producto: ");
        		//declaro e inicializo varable nombre llamando al metodo ES de leer cadena
        			 String nombre= ES.leerCadena();
        			 
        		System.out.println("Introduce descripcion del producto: ");
        		//declaro e inicializo varable descripcion llamando al metodo ES de leer cadena
        			String descripcion= ES.leerCadena();
        			
        		System.out.println("Introduce unidades del producto: ");
        		//declaro e inicializo varable unidades llamando al metodo ES de leer entero
        			 int unidades = ES.leerEnt();
        			 
        		System.out.println("Introduce precio del producto: ");
        		//declaro e inicializo varable precioCompra llamando al metodo ES de leer decimal
        			float precioCompra= ES.leerDecimal();
        	//si todo se añade bien, se añade producto llamano el metodo de añadir
        			
        	controlador.anydirProducto(codigo, nombre, descripcion, unidades, precioCompra);
        	//mostramos producto con la llamada al metodo mostrarProductos, con el producto nuevo y si habia
        	//ya algun producto 
        	controlador.mostrarProductos();
        	//todo esto pasa si la variable rpatron sea verdadera
        	rpatron=true;
        	
        		       		
        	//si no es verdadera devuelve mensaje que no es valido	
        	}else {
        		System.out.println("Introduce un codigo valido de producto, con un patron (aa000000)");
        		rpatron=false;
        	}
        		       	
        	}
        	 
        	break;//cuando termina el caso se cierra con un break
        
        	//caso para eliminar producto 
        case 2:
        	//primero sale mensaje por consola para que se introducir codigo 
        	//del producto que s equiere eliminar
        	System.out.println("Introduce el codigo del producto que quieres eliminar ");
        	//en la variable de codigo guardamos el valor de la entrada de datos 
        	//que se hace con la llamada de metodo leer cadena de la clase ES
        	codigo=ES.leerCadena();
        	//esa varible se introduce en el metodo eliminar de la clase controlador
        	controlador.eliminar(codigo);
        	
        	//se muestra por consola el nuevo vector de los productos que quedan
        	controlador.mostrarProductos();     	
        	        	       	
        	
        	break;//se finaliza esta estructura
        	
        //estructura para introducir un producto por codigo y que se muestre por pantalla	
        case 3:
        	//mensaje para introducor codigo del producto a mostrar
        	System.out.println("Introduce el codigo del producto que quieres mostrar ");
        	//se inicializa variable codigo con la entrada de datos de la clase ES llamando 
        	//al metodo leer cadena
        	codigo=ES.leerCadena();
        	
        	//se imprime por pantalla el array de producto con el codigo que se le ha introducido
        	//si el metodo  toStringProducto lo permite.
        	System.out.println(controlador.ToStringProducto(codigo));
        	
        	break;//finaliza esta estructura
        	
        case 4:
        	//caso para salir del programa donde se cierra el objeto teclado 
        	//para no poder introducor mas por teclado y sale por pantalla un mensaje de saliendo
        	sc.close();
        	System.out.println("Saliendo....");
        	
        	break;//termina esta estructura
        	
        default://sentencia opcional por si la variable opcion no se corresponda con ninguan 
        	//opcion del menu
        	System.out.println("Elige una opción válida del menú ");
        	 
        	}	
        } while (opcion != 4);
		
		
	}     
}	
		


	


