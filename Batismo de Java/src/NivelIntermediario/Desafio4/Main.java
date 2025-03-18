package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Naruto = new NinjaBasico(TipoHabilidade.NINJUTSU, 15, "Naruto Uzumaki");
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();

        System.out.println("------------------------------------------");

        NinjaAvancado Madara = new NinjaAvancado("Suzano", TipoHabilidade.GENJUTSU, 50, "Madara Uchira");
        Madara.mostrarInformacoes();
        Madara.executarHabilidade();
    }
}
