package NivelIntermediario.ClasseNinjas;

public class Main {
    public static void main(String[] args) {

//        Criar o Ninja Naruto
        String nome = "Naruto Uzumaki";
        int idade = 18;
        String aldeia = "Aldeia da Folha";


//        Criar Ninja Sasuke Uchiha
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;

        sasuke.infoNinja();
        sasuke.SharinganAtivado();
        System.out.println(sasuke.EusouNinja());

        System.out.println("Anos que faltam para se tornar Hokage: " + sasuke.anosParaSeTornarHokage(50));
    }

}
