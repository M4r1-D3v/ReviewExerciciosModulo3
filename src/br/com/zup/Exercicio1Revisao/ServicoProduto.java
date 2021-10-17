package br.com.zup.Exercicio1Revisao;

import java.util.ArrayList;
import java.util.List;

public class ServicoProduto {
    private static List<Produto> produtos = new ArrayList<>();

    //método para cadastrar produto
    public static Produto cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        return produto;


    }

//método para excluir produto a partir do nome recebido

    public static void excluirProduto(String nome) {
        Produto produtoExcluido = null;
        for (Produto referenciaProduto : produtos) {
            if (referenciaProduto.getNome().equals(nome)) {
                produtoExcluido = referenciaProduto;

            }
        }
        produtos.remove(produtoExcluido);
    }

    //método para exibir a lista de produtos

    public static void listarProdutos() {
        for (Produto referenciaProduto : produtos) {
            System.out.println("\n" + referenciaProduto);
            System.out.println("-----------------------");

        }
    }


}
