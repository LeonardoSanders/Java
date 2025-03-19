package NivelIntermediario.ClasseAbstrata;

public abstract class Ninja {
    String nome;
    int idade;
    String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
    }
}
