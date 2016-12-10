package interfaceG;
//@LucasTavares

public class Jogador extends Exception {

    private String nome;
    private int idade ;
    private double salario;
    private String premioIndividual;
    private String modalidade;
    


    public Jogador(){
        }
    
    //inicializando os dados no metodo construtor
    public Jogador(String nome, double salario, String premioIndividual, String modalidade,int idade){
        this.nome = nome;
        this.salario = salario;
        this.premioIndividual = premioIndividual;
        this.modalidade = modalidade;
        this.idade = idade;
        } 
  
    
    public String getnome() {
        return nome;
        }

    public void setnome(String nome) {
        this.nome = nome;
        }

    public int getidade() {
        
        return idade;
        }
   
    public void setidade(int idade) {
        this.idade = idade;
    
    }
    public double getsalario() {
        return salario;
        }

    public void setsalario(double salario) {
        this.salario = salario;
        }

    public String getpremioIndividual() {
        return premioIndividual;
        }


    public void setpremioIndividual(String premioIndividual) {
        this.premioIndividual = premioIndividual;
        }
   
    public String getmodalidade() {
        return modalidade;
        }
 
    public void setmodalidade(String modalidade) {
        this.modalidade = modalidade;
        }


}
