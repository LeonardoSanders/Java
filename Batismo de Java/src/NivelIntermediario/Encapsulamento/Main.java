package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Aldeia da folha", 1.70, 17, "Naruto Uzumaki", 20);
        System.out.println(naruto.getNome());
        naruto.setAltura(1.72);
        System.out.println(naruto.getAltura());

        Uchiha sasuke = new Uchiha("Aldeia da folha", 1.71, 18, "Sasuke Uchiha", 25);
    }
}
