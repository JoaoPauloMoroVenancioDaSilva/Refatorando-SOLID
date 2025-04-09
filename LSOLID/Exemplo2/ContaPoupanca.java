package LSOLID.Exemplo2;

public class ContaPoupanca implements IConta {
    private double saldo;
 // Tirei o método sacar() para seguir o L-SOLID
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
   
}
