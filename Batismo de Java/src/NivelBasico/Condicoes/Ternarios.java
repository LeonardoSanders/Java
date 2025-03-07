package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        Ternarios: Maneiras de reduzir o codigo
        variável = (condição) ? valorSeVerdadeiro : valorSeFalso;
         */

        short num_missions = 11;
        String level = (num_missions >= 10) ? "Shounin" : "Genin";
        System.out.println("Rank: " + level);
    }
}
