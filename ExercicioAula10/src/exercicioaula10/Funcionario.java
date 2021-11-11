package exercicioaula10;
public class Funcionario extends Pessoa{
    
    // ATTRIBUTES
    private String setor;
    private boolean trabalhando;
    
    // PUBLIC METHODS
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }
    
    // SPACIAL METHODS
    //CONSTRUCTOR
    //public Funcionario(String setor, String nome, int idade, String sexo) {
    //    super(nome, idade, sexo);
    //    this.setor = setor;
    //    this.trabalhando = true;
    //}
    
    // GETTER AND SETTER
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
