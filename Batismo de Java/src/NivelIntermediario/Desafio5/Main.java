package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca naruto = new ContaPoupanca("Naruto Uzumaki", TipoConta.POUPANÇA, 5000);
        ContaCorrente sasuke = new ContaCorrente("Sasuke Uchiha", TipoConta.CORRENTE, 10000);

        System.out.println(naruto);
        naruto.depositar(100);
        naruto.consultarSaldo();
        System.out.println("--------------------------------");

        System.out.println(sasuke);
        sasuke.depositar(1000);
        sasuke.consultarSaldo();
    }
}
