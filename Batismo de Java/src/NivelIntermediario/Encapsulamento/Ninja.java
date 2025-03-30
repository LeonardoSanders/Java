package NivelIntermediario.Encapsulamento;

public class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numDeMissoesconcluidas;
    private double altura;

    public Ninja(String aldeia, double altura, int idade, String nome, int numDeMissoesconcluidas) {
        this.aldeia = aldeia;
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.numDeMissoesconcluidas = numDeMissoesconcluidas;
    }

    //      GETTERS
    public String getAldeia() {
        return aldeia;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getNumDeMissoesconcluidas() {
        return numDeMissoesconcluidas;
    }

//    SETTERS

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumDeMissoesconcluidas(int numDeMissoesconcluidas) {
        this.numDeMissoesconcluidas = numDeMissoesconcluidas;
    }
}
