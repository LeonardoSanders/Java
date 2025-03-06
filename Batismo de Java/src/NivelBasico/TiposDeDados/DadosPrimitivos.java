package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        int: Números inteiros.
        float: Números de ponto flutuante de precisão simples.
        double: Números de ponto flutuante de precisão dupla.
        char: Um único caractere.
        boolean: Valores verdadeiros ou falsos.
        byte: Números inteiros pequenos.
        short: Números inteiros menores que um int.
        Long: Números inteiros maiores que um int.
        *
        Objetivo da aula: criar um ninja!
         */

        int idade = 16; // Valor maximo: 2 147 483 647
        double altura = 1.65;
        char inicial = 'N';
        boolean ninja = true;
        Long saldoBancario = 99999L;

        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println("saldoBancario = " + saldoBancario);

    }
}
