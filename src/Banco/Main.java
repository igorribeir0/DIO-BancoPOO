package Banco;

public class Main {
    public static void main(String[] args) {

    Cliente Igor = new Cliente();
    Igor.setNome("Igor");
    Igor.setCpf("52843156868");

    Conta contaCC = new ContaCorrente(Igor);
    Conta contaPP = new ContaPoupanca(Igor);

    contaCC.imprimirExtrato();
    contaPP.imprimirEstrato();



    }
}
