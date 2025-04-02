package NivelIntermediario.List.Aula01_Lists;

import java.util.ArrayList;
import java.util.List;

public class Treino_List {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Leo");
        ninjas.add("Junior");
        ninjas.add("Carlos");

//        Uma das formas de printar uma lista de forma Iteravel é usando o seguinte comando:
        ninjas.forEach(System.out::println);

//        Também é possível faer o print de uma lista utilizando um For loop padrão
        for (String ninja : ninjas) {
            System.out.println(ninja);
        }
    }
}