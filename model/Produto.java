package model;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public double getPreco() {
        return this.preco;
    }

    public String vender() {
        return "O produto " + this.nome + " foi vendido.";
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}
