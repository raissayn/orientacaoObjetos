package BancoArrays;

public class Conta {
    public double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }
    public boolean sacar(double valor){
        if ( (this.saldo - valor) >= 0 ) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
