package NivelIntermediario.ClasseAbstrata;

public abstract class Hokage {
    String nome;
    int idade;
    boolean vivoOumorto;

    public Hokage(String nome, int idade, boolean vivoOumorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOumorto = vivoOumorto;
    }

    public void informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Vivo: " + vivoOumorto);
    }

    public abstract void sabedoria();
}
