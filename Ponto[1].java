
package EXERCICIO;


public class Ponto {

    public int x;
    public int y;
    
    public Ponto(int valX, int valY){
        x = valX;
        y = valY;
    }
    
    public double distancia(Ponto p2){
        double dist = Math.sqrt(Math.pow((p2.y - y),2)+ Math.pow((p2.x - x),2));
        return dist;
    }
    
}
