
package exercicio3;
//@LucasTavares

public class FiguraGeometrica  {
         protected  String cor;
         protected boolean estaPreenchida;
         
    public FiguraGeometrica(){
        
        } 
    public FiguraGeometrica(String c, boolean v){
        this.cor = c;
        this.estaPreenchida = v;
    }    

    public String getCor() {
        return cor;
        }


    public void setCor(String c) {
        this.cor = c;
        }

  
    public boolean getestaPreenchida() {
        return estaPreenchida;
        }

      public void setestaPreenchida(boolean preenchimento) {
        this.estaPreenchida = preenchimento;
        }
         
    
    
}
