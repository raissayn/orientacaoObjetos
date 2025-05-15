package Banco;

public class Conta {
    private double saldo;

    // NA UML O CONSTRUTOR COMEÇA COM LETRA MAIUSCULA!
    public Conta (double saldoInicial){
        this.saldo = saldoInicial;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar (double valor){
        this.saldo += valor;
    }
    public void sacar (double amount){
        if ( this.saldo >= amount){
            this.saldo -= amount;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
