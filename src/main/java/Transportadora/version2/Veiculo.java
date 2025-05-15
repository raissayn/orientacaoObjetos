package Transportadora.version2;

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
    public boolean adicionarCarga(double carga){
        if(this.carga + carga <= this.cargaMaxima){
            this.carga += carga;
            return true;
        }
        return false;
    }
}
