package NivelBasico.Condicoes;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        /*
        Laços de repetição: Vão repetir infinitamente ou até atingir o parâmetro desejado
        While / For
         */

        short cont = 1;

//        WHILE
        while (cont <= 10) {
            System.out.println(cont);
            cont ++;
        }
        System.out.println("---------------------------------------");
//        FOR
        for (short i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------------------------");
        int ver = 1;
        do {
            System.out.println(ver);
            ver ++;
        } while (ver <= 10);
    }
}
