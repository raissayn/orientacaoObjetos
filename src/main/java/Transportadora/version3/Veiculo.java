package Transportadora.version3;

public class Veiculo {
    private double carga;
    private double cargaMaxima;

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
    private double newtonsParaQuilos(double peso){
        return peso / 9.8;
    }
    private double quilosParaNewtons(double peso){
        return peso * 9.8;
    }
    public double getCargaEmNewtons(){
        return newtonsParaQuilos(this.carga);
    }
    public double getCargaMaximaEmNewtons(){
        return quilosParaNewtons(this.cargaMaxima);
    }
}
