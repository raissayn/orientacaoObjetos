package Banco;

public class TesteBanco1 {  public static void main(String[] args) {
    // 1) Cria o cliente
    Cliente bruno = new Cliente("Bruno" , "Henrique");

    // Criar conta com saldo inicial de R$ 50.000,00 e associar ao cliente
    Conta conta = new Conta(50000.00);
    bruno.setConta(conta); // supondo que Cliente tem um método setConta()

    System.out.println("Cliente: " + bruno.getNome());

    // Saque de R$ 1.200,00
    System.out.println("\nSacando R$ 1.200,00");
    conta.sacar(1200.00);

    // Depósito de R$ 8.525,00
    System.out.println("\nDepositando R$ 8.525,00");
    conta.depositar(8525.00);

    // Saque de R$ 12.800,00
    System.out.println("\nSacando R$ 12.800,00");
    conta.sacar(12800.00);

    // Saque de R$ 50.000,00 (deve falhar ou deixar saldo negativo, dependendo da lógica da Conta)
    System.out.println("\nTentando sacar R$ 50.000,00");
    conta.sacar(50000.00);
    System.out.println("Saldo final: R$ " + conta.getSaldo());
}

}
