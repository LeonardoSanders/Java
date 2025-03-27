package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, TipoConta tipoconta, double saldo) {
        super(titular, tipoconta, saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor - (valor * 0.01));
        System.out.println("Você depositou: R$ " + valor);
        System.out.println("Taxa de deposito: R$ " + (valor * 0.01));
        System.out.println("Valor efetivo do deposito: R$ " + (valor - (valor*0.01)));
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é: R$ " + saldo);
    }
}
