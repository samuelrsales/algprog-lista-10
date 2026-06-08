import model.Aluno;
import model.Cachorro;
import model.Carro;
import model.Celular;
import model.Conta;
import model.Guitarra;
import model.Moradia;
import model.Musica;
import model.Produto;
import model.Soldado;
import model.TipoConta;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Samuel", TipoConta.CORRENTE, 1500);
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Celular celular1 = new Celular("Android", "Galaxy A15", "Samsung");
        Guitarra guitarra1 = new Guitarra("Stratocaster", "Fender", "Preta");
        Produto produto1 = new Produto("Notebook", "Eletronico", 3500);
        Moradia moradia1 = new Moradia("Casa", "Branca", 120);
        Cachorro cachorro1 = new Cachorro("Rex", "Samuel", "Labrador");
        Musica musica1 = new Musica("Numb", "Linkin Park", "Meteora");
        Soldado soldado1 = new Soldado("Carlos", "Cabo", 5);
        Aluno aluno1 = new Aluno("Joao", "joao@email.com", 1234);

        aluno1.lancarNota(8.0);
        aluno1.lancarNota(7.5);

        System.out.println(conta1);
        conta1.depositar(500);
        conta1.sacar(200);
        System.out.println("Saldo atual: " + conta1.getSaldo());

        System.out.println(carro1.acelerar());
        System.out.println(celular1.fazerLigacao("Maria"));
        System.out.println(guitarra1.tocar());

        System.out.println(produto1.vender());
        produto1.atualizarPreco(3200);
        System.out.println("Novo preco: " + produto1.getPreco());

        System.out.println(moradia1.pintar("Azul"));
        System.out.println(cachorro1.brincar());
        System.out.println(musica1.tocar());

        soldado1.subirPatente("Sargento");
        System.out.println(soldado1.iniciarPlantao());
        System.out.println("Patente atual: " + soldado1.getPatente());

        System.out.println("Aluno aprovado: " + aluno1.verificarAprovado());
    }
}
