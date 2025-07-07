package BancoHeranc;

public class ContaPoupanca  extends Conta {
    private double rendimento;

    class ContaPoupanca (double saldoInicial, double rendimento){
        super(saldoInicial);
        this.rendimento = rendimento;
    }

}
