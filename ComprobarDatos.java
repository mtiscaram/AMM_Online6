package utilidades;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComprobarDatos {
	
	
	public ComprobarDatos() {
		
	}
	
	
		
	public  boolean combrobarNif(String nif) {
		
		//definir el patron que sea de 8 letras
		//para ello busco en internet expresion regular nif
		//se crea el objeto patter para almacenar el patron que voy a usar 
		//primero 8 numeros y una letra al final 
		Pattern patronnif = Pattern.compile("[0-9]{8}[A-Z a-z]");	
		
		//ejecuto objeto matcher pasandole el nif 
		//para que lo busque que es donde me da el resultado
		 Matcher coincidencia = patronnif.matcher(nif);
		 
	    boolean coincidenciaEncontrada = coincidencia.find();
	    
	    if(coincidenciaEncontrada) {
	        return true;
	      } else {
	    	  System.out.println("Nif no válido");
	        return false;
	      }
	    
	 } 
	
   public  boolean combrobarRefCatastral (String refCatastral) {
		
		
		Pattern patroncatrasto = Pattern.compile("^[0-9]{7}[A-Z]{2}[0-9]{4}[N|S]$");	
		
		
		 Matcher coincidencia = patroncatrasto.matcher(refCatastral);
		 
	    boolean coincidenciaEncontrada = coincidencia.find();
	    
	    if(coincidenciaEncontrada) {
	        return true;
	      } else {
	    	  System.out.println("Referencia de catastro no válida");
	        return false;
	      }
	    
	 }
   public  boolean combrobarCodProducto (String codProducto) {
		
		
		Pattern patroncodigo = Pattern.compile("^[a-z]{2}[0-9]{6}$");	
		
		
		 Matcher coincidencia = patroncodigo.matcher(codProducto);
		 
	    boolean coincidenciaEncontrada = coincidencia.find();
	    
	    if(coincidenciaEncontrada) {
	        return true;
	      } else {
	    	  System.out.println("Código de producto no válido");
	        return false;
	      }
	    
	 }
	
}
    

