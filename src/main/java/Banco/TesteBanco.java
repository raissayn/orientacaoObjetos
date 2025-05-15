package Banco;

public class TesteBanco {
    public static void main(String[] args) {
    Conta c1 = new Conta(1000);

    System.out.println("Sacando R$ 250,00");
    c1.sacar(250);
    System.out.println("Depositando R$ 320,50");
    c1.depositar(320.50);
    System.out.println("Sacando R$ 120,00");
    c1.sacar(120);
    System.out.println("O saldo da conta é " + c1.getSaldo());
 }
}
