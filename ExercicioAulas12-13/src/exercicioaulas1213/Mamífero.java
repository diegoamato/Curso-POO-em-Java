package exercicioaulas1213;
public class Mamífero extends Animal{
    
    // ATTRIBUTES
    private String corPelo;
    
    // PUBLIC METHODS
    @Override
    public void locomover() {
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
    // SPECIAL METHODS
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
