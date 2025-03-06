package NivelBasico.Condicoes;

public class If_Else {
    public static void main(String[] args) {
        /*
        If e Else - Condições
        Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
         */
//        Ninja Naruto
        String nome = "Naruto Uzumaki";
        int idade = 10;
        boolean hokage = false;
        short numero_missoes = 11;
        String rank;

        if (numero_missoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numero_missoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
