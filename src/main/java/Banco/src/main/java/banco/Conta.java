package banco;


public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {

        this.saldo = saldoInicial;
    }

    public double getSaldo() {

        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        }
    }
}

