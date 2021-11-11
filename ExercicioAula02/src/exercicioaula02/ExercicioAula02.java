package exercicioaula02;
public class ExercicioAula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.model = "Bic";
        c1.color = "Azul";
        c1.tip = 1f;
        c1.charge = 85;
        c1.capped = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("///////////////////////////");
        
        Caneta c2 = new Caneta();
        c2.color = "Preta";
        c2.model = "Pilot Super Grip";
        c2.tip = 1.6f;
        c2.charge = 60;
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
    
}
