package Ponto;

public class TestePonto {
    public static void main(String[] args) {
        Ponto primeiroPonto = new Ponto(200, 200);
        Ponto segundoPonto = new Ponto(400, 230);

        // Passo 6 e 7
        Ponto outraRefSegundoPonto = segundoPonto;

        // Passo 8 – altera o objeto referenciado por outraRefSegundoPonto
        outraRefSegundoPonto.setX(800);
        outraRefSegundoPonto.setY(100);

        // exiba no console ambas as variaveis pontos
        System.out.println("Ponto 1: " + primeiroPonto.toString());
        System.out.println("Ponto 2: " + segundoPonto.toString());
        System.out.println("OutraRefSegundoPonto: " + outraRefSegundoPonto.toString());
    }
}
