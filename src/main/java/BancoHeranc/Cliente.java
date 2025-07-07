package BancoHeranc;


public class Cliente {
    private String nome;
    private String sobrenome;
    private Banco.Conta conta; // UTILIZA CONTA

    // métodos
    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.conta = new Banco.Conta(0);
    }

    public Banco.Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
