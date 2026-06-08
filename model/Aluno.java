package model;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String email;
    private int matricula;
    private ArrayList<Double> notas;

    public Aluno(String nome, String email, int matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public ArrayList<Double> getNotas() {
        return this.notas;
    }

    public void lancarNota(double nota) {
        this.notas.add(nota);
    }

    public void adicionarNota(double nota) {
        this.lancarNota(nota);
    }

    public boolean verificarAprovado() {
        double media = this.notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        return media >= 7;
    }
}
