package BancoArrays;

public class Banco {
    private Cliente[] clientes; // CRIANDO ARRAY
    private int numeroDeClientes;

    public Banco() {
        clientes = new Cliente[5]; // tamanho inicial, pode ser ajustado se necessário
        numeroDeClientes = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (numeroDeClientes < clientes.length) {
            clientes[numeroDeClientes] = cliente;
            numeroDeClientes++;
        } else {
            System.out.println("Limite de clientes atingido.");
        }
    }
    public Cliente getCliente(int indice) {
        if (indice >= 0 && indice < numeroDeClientes) {
            return clientes[indice];
        } else {
            return null;
        }
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }

    public void setNumeroDeClientes(int numeroDeClientes) {
        this.numeroDeClientes = numeroDeClientes;
    }

}
