package exercicioaula02;
public class Caneta {
    public String model;
    public String color;
    private float tip; // ponta
    protected int charge; // carga
    private boolean capped; //tampada
    public void status(){
        System.out.println("Modelo: " + this.model);
        System.out.println("Uma caneta " + this.color);
        System.out.println("Ponta: " + this.tip);
        System.out.println("Nível carga em: " + this.charge + "%");
        System.out.println("Está tampada? " + this.capped);
    }
    
    public void rabiscar(){
        if (this.capped == true){
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("OK! Estou rabiscando.");
        }
    }
    
    public void tampar(){
        this.capped = true;
    }
    
    public void destampar(){
        this.capped = false;
    }
    
}
