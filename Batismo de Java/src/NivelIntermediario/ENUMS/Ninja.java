package NivelIntermediario.ENUMS;

public class Ninja {
    private String nome;
    private RankMissoes rank;

    public void exibirDetalhes() {
        System.out.println("Ninja: " + nome + "\nRank da Missão: " + rank);
    }

    public Ninja(String nome, RankMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankMissoes getRank() {
        return rank;
    }

    public void setRank(RankMissoes rank) {
        this.rank = rank;
    }
}
