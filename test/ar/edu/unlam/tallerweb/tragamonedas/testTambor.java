package ar.edu.unlam.tallerweb.tragamonedas;

import org.junit.Test;

public class testTambor {

	@Test
	public void testPruebaDeGiro() {
		Tambor miTambor= new Tambor();
		miTambor.girar();
		
	}
	
	@Test
	public void testObtenerPosicion(){
		Tambor miTambor= new Tambor();
		Integer posicion=miTambor.obtenerPosicion();
		System.out.println(posicion); 
	}

}
