package exerciciofinal;
public class Gafanhoto extends Pessoa{
    
    // ATTRIBUTES
    private String login;
    private int totAssistido;
    
    // PUBLIC METHODS
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
    
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super (nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    // SPECIAL METHODS
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}

