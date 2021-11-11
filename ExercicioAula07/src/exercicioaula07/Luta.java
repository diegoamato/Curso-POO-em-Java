package exercicioaula07;

import java.util.Random;

public class Luta {
    
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //MÉTODOS PÚBLICOS
    public void marcarLuta(Lutador L1, Lutador L2){
        if ((L1.getCategoria().equals(L2.getCategoria())) && L1 != L2){
            this.aprovada = true;
            this.desafiado = L1;
            this.desafiante = L2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println(" ");
            System.out.println(" ##### DESAFIADO ##### ");
            this.desafiado.apresentar();
            System.out.println(" ");
            System.out.println(" ##### DESAFIANTE ##### ");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2 
            switch (vencedor){
                case 0: // EMPATOU
                    System.out.println(" ");
                    System.out.println(" ======= RESULTADO ======= ");
                    System.out.println("   EMPATOU!!!");
                    System.out.println(" ========================= ");
                    System.out.println(" ");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // DESAFIADO VENCE
                    System.out.println(" ");
                    System.out.println(" ======= RESULTADO ======= ");
                    System.out.println("   O desafiado " + this.desafiado.getNome() + " VENCEU A LUTA!!");
                    System.out.println(" ========================= ");
                    System.out.println(" ");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // DESAFIANTE VENCE
                    System.out.println(" ");
                    System.out.println(" ======= RESULTADO ======= ");
                    System.out.println("   O desafiante " + this.desafiante.getNome() + " VENCEU A LUTA!!");
                    System.out.println(" ========================= ");
                    System.out.println(" ");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;                    
                }
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    // MÉTODOS ESPECIAIS
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
