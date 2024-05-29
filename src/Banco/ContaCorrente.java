package Banco;

public class ContaCorrente extends Conta{
    @Override
    public void imprimirEstrato() {
        System.out.println("Estrato Conta Corrente: ");
        super.imprimirExtrato();
    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
}
