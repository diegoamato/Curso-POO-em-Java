package exercicioaula02;
public class ExercicioAula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.model = "BIC Cristal";
        c1.color = "Azul";
        // c1.tip = 0.5;
        c1.charge = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
