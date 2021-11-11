package exercicioaula02;
public class Caneta {
    String model;
    String color;
    float tip; // ponta
    int charge;
    boolean capped; //tampada
    void status(){
        System.out.println("Modelo: " + this.model);
        System.out.println("Uma caneta " + this.color);
        System.out.println("Ponta: " + this.tip);
        System.out.println("Nível carga em: " + this.charge + "%");
        System.out.println("Está tampada? " + this.capped);
    }
    
    void rabiscar(){
        if (this.capped == true){
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("OK! Estou rabiscando.");
        }
    }
    
    void tampar(){
        this.capped = true;
    }
    
    void destampar(){
        this.capped = false;
    }
    
}
