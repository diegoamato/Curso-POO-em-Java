package exercicioaulas1213;
public abstract class Animal {
    
    // ATTRIBUTES
    protected float peso;
    protected int idade;
    protected int membros;
    
    // PUBLIC METHODS
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    // SPECIAL METHODS
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
