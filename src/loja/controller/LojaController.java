package loja.controller;

import java.util.ArrayList;
import java.util.List;
import loja.model.Loja;  // impt a classe Loja

public class LojaController {
    
    private List<Loja> discos = new ArrayList<>(); // Criando  lista para armazenar os discos
    private int contador = 1; // Criando um enumerador de ndisco

 // Método adicione um disco
    public void adicionarDisco(String nomeArtista, String tituloDisco) {
        Loja novoDisco = new Loja(contador, nomeArtista, tituloDisco);
        discos.add(novoDisco);
        System.out.println("Disco cadastrado com sucesso! Número: " + contador);
        contador++;
    }

    // Método  listar  os discos
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








    
    
    
