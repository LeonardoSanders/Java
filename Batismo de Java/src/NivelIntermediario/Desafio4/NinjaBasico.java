package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    TipoHabilidade habilidade;
    int idade;

    public NinjaBasico(TipoHabilidade habilidade, int idade, String nome) {
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
