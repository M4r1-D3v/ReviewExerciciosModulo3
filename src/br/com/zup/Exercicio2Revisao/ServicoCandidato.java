package br.com.zup.Exercicio2Revisao;

import java.util.ArrayList;
import java.util.List;

public class ServicoCandidato {
    private static List<Candidato> candidatos = new ArrayList<>();

    public ServicoCandidato(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Candidatos: " + candidatos);
        return retorno.toString();
    }

    //método para adicionar um candidato

    public static Candidato adicionarCandidato(String nome, String numeroMatricula, double nota) {
        Candidato candidato = new Candidato(nome, numeroMatricula, nota);
        candidatos.add(candidato);
        return candidato;
    }

    // método para listar os candidados
    public static void listarCandidatos() {
        for (Candidato candidatoReferencia : candidatos) {
            System.out.println("\n" + candidatoReferencia);
        }
    }
    // método para excluir candidatos a partir do número de matrícula fornecido

    public static void excluirCandidato(String numeroMatricula) {
        Candidato candidatoExcluido = null;
        for (Candidato candidatoReferencia : candidatos) {
            if (candidatoReferencia.getNumeroMatricula().equals(numeroMatricula)) {
                candidatoExcluido = candidatoReferencia;
            }
        }
        candidatos.remove(candidatoExcluido);
    }
}
