package NivelIntermediario.List.Aula03_Records;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja("Naruto Uzumaki", "naruto@gmail.com", 82329590);
        System.out.println(naruto);

        NinjaRecords sasuke = new NinjaRecords("Sasuke Uchiha", "sasuke@gmail.com", 92193805);
        System.out.println(sasuke);
    }
}
