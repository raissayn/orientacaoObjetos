package Ponto;

public class Ponto {
    private int x;
    private int y;


    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }

    // Método toString para facilitar a exibição!
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
