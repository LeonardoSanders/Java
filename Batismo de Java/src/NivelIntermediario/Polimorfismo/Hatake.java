package NivelIntermediario.Polimorfismo;

public class Hatake extends Ninja implements Sharingan, Ambu{

    public Hatake(String nome, int idade) {
        super(nome, idade);
    }

    public Hatake(int idade, String nome, int numerosdeMissoesConcluidas, Rank rank) {
        super(idade, nome, numerosdeMissoesConcluidas, rank);
    }

    public void boasVindas() {
        System.out.println("Olá, eu sou um Hatake!");
    }

    @Override
    public void sharingan() {
        System.out.println("Sharingan ativado!");
    }

    @Override
    public void ninjasDeElite() {
        System.out.println("Eu sou um Ninja de Elite Ambu!");
    }
}
