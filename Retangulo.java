
package exercicio3;
//@LucasTavares
public class Retangulo extends FiguraGeometrica {
     protected int base;
     protected int altura;
    
     public Retangulo(){
     
     }
     
     public Retangulo(int b, int a){ // método construtor
        this.base = b;
        this.altura = a;
        }
    
     public double getcalcAreaRet(){
        return (base*altura);
        }
    
     public void setcalcAreaRet(int area){
        }
     public double getcalcPerimetroRet(){
         return ((2*base)+(2*altura));
        }
     public void setcalcPerimetroRet(int perimetro){
        }
     public void mostrarDados(){
           System.out.println("Valor da base: "+base);
           System.out.println("Valor da altura: "+altura);
           System.out.println("A cor do retângulo é: "+getCor());
           System.out.println("Está preenchido? "+getestaPreenchida());
           System.out.println("Área do retângulo: "+getcalcAreaRet());
           System.out.println("Perímetro do retângulo: "+getcalcPerimetroRet());
          
    }    
}
