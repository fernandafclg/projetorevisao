package loja.controller;

import java.util.ArrayList;
import java.util.List;

import loja.model.Disco;
import loja.model.Loja;  // imptda a classe Loja
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository{
    
    private List<Loja> discos = new ArrayList<>(); // Criando  lista para armazenar os discos
    private int contador = 1; // Criando um enumerador de ndisco

 // Método adicione um disco
    @Override
    public void adicionarDisco(String nomeArtista, String tituloDisco) {
        Disco novoDisco = new Disco(contador, contador, nomeArtista, tituloDisco, contador);
        discos.add(novoDisco);
        System.out.println("Disco cadastrado com sucesso! Número: " + contador);
        contador++;
    }

    // Método  listar  os discos
    @Override
    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco cadastrado.");
        } else {
            for (Loja disco : discos) {
                disco.exibirDisco();
                System.out.println("--------------------");
            }
        }
    }

    // Método  atualizar um disco
    @Override
    public void atualizarDisco(int numero, String novoNome, String novoTitulo) {
        for (Loja disco : discos) {
            if (disco.getNumero() == numero) {
                disco.setNomeArtista(novoNome);
                disco.setTituloDisco(novoTitulo);
                System.out.println("Disco atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Disco não encontrado!");
    }

    // Método  pra apagr um disco
    @Override
    public void removerDisco(int numero) {
        for (Loja disco : discos) {
            if (disco.getNumero() == numero) {
                discos.remove(disco);
                System.out.println("Disco removido com sucesso!");
                return;
            }
        }
        System.out.println("Disco não encontrado!");
    }
}








    
    
    
