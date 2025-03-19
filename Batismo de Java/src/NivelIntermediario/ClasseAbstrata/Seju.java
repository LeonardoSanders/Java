package NivelIntermediario.ClasseAbstrata;

public class Seju extends Hokage{

    public Seju(String nome, int idade, boolean vivoOumorto) {
        super(nome, idade, vivoOumorto);
    }

    @Override
    public void sabedoria() {
        System.out.println("Você ganhou sabedoria!");
    }
}
