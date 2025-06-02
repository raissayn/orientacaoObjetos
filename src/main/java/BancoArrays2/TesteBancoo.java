package BancoArrays2;

public class TesteBancoo {
    public static void main(String[] args) {
        BancoArrays2.Cliente brunohenrique = new BancoArrays2.Cliente("Bruno", "Henrique");
        BancoArrays2.Cliente evertonribeiro = new BancoArrays2.Cliente("Everton", "Ribeiro");
        BancoArrays2.Cliente filipeluis = new BancoArrays2.Cliente("Filipe", "Luis");
        BancoArrays2.Cliente gabrielbarbosa = new BancoArrays2.Cliente("Gabriel", "Barbosa");
        BancoArrays2.Cliente diegoalves = new BancoArrays2.Cliente("Diego", "Alves");

        BancoArrays2.Conta contaBrunoHenrique = new BancoArrays2.Conta(50000);
        brunohenrique.setConta(contaBrunoHenrique);

        BancoArrays2.Conta contaEvertonRibeiro = new BancoArrays2.Conta(45000);
        evertonribeiro.setConta(contaEvertonRibeiro);

        BancoArrays2.Conta contaFilipeLuis = new BancoArrays2.Conta(70000);
        filipeluis.setConta(contaFilipeLuis);

        BancoArrays2.Conta contaGabrielBarbosa = new BancoArrays2.Conta(220000);
        gabrielbarbosa.setConta(contaGabrielBarbosa);

        BancoArrays2.Conta contaDiegoAlves = new BancoArrays2.Conta(50000);
        diegoalves.setConta(contaDiegoAlves);

        BancoArrays2.Banco banco = new Banco();
        banco.adicionarCliente(brunohenrique);
        banco.adicionarCliente(evertonribeiro);
        banco.adicionarCliente(filipeluis);
        banco.adicionarCliente(gabrielbarbosa);
        banco.adicionarCliente(diegoalves);

        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
            Cliente cliente = banco.getCliente(i);
            Conta conta = cliente.getConta();
            System.out.println("Cliente: [" + (i + 1) + "]: " + cliente.getNome() + " " + cliente.getSobrenome() + " .Saldo R$: " + conta.getSaldo());
        }
        }
}
