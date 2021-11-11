package exercicioaulas1213;
public class Ave extends Animal{
    
    // ATTRIBUTES
    private String corPena;
    
    // PUBLIC METHODS
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comento frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    
    // SPECIAL METHODS
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
