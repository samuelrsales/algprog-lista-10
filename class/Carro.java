public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return this.modelo;
    }
    
    public String acelerar() {
        return "O carro " + getModelo() + " está acelerando..." ;
    }

    public String freiar() {
        return "O carro " + getModelo() + " freiou..." ;
    }

    public String lavar() {
        return "O carro " + getModelo() + " foi lavado..." ;
    }
}