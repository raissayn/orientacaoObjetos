package Transportadora.version1;

public class Veiculo {
    public double carga;
    public double cargaMaxima;

    // metodos

    public Veiculo(double cargaMaxima){ // CONSTRUTOR
        this.cargaMaxima = cargaMaxima;
        this.carga = 0;
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }
}
