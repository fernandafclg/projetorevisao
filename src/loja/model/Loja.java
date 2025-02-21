package loja.model;

public abstract class  Loja {
	
	private int numero;
	private int opçao;
	private String nomeArtista; 
	private String tituloDisco;
	public Loja(int numero, int opçao, String nomeArtista, String tituloDisco) {
		this.numero = numero;
		this.opçao = opçao;
		this.nomeArtista = nomeArtista;
		this.tituloDisco = tituloDisco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getOpçao() {
		return opçao;
	}
	public void setOpçao(int opçao) {
		this.opçao = opçao;
	}
	public String getNome() {
		return nomeArtista;
	}
	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}
	public String getTituloDisco() {
		return tituloDisco;
	}
	public void setTituloDisco(String tituloDisco) {
		this.tituloDisco = tituloDisco;
	}
	public void exibirDisco() {
		// TODO Auto-generated method stub
	        System.out.println("Número: " + numero);
	        System.out.println("Artista: " + nomeArtista);
	        System.out.println("Disco: " + tituloDisco);
	    
	}
	

}
