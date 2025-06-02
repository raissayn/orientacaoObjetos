package BancoArrays;

public class Banco {
    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco(){
        this.clientes = new Cliente[5];
    }

    public void adicionarCliente(Cliente cliente){
        clientes[numeroDeClientes] = cliente;
        numeroDeClientes++;
    }

    public Cliente[] getClientes(){
        return this.clientes;
    }

    public int getNumeroDeClientes() {
        return this.numeroDeClientes;
    }

}
