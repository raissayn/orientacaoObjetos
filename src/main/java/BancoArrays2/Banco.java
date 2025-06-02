package BancoArrays2;

import java.util.ArrayList;

public class Banco {
//    private Cliente[] clientes; // CRIANDO ARRAY
//    private int numeroDeClientes;

    private ArrayList<Cliente> clientes;

    public Banco() {
//        clientes = new Cliente[5]; // tamanho inicial, pode ser ajustado se necessário
//        numeroDeClientes = 0;
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente getCliente(int indice) {
        if (indice >= 0 && indice < clientes.size()) {
            return clientes.get(indice);
        } else {
            return null;
        }
    }

    public int getNumeroDeClientes() {
        return clientes.size();
    }

}