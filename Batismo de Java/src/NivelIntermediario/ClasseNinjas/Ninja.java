package NivelIntermediario.ClasseNinjas;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public void infoNinja () {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
    }

    public  void SharinganAtivado() {
        System.out.println("O Sharingan está ativado!");
    }

    public String EusouNinja() {
        return "Oi, eu sou um Ninja!";
    }

    public int anosParaSeTornarHokage(int idadeMinimaPraHokage) {
        return idadeMinimaPraHokage - idade;
    }
}
