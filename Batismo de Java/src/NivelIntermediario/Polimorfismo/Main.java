package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 18;

        System.out.println("Ninja: " + Naruto.nome + "\nIdade: " + Naruto.idade);
        Naruto.ativarJutsu();
        System.out.println("------------------------------");

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 18;

        System.out.println("Ninja: " + Sasuke.nome + "\nIdade: " + Sasuke.idade);
        Sasuke.ativarJutsu();
    }
}
