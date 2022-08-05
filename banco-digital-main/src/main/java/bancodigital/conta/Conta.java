package bancodigital.conta;

import bancodigital.cliente.Cliente;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    private void setSaldo(double valor) {
        this.saldo = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        setSaldo(getSaldo()-valor);
    }
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
    }
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoExtrato() {
        System.out.printf("Agência: %d%n", agencia);
        System.out.printf("Numero Conta: %d%n", numero);
        System.out.printf("Titular: %s%n", cliente.getNome());
        System.out.printf("Saldo: %.2f%n", saldo);
    }
}
