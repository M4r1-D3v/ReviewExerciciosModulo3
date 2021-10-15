package br.com.zup.ExerciciosRevisao;

//Criar atributos da classe
public class Produtos {
    private String nome;
    private double preco;

  //Criar método construtor
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //criar getters/setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //criar toString/StringBuilder

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " + nome);
        retorno.append("Preço: " + preco);
        return retorno.toString();
    }
}
