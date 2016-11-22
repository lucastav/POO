
package EXERCICIO;


public class MainPonto {

    public static void main(String[] args) {
    
        Ponto p0;
                p0 = new Ponto(31,13);
                System.out.println("Xo: "+p0.x);
                System.out.println("Yo: "+p0.y);
        
        Ponto p1;
                p1 = new Ponto(21,12);
                System.out.println("X1: "+p1.x);
                System.out.println("Y1: "+p1.y);
        
                System.out.println(p0.distancia(p1));
                System.out.println(p1.distancia(p0));
                System.out.println(p0.distancia(p0));
                System.out.println(p1.distancia(p1));
                

    }
    
}