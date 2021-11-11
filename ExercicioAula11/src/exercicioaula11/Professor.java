package exercicioaula11;
public class Professor extends Pessoa{
    
    // ATTRIBUTES
    private String especialidade;
    private float salario;
    
    // PUBLIC METHODS
    public void receberAumento(float aum){
        this.setSalario(this.getSalario() + aum);
    }
    
    // SPECIAL METHODS

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
