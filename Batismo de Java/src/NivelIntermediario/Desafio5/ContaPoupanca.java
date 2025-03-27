package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, TipoConta tipoconta, double saldo) {
        super(titular, tipoconta, saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Você depositou: R$ " + valor);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é: R$ " + saldo);
    }
}
