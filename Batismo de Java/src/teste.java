import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lista_ninjas = new ArrayList<>();

        System.out.println("Digite o nome do Ninja a ser Cadastrado: ");
        String nome = scanner.nextLine();
        lista_ninjas.add(nome);

        System.out.println("Listando Ninjas Cadastrado");
        for (String listaNinja : lista_ninjas) {
            System.out.println(listaNinja);
        }

        scanner.close();
    }
}
