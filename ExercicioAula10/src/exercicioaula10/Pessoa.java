  package exercicioaula10;
public class Pessoa {
    
    // ATTRIBUTES
    private String nome;
    private int idade;
    private String sexo;
    
    // PUBLIC METHODS
    public void fazerAniv(){
        this.setIdade(this.getIdade()+1);
    }
    
    // SPACIAL METHODS
    // CONSTRUCTOR
    //public Pessoa(String nome, int idade, String sexo) {
    //    this.nome = nome;
    //    this.idade = idade;
    //    this.sexo = sexo;
    //}
    
    // TO STRING
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    // GETTER AND SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}