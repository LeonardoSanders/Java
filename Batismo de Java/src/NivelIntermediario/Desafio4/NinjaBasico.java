package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    String habilidade;
    int idade;

    public NinjaBasico(String habilidade, int idade, String nome) {
        this.habilidade = habilidade;
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nidade: " + idade + "\nhabilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(habilidade + " ativado!");
    }
}
