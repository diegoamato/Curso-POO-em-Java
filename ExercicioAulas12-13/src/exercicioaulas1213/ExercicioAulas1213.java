package exercicioaulas1213;
public class ExercicioAulas1213 {
    public static void main(String[] args) {
        Cachorro k = new Cachorro();
        Canguru c = new Canguru();
        
        k.emitirSom();
        k.locomover();
        c.emitirSom();
        c.locomover();
        
        k.reagir("Vai te deitar");
        k.reagir(true);
        k.reagir(11, 45);
        k.reagir(19, 00);
        k.reagir(9, 2.3f);
        
    }
    
}
