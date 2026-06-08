package model;

public class Celular {
    private String sistemaOperacional;
    private String modelo;
    private String marca;

    public Celular(String sistemaOperacional, String modelo, String marca) {
        this.sistemaOperacional = sistemaOperacional;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return this.sistemaOperacional;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String ligar() {
        return "O celular " + this.modelo + " foi ligado.";
    }

    public String fazerLigacao(String destinatario) {
        return "Ligando para " + destinatario + "...";
    }
}
