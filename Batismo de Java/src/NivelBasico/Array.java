package NivelBasico;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//      Tipo de dado do Array / definição do Array / Nome do Array / Definição do tamanho da memoria do Array
        String[] ninjas = new String[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o nome do " + (i+1) + "° Ninja: ");
            String nome = scanner.nextLine();
            ninjas[i] = nome;
        }

        System.out.println(Arrays.stream(ninjas).toList());

        scanner.close();
    }
}
