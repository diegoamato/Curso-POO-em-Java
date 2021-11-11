package exerciciofinal;
public abstract class Pessoa {
    
    // ATTRIBUTES
    protected String nome;
    protected int idade;
    protected String sexo;
    protected boolean experiencia;
    
    // PUBLIC METHODS
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = false;
    }

    protected void ganharExp() {
        this.setExperiencia(true);
    }
    
    // SPECIAL METHODS
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

    public boolean getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa {" + "\nnome = " + nome + "\nidade = " + idade + 
                "\nsexo = " + sexo + "\nexperiencia = " + experiencia + "\n}";
    }
    
    
}
