package NivelIntermediario.ENUMS;

public class Ninja {
    private String missao;
    private RankMissoes rank;

    public void exibirDetalhes() {

        System.out.println("Missão: " + missao + "\nRank da Missão: " + rank + " (Dificuldade: " + rank.getDificuldade() + " - Nível: " + rank.getNivel() + ")");
    }

    public Ninja(String nome, RankMissoes rank) {
        this.missao = nome;
        this.rank = rank;
    }

    public String getNome() {
        return missao;
    }

    public void setNome(String nome) {
        this.missao = nome;
    }

    public RankMissoes getRank() {
        return rank;
    }

    public void setRank(RankMissoes rank) {
        this.rank = rank;
    }
}

