package exercicioaula05;
public class ExercicioAula05 {
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(45356);
        p1.setDono("Diego");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(48359);
        p2.setDono("Roberta");
        p2.abrirConta("CP");
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p1.depositar(300);
        p2.depositar(500);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p2.sacar(100);
        p2.pagarMensal();
        
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();        
    }
    
}
