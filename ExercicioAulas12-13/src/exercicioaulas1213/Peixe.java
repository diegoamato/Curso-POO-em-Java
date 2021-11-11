package exercicioaulas1213;
public class Peixe extends Animal{
    
    // ATTRIBUTES
    private String corEscama;
    
    // PUBLIC METHODS
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    // SPECIAL METHODS
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
