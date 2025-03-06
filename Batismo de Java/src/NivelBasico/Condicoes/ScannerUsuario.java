package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerUsuario {
    /*
    Scanner =  é um jeito de trazer o usuário para a aplicação
    Objetivo = O usuário vai criar um ninja e vamos validar os dados.
     */
    public static void main(String[] args) {

//        Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

//        Receber o nome do Ninja
        System.out.println("Informe o nome do ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

//      Receber idade do Ninja
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

//        Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println(nomeDoNinja + " é maior de idade e pode ir para missões fora da Aldeia!");
        } else {
            System.out.println(nomeDoNinja + " é menor de idade e NÃO pode ir para missões fora da Aldeia!");
        }

//        Fechar o Scanner
        caixaDeTexto.close();
    }
}
