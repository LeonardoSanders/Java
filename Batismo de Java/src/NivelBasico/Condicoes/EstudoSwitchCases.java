package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        SwitchCases: Servem para gerar casos específicos.
        Objetivo: Dar a opção do usuário escolher o personagem.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o personagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        int num_personagem = scanner.nextInt();
        String ninja;

        switch (num_personagem) {
            case 1:
                ninja = "Naruto Uzumaki";
                System.out.println("Você escolheu " + ninja);
                break;
            case 2:
                ninja = "Sasuke Uchiha";
                System.out.println("Você escolheu " + ninja);
                break;
            case 3:
                ninja = "Sakura Haruno";
                System.out.println("Você escolheu " + ninja);
                break;
            default:
                System.out.println("Você não digitou uma resposta válida. Tente novamente!");
        }

        scanner.close();
    }
}
