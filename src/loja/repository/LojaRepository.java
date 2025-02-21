package loja.repository;

import loja.model.Loja;

public interface LojaRepository {

	//public void adicionarDisco(String nomeArtista, String tituloDisco);
	
	public void adicionarDisco(String nomeArtista, String tituloDisco);
	public void listarDiscos();
	public void atualizarDisco (int numero, String novoNome, String novoTitulo);
	public void removerDisco(int numero);
}
