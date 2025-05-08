package Banco;

// EXERCÍCIO DOS ARRAYS
public class Banco {
    private Cliente[] clientes;
    private int numeroClientes;

    public Banco() {
        this.clientes = new Cliente[5];
    }
    public void adicionarCliente(Cliente cliente) {
        clientes[numeroClientes] = cliente;
        numeroClientes++;
    }
    public Cliente[] getClientes(int indice) {
        return clientes[indice];
    }
    public int getNumeroClientes() {
        return numeroClientes;
    }
}

