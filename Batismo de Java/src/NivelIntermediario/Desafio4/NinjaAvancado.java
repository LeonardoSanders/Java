package NivelIntermediario.Desafio4;

public class NinjaAvancado implements Ninja{
    String nome;
    TipoHabilidade habilidade;
    int idade;
    String especialidade;

    public NinjaAvancado(String especialidade, TipoHabilidade habilidade, int idade, String nome) {
        this.especialidade = especialidade;
        this.habilidade = habilidade;
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nidade: " + idade + "\nhabilidade: " + habilidade + "\nEspecialidade: "
        + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(habilidade + " ativado!");
    }
}
