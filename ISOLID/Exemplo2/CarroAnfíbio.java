package ISOLID.Exemplo2;

public class CarroAnfíbio implements Veiculo, VeiculoNavegador {
    @Override
    public void dirigir() {
        System.out.println("O carro anfíbio está dirigindo na terra.");
    }

    @Override
    public void navegar() {
        System.out.println("O carro anfíbio está navegando no mar.");
    }

}
