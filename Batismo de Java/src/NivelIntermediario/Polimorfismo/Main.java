package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki("Naruto", 18);

        Naruto.Info();
        Naruto.ativarJutsu();
        System.out.println("------------------------------");

        Uchiha Sasuke = new Uchiha("Sasuke", 18);

        Sasuke.Info();
        Sasuke.ativarJutsu();
        Sasuke.sharingan();
        System.out.println("------------------------------");

        Hatake Kakashi = new Hatake("Kakashi", 35);
        Kakashi.Info();
        Kakashi.boasVindas();
        Kakashi.sharingan();
        Kakashi.ninjasDeElite();
        System.out.println("------------------------------");

        Uchiha madara = new Uchiha(35, "Madara", 10, Rank.JOUNNIN);
    }
}
