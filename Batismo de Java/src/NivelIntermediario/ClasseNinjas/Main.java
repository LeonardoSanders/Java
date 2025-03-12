package NivelIntermediario.ClasseNinjas;

public class Main {
    public static void main(String[] args) {

//        Criar o Ninja Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Vila da Folha";

        Naruto.infoNinja();
        Naruto.modoSabio();
        System.out.println("-------------------------------");

//        Criar Ninja Sasuke Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        Sasuke.infoNinja();
        Sasuke.SharinganAtivado();
        System.out.println("-------------------------------");

//        Criar Nina Hinara Hyuga
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 17;
        Hinata.aldeia = "Aldeia da Folha";

        Hinata.infoNinja();
        Hinata.byakuganAtivado();
    }

}
