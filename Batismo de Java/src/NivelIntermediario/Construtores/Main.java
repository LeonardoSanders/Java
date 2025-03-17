package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {
        Hokages Hashirama = new Hokages();

        Hokages Tobirama = new Hokages("Tobirama", 40, true);

        System.out.println(Tobirama.nome);
    }
}
