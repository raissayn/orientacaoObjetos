package BancoArrays2;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public double saldo() {
        return this.saldo;
    }
    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
