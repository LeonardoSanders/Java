package NivelIntermediario.Polimorfismo;

public class Ninja {
    //    TODO: Incluir 2 novos atributos - numerosdeMissoesConcluidas e Rank

    String nome;
    int idade;
    int numerosdeMissoesConcluidas;
    Rank rank;

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

//    TODO: Sobrecarga do construtor chamando os novos atributos
//    Na sobrecarga de metodos não precisa redeclarar todos os atributos, somente os novos
    public Ninja(int idade, String nome, int numerosdeMissoesConcluidas, Rank rank) {
        this(nome, idade);
        this.numerosdeMissoesConcluidas = numerosdeMissoesConcluidas;
        this.rank = rank;
    }

    public void Info(){
        System.out.println("Meu nome é: " + nome + "\nEu tenho: " + idade + " anos");
    }

    public void ativarJutsu() {
        System.out.println("Jutsu ativado!");
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome;
    }
}
