package BancoArrays;

public class Cliente {
    private String nome;
    private String sobrenome;
    private Conta[] contas;

    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contas = new Conta[10];
    }
    // Métodos
    public Conta[] getContas() {
        return contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
