package exercicioaula11;
public class Aluno extends Pessoa{
    
    // ATTRIBUTES
    private int matricula;
    private String curso;
    
    // PUBLIC METHODS
    public void pagarMensalidade(){
        System.out.println("Mensalidade do aluno " + this.getNome() + " foi Paga!");
    }
    
    // SPECIAL METHODS
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
