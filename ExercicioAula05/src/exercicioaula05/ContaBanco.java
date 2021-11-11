package exercicioaula05;

public class ContaBanco {

    // ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // MÉTODOS PERSONALIZADOS
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + getTipo() + " " + getNumConta());
        System.out.println("Titular: " + getDono());
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Aberta? " + getStatus());
    }
    
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            setSaldo(50);
        } else {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso. Seu saldo é R$" + getSaldo());
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com Dinheiro.");
        } else if (getSaldo() < 0) {
            System.out.println("Conta com Débito.");
        } else {
            setStatus(false);
            System.out.println("Conta fechada co sucesso.");
        }
    }

    public void depositar(float v) {
        if (getStatus() == true) {
            setSaldo(getSaldo() + v);
            System.out.println("Depósito de R$" + v + " realizado com sucesso na conta de " + getDono());
        } else {
            System.out.println("Conta Fechada ou Inexistente");
        }
    }

    public void sacar(float v) {
        if (getStatus() == true) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("Saque de R$" + v + " realizado com sucesso na conta de " + getDono());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta Fechada ou Inexistente");
        }
    }

    public void pagarMensal() {
        int mensal = 0;
        if (getTipo() == "CC"){
            mensal = 12;
        } else if (getTipo() == "CP"){
            mensal = 20;
        }
        if (getStatus() == true){
            if (getSaldo() > mensal) {
                setSaldo(getSaldo() - mensal);
                System.out.println("Mensalidade de R$" + mensal + " paga com sucesso");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta Fechada ou Inexistente");
        }
    }

    //MÉTODOS ESPECIAIS
    
    // MÉTODO CONSTRUTOR
    public void ContaBanco(){ 
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    // MÉTODOS ESPECIAIS: ACESSORES E MODIFICADOTES (GETTERS AND SETTERS)
    
    // GET AND SET numConta
    public void setNumConta (int n){
        this.numConta = n;
    }
    public int getNumConta() {
        return this.numConta;
    }
    
    // GET AND SET tipoConta
    public void setTipo (String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    
    // GET AND SET dono
    public void setDono (String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    
    // GET AND SET saldo
    public void setSaldo (float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    
    // GET AND SET status
    public void setStatus (boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return status;
    }
}
