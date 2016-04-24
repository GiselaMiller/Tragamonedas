package ar.edu.unlam.tallerweb.tragamonedas;

import java.util.concurrent.ThreadLocalRandom;


public class Tambor {
	private Integer posicion;

	public void girar() {
		ThreadLocalRandom.current().nextInt(1,8);
	}
	
	public Integer obtenerPosicion(){
		girar();
		posicion=ThreadLocalRandom.current().nextInt(1,8);
		return posicion;
	}
	

}
