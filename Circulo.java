
package exercicio3;

public class Circulo extends FiguraGeometrica {
     protected double raio;
    
 
     public Circulo (){
     }
     
     
     public Circulo(double r){ // método construtor
        this.raio = r;
        }
    
     public double getcalcDiametro(){
        return (2*raio);
        }
    
     public void setcalcDiametro(double d){
        }
    
     public double getcalcPerimetro(){
        return (Math.PI*2*raio);
        }
    
     public void setcalcPerimetro(double p){
        }
    
     public double getcalcArea(){
        return (Math.PI*raio*raio);
        }
    
     public void setcalcArea(double a){
        }
    
     public void exibir(){
        System.out.println("Valor do raio do círculo: "+raio);
        System.out.println("A cor do círculo é: "+getCor());
        System.out.println("Está preenchido? "+getestaPreenchida());
        System.out.println("O círculo apresenta diâmetro: "+getcalcDiametro());
        System.out.println("O círculo apresenta área: "+getcalcArea());
        System.out.println("O círculo apresenta perímetro: "+getcalcPerimetro());
    }    
}
