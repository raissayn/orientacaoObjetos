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
    public boolean depositar (double valor){
       this.saldo += valor;
        return true;
    }
    public boolean sacar (double amount){
        if ( this.saldo >= amount){
            this.saldo -= amount;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false; // saque falhou
        }
    }
}
