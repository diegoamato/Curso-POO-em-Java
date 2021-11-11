package exercicioaulas1213;
public class Canguru extends Mamífero{
    
    // PUBLIC METHODS
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
}
