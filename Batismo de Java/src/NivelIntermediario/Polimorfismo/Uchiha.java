package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja implements Sharingan{

    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    public Uchiha(int idade, String nome, int numerosdeMissoesConcluidas, Rank rank) {
        super(idade, nome, numerosdeMissoesConcluidas, rank);
    }

    @Override
    public void ativarJutsu() {
        System.out.println("Ativando Jutsu do tipo FOGO!");
    }

    @Override
    public void sharingan() {
        System.out.println("Sharingan ativado!");
    }
}
