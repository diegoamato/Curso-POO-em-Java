package exercicioaula09;
public class Livro implements Publicacao{
    
    // ATRIBUTOS
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // MÉTODOS PÚBLICOS
    
    public void detalhes(){
        //@Override
        //public String toString() {
        //return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", 
        //       totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + ", 
        //       aberto=" + aberto + ", leitor=" + leitor + '}';
        //}
        System.out.println(" ");
        System.out.println("======== DETALHAMENTO ========");
        System.out.println("Livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Leitura: pág. " + this.getPagAtual() + " de " + this.getTotPaginas());
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("Lendo? " + this.getAberto());
        System.out.println("==============================");       
        System.out.println(" ");
    }

    // MÉTODOS ESPECIAIS

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (this.totPaginas >= p){
        this.setPagAtual(p);
        } else {
            System.out.println("Página não encontrada.");
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() -1);
    }
    
}