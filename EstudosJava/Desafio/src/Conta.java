public class Conta {
    private double saldo;
    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void creditar(double valor) {
        saldo += valor;
    }
    public void debitar(double valor) {
        saldo -= valor;
    }
    public double getSaldo() {
        return saldo;
    }
}