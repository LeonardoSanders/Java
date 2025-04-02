package NivelIntermediario.List.Aula02_Generics.Treino;

public class Produtos {

    private String nome;

    public Produtos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
