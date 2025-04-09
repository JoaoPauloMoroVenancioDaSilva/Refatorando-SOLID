package LSOLID.Exemplo2;

public class Main {
    public static void main(String[] args) {
        IContaSaque contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100);
        contaCorrente.sacar(50);
        System.out.println("Seu saldo conta corrente é: " + contaCorrente.getSaldo());

        IConta contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(5000);
        System.out.println("Seu saldo conta poupança é: " + contaPoupanca.getSaldo());
    }
}
