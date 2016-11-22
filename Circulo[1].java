package EXERCICIO;
import java.util.Scanner;

public class Circulo {
    
Scanner leia = new Scanner(System.in);
    
       protected String nome;
       private double raio;
       public Ponto centro; 
       
        
     
        public Circulo (String n, double r, Ponto cent){
            n = nome;
            r = raio;
            cent = centro;
            }
  
            Circulo() {
        
            }

            public double calcDiametro(){
            return raio*2;
            }

            public double calcArea(){
            return 3.14*(raio*raio);
            }

           public double calcPerimetro(){
            return 2*(raio*3.14);
            }

          protected void nome(){
             System.out.println("Informe seu nome: ");
            nome = leia.nextLine();
            }
                    
            protected void inicializar(){
            System.out.println("Informe o valor do raio do círculo: ");
            raio = leia.nextDouble();
            }
            
            protected void exibir(){
            System.out.println("O círculo apresenta diâmetro: "+calcDiametro());
            System.out.println("O círculo apresenta área: "+calcArea());
            System.out.println("O círculo apresenta perímetro: "+calcPerimetro());
    }

    
}



            
    


