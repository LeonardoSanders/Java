package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta{

    String titular;
    double saldo;
    TipoConta tipoconta;

    public ContaBancaria(String titular, TipoConta tipoconta, double saldo) {
        this.titular = titular;
        this.tipoconta = tipoconta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nSaldo: R$ " + saldo + "\nTipo de Conta: " + tipoconta;
    }
}
