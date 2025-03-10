package NivelBasico.Desafio_2;

import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num_Max = 10;
        int ninjas_cadastrados = 0;
        short opc;
        String[] lista_ninjas = new String[Num_Max];

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opc = scanner.nextShort();
            System.out.println("Você escolheu a opção " + opc);
            scanner.nextLine();

            switch (opc) {
                case 1:
                    if (ninjas_cadastrados < Num_Max) {
                        System.out.println("Digite o nome do Ninja a ser Cadastrado:");
                        String nome = scanner.nextLine();
                        lista_ninjas[ninjas_cadastrados] = nome;
                        ninjas_cadastrados ++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("A Lista de Ninjas está cheia!");
                    }
                    break;

                case 2:
                    if (ninjas_cadastrados == 0) {
                        System.out.println("Nenhum ninja foi cadastrado ainda!");
                    } else {
                        System.out.println("------Listando Ninjas Cadastrado------");
                        for (int i = 0; i < lista_ninjas.length; i++) {
                            if (lista_ninjas[i] != null) {
                                System.out.println((i+1) + "- " + lista_ninjas[i]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Qual ninja você quer remover?");
                    int index_ninja = scanner.nextInt();
                    lista_ninjas[index_ninja] = null;
                    System.out.println("Ninja removido com sucesso!");
                    break;
                case 4:
                    System.out.println("Saindo do Sistema de Cadastro de Ninjas...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
                }
            } while (opc != 4) ;

            scanner.close();
        }
    }