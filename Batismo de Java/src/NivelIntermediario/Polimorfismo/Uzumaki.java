package NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja {
    public Uzumaki(String nome, int idade) {
        super(nome, idade);
    }

    public Uzumaki(int idade, String nome, int numerosdeMissoesConcluidas, Rank rank) {
        super(idade, nome, numerosdeMissoesConcluidas, rank);
    }

    @Override
    public void ativarJutsu() {
        System.out.println("Ativando Jutsu do tipo AR!");
    }
}
