package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import loja.model.Disco;
import loja.controller.LojaController;


public class Menu {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        LojaController lojaController = new LojaController();
        int opcao, numero;
        String nome, titulo;

        while (true) {
            System.out.println("*****************************************************");
            System.out.println("                O SOM NA CABEÇA                      ");
            System.out.println("*****************************************************");
            System.out.println("           1- Cadastrar Produto                      ");
            System.out.println("           2- Listar                                 ");
            System.out.println("           3- Atualizar                              ");
            System.out.println("           4- Remover                                ");
            System.out.println("           5- Sair                                   ");
            System.out.println("*****************************************************");
            System.out.println("             Entre com a opção desejada:             ");
            
            
            try {
            	
				opcao = leia.nextInt();
            }catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				opcao=0;
			}
				/*leia.nextLine();
				opcao=0;
            opcao = leia.nextInt();
            leia.nextLine(); */

            
            if (opcao == 5) {
                System.out.println("Saindo");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Artista:");
                    nome = leia.nextLine();
                    leia.nextLine();
                    System.out.println("Digite o nome do Disco:");
                    titulo = leia.nextLine();
                    lojaController.adicionarDisco(nome, titulo);
                    keyPress();
                    break;

                    
                    
                case 2:
                    lojaController.listarDiscos();
                    keyPress();
                    break;

                case 3:
                    System.out.println("Digite o número do disco para atualizar:");
                    numero = leia.nextInt();
                    leia.nextLine();
                    System.out.println("Digite o novo nome do Artista:");
                    nome = leia.nextLine();
                    System.out.println("Digite o novo nome do Disco:");
                    titulo = leia.nextLine();
                    lojaController.atualizarDisco(numero, nome, titulo);
                    keyPress();
                    break;

                case 4:
                    System.out.println("Digite o número do disco para remover:");
                    numero = leia.nextInt();
                    lojaController.removerDisco(numero);
                    keyPress();
                    break;

                default:
                    System.out.println("Opção inválida!");
                    keyPress();
                    break;
                    
                    
            }
       leia.nextLine();    
           
        }
        
    }
    public static void keyPress() {

		try {

			System.out.println( "\n\nPressione Enter para Continuar...");
			System.in.read();
			
		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
    }
    }

