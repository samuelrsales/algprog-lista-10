public class Conta {
    private String titular;
    private String tipo;
    private double saldo;

    public Conta( String titular, String tipo, double saldo) {
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }
}
