package loja.model;

// herdando da loja 
public class Disco extends Loja{
	
	private int polegada;
	
// os atributos vindo da loja 
	

	public int getPolegada() {
		return polegada;
	}

	public Disco(int numero, int opçao, String nomeArtista, String tituloDisco, int polegada) {
	super(numero, opçao, nomeArtista, tituloDisco);
	this.polegada = polegada;
}

	public void setPolegada(int polegada) {
		this.polegada = polegada;
	}

}
