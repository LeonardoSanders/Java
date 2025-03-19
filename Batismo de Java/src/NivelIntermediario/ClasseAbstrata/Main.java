package NivelIntermediario.ClasseAbstrata;

public class Main {
    public static void main(String[] args) {
        Seju Hashirama = new Seju("Hashirama", 35, false);
        Hashirama.informacoes();
        Hashirama.sabedoria();

        Uchiha Itachi = new Uchiha("Itachi Uchiha", 25, "Akatsuki");
        Itachi.mostrarInfo();
    }
}
