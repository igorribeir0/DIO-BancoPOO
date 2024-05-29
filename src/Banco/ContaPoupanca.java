package Banco;

public class ContaPoupanca extends Conta{
    @Override
    public void imprimirEstrato() {
        System.out.println("Estrato Conta Poupanca: ");
        super.imprimirExtrato();
    }
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
}
