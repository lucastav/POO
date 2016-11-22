
package exercicio3;
//@LucasTavares
public class TestarPrograma {
    
    public static void main(String [] args ){
         
        Circulo c1 = new Circulo(8);
        c1.setCor("Preto");
        c1.setestaPreenchida(true);
        
        Retangulo r1 = new Retangulo(5,10);
        r1.setCor("Amarelo");
        r1.setestaPreenchida(true);
        
        System.out.println("--------Dados do Círculo----------");
            c1.exibir();
         
        System.out.println("--------Dados do Retângulo---------");
            r1.mostrarDados();
        
    }
}
