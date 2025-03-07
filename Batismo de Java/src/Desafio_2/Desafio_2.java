package Desafio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lista_ninjas = new ArrayList<>();
        short opc;

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opc = scanner.nextShort();
            System.out.println("Você escolheu a opção " + opc);

            switch (opc) {
                case 1:
                    System.out.println("Digite o nome do Ninja a ser Cadastrado: ");
                    String nome = scanner.next();
                    System.out.println(nome);
                    lista_ninjas.add(nome);
                    break;
                case 2:
                    System.out.println("Listando Ninjas Cadastrado");
                    for (String listaNinja : lista_ninjas) {
                        System.out.println(listaNinja);
                    }
                    break;
                case 3:
                    System.out.println("Saindo do Sistema de Cadastro de Ninjas...");
                    break;

                }
            } while (opc != 3) ;

            scanner.close();
        }
    }