package pct.example;

import banco.Conta;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
//        // Criando múltiplas contas
//        Conta conta1 = new Conta(1000.0);
//        Conta conta2 = new Conta(500.0);
//        Conta conta3 = new Conta(200.0);
//
//        // Operações na conta1
//        System.out.println("Conta 1 - Saldo inicial: R$ " + conta1.getSaldo());
//        conta1.depositar(100.0);
//        conta1.sacar(50.0);
//        System.out.println("Conta 1 - Saldo final: R$ " + conta1.getSaldo());
//
//        // Operações na conta2
//        System.out.println("\nConta 2 - Saldo inicial: R$ " + conta2.getSaldo());
//        conta2.sacar(600.0); // deve mostrar mensagem de saldo insuficiente
//        conta2.depositar(200.0);
//        conta2.sacar(300.0);
//        System.out.println("Conta 2 - Saldo final: R$ " + conta2.getSaldo());
//
//        // Operações na conta3
//        System.out.println("\nConta 3 - Saldo inicial: R$ " + conta3.getSaldo());
//        conta3.depositar(50.0);
//        conta3.sacar(100.0);
//        conta3.depositar(25.0);
//        System.out.println("Conta 3 - Saldo final: R$ " + conta3.getSaldo());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas contas deseja criar? ");
        int totalContas = scanner.nextInt();
        scanner.nextLine(); // Limpar quebra de linha

        String[] nomes = new String[totalContas];
        Conta[] contas = new Conta[totalContas];

        // Criação das contas
        for (int i = 0; i < totalContas; i++) {
            System.out.println("\nCriando conta #" + (i + 1));
            System.out.print("Nome do titular: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Saldo inicial: R$ ");
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine(); // Limpar quebra de linha

            contas[i] = new Conta(saldoInicial);
        }

        // Menu de operações
        int opcao;
        do {
            System.out.println("\n===== Menu Banco =====");
            for (int i = 0; i < totalContas; i++) {
                System.out.println(i + " - " + nomes[i]);
            }
            System.out.println("-1 - Sair");
            System.out.print("Escolha o número da conta para acessar: ");
            int escolhaConta = scanner.nextInt();

            if (escolhaConta == -1) break;

            if (escolhaConta < 0 || escolhaConta >= totalContas) {
                System.out.println("Conta inválida.");
                continue;
            }

            Conta contaSelecionada = contas[escolhaConta];
            String nome = nomes[escolhaConta];

            // Menu interno da conta
            do {
                System.out.println("\nOperações para " + nome);
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Ver saldo");
                System.out.println("0 - Voltar");
                System.out.print("Opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Valor para depositar: R$ ");
                        double valorDep = scanner.nextDouble();
                        contaSelecionada.depositar(valorDep);
                        break;
                    case 2:
                        System.out.print("Valor para sacar: R$ ");
                        double valorSaq = scanner.nextDouble();
                        contaSelecionada.sacar(valorSaq);
                        break;
                    case 3:
                        System.out.println("Saldo de " + nome + ": R$ " + contaSelecionada.getSaldo());
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 0);

        } while (true);

        scanner.close();
        System.out.println("Encerrando o sistema bancário.");

    }
}
