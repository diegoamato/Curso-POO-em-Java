package exercicioaula10;
public class Professor extends Pessoa{
    
    // ATTRIBUTES
    private String especialidade;
    private float salario;
    
    // PUBLIC METHODS
    public void receberAum(float aum){
        this.setSalario(this.getSalario() + aum);
    }
    
    // SPACIAL METHODS
    // CONSTRUCTOR
    //public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
    //    super(nome, idade, sexo);
    //    this.especialidade = especialidade;
    //    this.salario = salario;
    //}
    
    //GETTER AND SETTER
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
