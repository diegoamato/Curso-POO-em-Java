package exerciciofinal;
public class Visualizacao {
    
    // ATTRIBUTES
    private Gafanhoto espectador;
    private Vídeo filme;

    // PUBLIC METHODS
    public Visualizacao(Gafanhoto espectador, Vídeo filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float perc){
        int tot = 0;
        if (perc <= 20){
            tot = 3;
        } else if (perc <= 50){
            tot = 5;
        } else if (perc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    // SPECIAL METHODS
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Vídeo getFilme() {
        return filme;
    }

    public void setFilme(Vídeo filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
