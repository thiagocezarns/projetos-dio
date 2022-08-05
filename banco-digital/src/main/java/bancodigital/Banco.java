package bancodigital;

import bancodigital.cliente.Cliente;
import bancodigital.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Cliente> getClientes() {
        List<Cliente> clientes = new ArrayList<>();
        List<Conta> contas = getContas();
        for (Conta c : contas) {
            clientes.add(c.getCliente());
        }
        return clientes;
    }

    public Conta getConta(Cliente cliente) {
        List<Conta> contas = getContas();
        for (Conta conta : contas) {
            if(cliente.equals(conta.getCliente()))
                return conta;
        }
        return null;
    }
}
