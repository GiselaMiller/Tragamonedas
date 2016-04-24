package ar.edu.unlam.tallerweb.tragamonedas;


import org.junit.Assert;
import org.junit.Test;

public class testTambor {

	@Test
	public void testPruebaDeGiro() {
		Tambor miTambor= new Tambor();
		Integer valorObtenido = miTambor.girar();
		Assert.assertTrue(valorObtenido>=1 && valorObtenido<=8);
		
	}
	
	@Test
	public void testObtenerPosicion(){
		Tambor miTambor= new Tambor();
		miTambor.girar();
	}

}
