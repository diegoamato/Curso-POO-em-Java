package exercicioaula04;
public class ExercicioAula04 {
        public static void main(String[] args) {
            Caneta c1 = new Caneta();
            c1.setModelo("BIC"); // USANDO MÉTODO ACESSOR
            //c1.modelo = "BIC"; USANDO DIRETAMENTE O ATRIBUTO
            c1.setPonta(0.5f);
            c1.status();
    }
    
}
