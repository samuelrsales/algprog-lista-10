package model;

public class Musica {
    private String nome;
    private String compositor;
    private String album;

    public Musica(String nome, String compositor, String album) {
        this.nome = nome;
        this.compositor = compositor;
        this.album = album;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCompositor() {
        return this.compositor;
    }

    public String getAlbum() {
        return this.album;
    }

    public String tocar() {
        return "A musica " + this.nome + " esta tocando.";
    }

    public String pausar() {
        return "A musica " + this.nome + " foi pausada.";
    }
}
