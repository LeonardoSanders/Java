package NivelIntermediario.Desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.missao = "Matar bandidos";
        Sasuke.nivelDificuldade = "Difícil";
        Sasuke.statusMissao = "Em progresso";
        Sasuke.habilidadeEspecial = "Sharingan";

        Scanner scanner =new Scanner(System.in);
        int opc = 0;
//        String nomeNinja;

        ArrayList ninjas = new ArrayList();
        ninjas.add(Sasuke);

        while (opc != 3) {
            System.out.println("Bem vindo ao Cadastro de Ninjas!");
            System.out.println("1 - Cadastrar Ninjas");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma das opções acima: ");
            opc = scanner.nextInt();
            scanner.nextLine();


            switch (opc) {
                case 1:
//                    nomeNinja = scanner.nextLine();
                    Ninja nomeNinja = new Ninja();
                    nomeNinja.nome = scanner.nextLine();
                    nomeNinja.idade = scanner.nextInt();
                    ninjas.add(nomeNinja);
                case 2:
                    for (int i = 0; i < ninjas.toArray().length; i++) {
                        System.out.println(ninjas.get(i));
                    }
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida, tente novamente!");
                    break;
            }
        }

        scanner.close();
    }
}
