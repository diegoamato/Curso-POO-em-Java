package exercicioaula11;
public final class Bolsista extends Aluno{
    
    // ATTRIBUTES
    private float bolsa;
    
    // PUBLIC METHODS
    public void renovarBolsa(){
        System.out.println("Bolsa Renovada com Sucesso!");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade Bolsista paga com Sucesso!");
    }
    
    // SPECIAL METHODS
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
