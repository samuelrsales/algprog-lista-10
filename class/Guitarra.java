public class Guitarra {
    private String modelo;
    private String marca;
    private String cor;

    public Guitarra(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getCor(){
        return this.cor;
    }

    public String afinar(){
        return "A guitarra " + this.modelo + " foi afinada.";
    }

    public String tocar(){
        return "A guitarra " + this.modelo + " está sendo tocada.";
    }
}
