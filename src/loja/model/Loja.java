package loja.model;

public  class Loja {
    private int numero;
    private String nomeArtista;
    private String tituloDisco;

    // Construtor
    public Loja(int numero, String nomeArtista, String tituloDisco) {
        this.numero = numero;
        this.nomeArtista = nomeArtista;
        this.tituloDisco = tituloDisco;
    }

    // Métodos de acesso (get e sett)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeArtista() {
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

    // Método  exibir os detalhes do disco
    public void exibirDisco() {
        System.out.println("Número: " + numero);
        System.out.println("Artista: " + nomeArtista);
        System.out.println("Disco: " + tituloDisco);
    }
}
