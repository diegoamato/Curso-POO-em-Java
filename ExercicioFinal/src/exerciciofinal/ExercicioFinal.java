package exerciciofinal;
public class ExercicioFinal {
    public static void main(String[] args) {
        final int i = 1;
        System.out.println(i++);
        Vídeo v[] = new Vídeo[3];
        v[0] = new Vídeo("Duna");
        v[1] = new Vídeo("Matrix");
        v[2] = new Vídeo("O Rei Leão");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto ("Diego", 36, "M", "B35024");
        g[1] = new Gafanhoto ("Pedro", 4, "M", "BB2401");
        
        Visualizacao vis = new Visualizacao(g[0], v[1]);
        System.out.println(vis.toString());
        
        System.out.println("===== VÍDEOS =====");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(" ");
        System.out.println("===== PESSOA =====");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
    
}
