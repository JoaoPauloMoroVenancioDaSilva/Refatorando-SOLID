package LSOLID.Exemplo2;

public class ContaCorrente implements IContaSaque {
    private double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
