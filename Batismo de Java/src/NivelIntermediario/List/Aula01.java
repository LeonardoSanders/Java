package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Aula01 {
    public static void main(String[] args) {

//        Array -> São estaticos
        String[] ninjasArray = new String[2];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        System.out.println(ninjasArray[0] + ", " + ninjasArray[1]);

//        Listas -> São dinamicas
        List <String> ninjasList = new ArrayList<>();

//        Adicionar na Lista
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        System.out.println(ninjasList);

//        Remover da Lista
        ninjasList.remove("Tobirama Senju");
        System.out.println(ninjasList);

//        Trocar de posição
        ninjasList.set(1, "Itachi Uchiha");
        System.out.println(ninjasList);
    }

}
