package model;

public class Moradia {
    private String tipo;
    private String cor;
    private double metros2;

    public Moradia(String tipo, String cor, double metros2) {
        this.tipo = tipo;
        this.cor = cor;
        this.metros2 = metros2;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getCor() {
        return this.cor;
    }

    public double getMetros2() {
        return this.metros2;
    }

    public String pintar(String novaCor) {
        this.cor = novaCor;
        return "A moradia foi pintada de " + this.cor + ".";
    }

    public String trancar() {
        return "A moradia foi trancada.";
    }
}
