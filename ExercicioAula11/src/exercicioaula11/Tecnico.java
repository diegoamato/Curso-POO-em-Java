package exercicioaula11;
public final class Tecnico extends Aluno{
    
    // ATTRIBUTES
    private String registroProfissional;
    
    // PUBLIC METHODS
    public void praticar(){
        System.out.println("Aluno está praticando!");
    }
    
    // SPECIAL METHODS
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
