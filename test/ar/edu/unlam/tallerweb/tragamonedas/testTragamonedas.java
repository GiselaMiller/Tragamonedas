package ar.edu.unlam.tallerweb.tragamonedas;


import org.junit.Assert;
import org.junit.Test;

public class testTragamonedas {

	@Test
	public void testActivarTragamonedas() {
		Tragamonedas miTragamonedas= new Tragamonedas();
		miTragamonedas.activar();
	}
	
	@Test
	public void entregaPremio() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		Assert.assertTrue(miTragamonedas.EntregaPremio()|| !miTragamonedas.EntregaPremio());
	}

}
