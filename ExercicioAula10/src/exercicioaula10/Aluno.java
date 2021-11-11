package exercicioaula10;
public class Aluno extends Pessoa{
    
    // ATTRIBUTES
    private int matricula;
    private String curso;
    
    // PUBLIC METHODS
    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada!");;
    }
    
    // SPACIAL METHODS
    // CONSTRUCTOR
    //public Aluno(String curso, int matr, String nome, int idade, String sexo) {
    //    super(nome, idade, sexo);
    //    this.curso = curso;
    //    this.matricula = matr;
    //}
    // GETTER AND SETTER
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
