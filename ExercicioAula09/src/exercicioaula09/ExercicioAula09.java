package exercicioaula09;
public class ExercicioAula09 {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro Martins", 4, "M");
        p[1] = new Pessoa("Roberta Rafaeli", 34, "F");
        
        l[0] = new Livro("O Pequeno Príncipe", "Saint-Exupéry", 105, p[0]);
        l[1] = new Livro("Quando Nietzche Chorou", "Irvin D. Yalom", 384, p[1]);
        l[2] = new Livro("Midset", "Carol Dweck", 382, p[1]);
        
        l[0].abrir();
        l[0].folhear(91);
        l[0].detalhes();
        l[1].detalhes();
        
        
    }
    
}
