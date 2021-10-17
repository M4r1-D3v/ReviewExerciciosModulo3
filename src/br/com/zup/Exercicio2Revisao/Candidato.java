package br.com.zup.Exercicio2Revisao;

public class Candidato {
    private String nome;
    private double numeroMatricula;
    private double nota;

    public Candidato(String nome, double numeroMatricula, double nota) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(double numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome: " + nome);
        retorno.append("\n Número de matrícula: " + numeroMatricula);
        retorno.append("\n Nota: " + nota);
        return retorno.toString();
    }
}
