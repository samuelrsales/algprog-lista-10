package model;

public class Soldado {
    private String nome;
    private String patente;
    private int anosServico;

    public Soldado(String nome, String patente, int anosServico) {
        this.nome = nome;
        this.patente = patente;
        this.anosServico = anosServico;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPatente() {
        return this.patente;
    }

    public int getAnosServico() {
        return this.anosServico;
    }

    public void subirPatente(String novaPatente) {
        this.patente = novaPatente;
    }

    public String iniciarPlantao() {
        return "O soldado " + this.nome + " iniciou o plantao.";
    }
}
