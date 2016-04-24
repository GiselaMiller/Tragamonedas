package ar.edu.unlam.tallerweb.tragamonedas;

public class Tragamonedas {
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	public Tragamonedas(){
		this.tambor1= new Tambor();
		this.tambor2= new Tambor();
		this.tambor3= new Tambor();
	}
	
	public void activar(){
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
	}

	public Boolean EntregaPremio() {
		if (tambor1==tambor2 && tambor1==tambor3)
		return true;
		else
			return false;
	}

}
