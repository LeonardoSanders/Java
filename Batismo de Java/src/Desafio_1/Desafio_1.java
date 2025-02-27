package Desafio_1;

public class Desafio_1 {
    public static void main(String[] args) {
//        Ninja 1
        String ninja1_nome = "Sasuke Uchira";
        int ninja1_idade = 15;
        String ninja1_missao = "Proteger viajantes";
        char ninja1_dif_missao = 'C';
        String ninja1_stats_missao = "Não concluída";

        System.out.println("Ninja: " + ninja1_nome);
        System.out.println("Idade: " + ninja1_idade);
        System.out.println("Missão: " + ninja1_missao);
        System.out.println("Dificuldade: " + ninja1_dif_missao);

        if (ninja1_idade >= 15 && (ninja1_dif_missao == 'C' || ninja1_dif_missao == 'D')) {
            ninja1_stats_missao = "Concluída";
        }

        System.out.println("Missão " + ninja1_stats_missao);


//        Ninja 2
        String ninja2_nome = "Shikamaru Nara";
        int ninja2_idade = 14;
        String ninja2_missao = "Proteger comerciantes";
        char ninja2_dif_missao = 'D';
        String ninja2_stats_missao;

        System.out.println("Ninja: " + ninja2_nome);
        System.out.println("Idade: " + ninja2_idade);
        System.out.println("Missão: " + ninja2_missao);
        System.out.println("Dificuldade: " + ninja2_dif_missao);

        if (ninja2_idade >= 15 && (ninja2_dif_missao == 'C' || ninja2_dif_missao == 'D')) {
            ninja2_stats_missao = "Concluída";
            System.out.println("Missão " + ninja2_stats_missao);
        } else {
            ninja2_stats_missao = "Não concluída";
            System.out.println("Missão " + ninja2_stats_missao);
        }

//        Ninja 3
        String ninja3_nome = "Rock Lee";
        int ninja3_idade = 15;
        String ninja3_missao = "Proteger crianças";
        char ninja3_dif_missao = 'C';
        String ninja3_stats_missao = "Não concluída";

        System.out.println("Ninja: " + ninja3_nome);
        System.out.println("Idade: " + ninja3_idade);
        System.out.println("Missão: " + ninja3_missao);
        System.out.println("Dificuldade: " + ninja3_dif_missao);

        if (ninja3_idade >= 15 && (ninja3_dif_missao == 'C' || ninja3_dif_missao == 'D')) {
            ninja3_stats_missao = "Concluída";
        }

        System.out.println("Missão " + ninja3_stats_missao);
    }
}
