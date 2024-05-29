package Banco;

public abstract class Conta  implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected int agencia;
    protected double saldo = 0;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //Getters

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    // metodos

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public void tranferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getCpf()));
        System.out.println(String.format("CPF: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println();
    }

}
