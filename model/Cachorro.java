package model;

public class Cachorro {
    private String nome;
    private String tutor;
    private String raca;

    public Cachorro(String nome, String tutor, String raca) {
        this.nome = nome;
        this.tutor = tutor;
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTutor() {
        return this.tutor;
    }

    public String getRaca() {
        return this.raca;
    }

    public String latir() {
        return "O cachorro " + this.nome + " está latindo.";
    }

    public String brincar() {
        return "O cachorro " + this.nome + " está brincando.";
    }
}
