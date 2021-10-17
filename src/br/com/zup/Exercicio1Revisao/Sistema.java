package br.com.zup.Exercicio1Revisao;

import java.util.Scanner;

//1. Crie um programa para gerenciar uma lista de produtos de um
//estabelecimento, cada produto tem um nome e um preço. No final do programa, o
//usuário deve decidir se irá adicionar mais de um produto, exibir todos os produtos
//cadastrados ou excluir um produto pelo nome.

public class Sistema {

    //método para receber os dados do usuário
    private static Scanner entradaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //metodo para receber os dados de cadastro do produto:
    public static Produto cadastrarProduto() {
        String nomeProduto = entradaDados("Por favor, digite o nome do produto a ser cadastrado: ").nextLine();
        double precoProduto = entradaDados("Por favor, digite o preço do produto a ser cadastrado: ").nextDouble();
        return ServicoProduto.cadastrarProduto(nomeProduto, precoProduto);
    }

    //metodo para receber os dados de exclusão do produto:

    public static void excluirProduto() {
        String nomeProduto = entradaDados("Por favor, digite o nome do produto a ser excluído: ").nextLine();
         ServicoProduto.excluirProduto(nomeProduto);
    }

    //método para exibir as opções do menu

    public static void menu() {
        System.out.println("\n ");
        System.out.println("**********************************************************");
        System.out.println("Seja bem vinde ao sistema de gerenciamento de produtos X!");
        System.out.println("**********************************************************");
        System.out.println("\n ");
        System.out.println("Para cadastrar um produto, digite [1]");
        System.out.println("Para excluir um produto, digite [2]");
        System.out.println("Para listar os produtos cadastrados, digite [3]");
        System.out.println("Para sair do sistema, digite [4]");
    }

    //método para executar o programa completo

    public static boolean executar() {
        boolean operarMenu = true;

        while (operarMenu) {
            menu();
            System.out.println("---------------------------------------------------");
            int escolhaUsuario = entradaDados("Escolha a opção desejada: ").nextInt();
            if (escolhaUsuario == 1) {
                Produto produto = new Produto();
                produto = cadastrarProduto();
                System.out.println("\n");
                System.out.println("Produto cadastrado com sucesso!");
            } else if (escolhaUsuario == 2) {
                String produtoExcluido = entradaDados("Por favor, digite o nome do produto a ser excluído: ").nextLine();
                ServicoProduto.excluirProduto(produtoExcluido);
                System.out.println("Produto cadastrado com sucesso!");
            } else if (escolhaUsuario == 3) {
                System.out.println("---------------------------------------------------");
                System.out.println("Lista dos produtos cadastrados:");
                System.out.println("---------------------------------------------------");
                ServicoProduto.listarProdutos();
            } else if (escolhaUsuario == 4) {
                System.out.println("Obrigade e até a próxima!");
                operarMenu = false;
            } else {
                System.out.println("Por favor, digite uma opção válida.");
            }
        }
        return operarMenu;
    }
}
