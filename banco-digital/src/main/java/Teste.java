import bancodigital.*;
import bancodigital.cliente.Cliente;
import bancodigital.cliente.EnderecoCliente;
import bancodigital.conta.Conta;
import bancodigital.conta.ContaCorrente;
import bancodigital.conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("MeuBanco");

        List<Conta> contas = new ArrayList<>();

        Conta minhaContaPoupanca;
        Conta minhaContaCorrente;

        EnderecoCliente endThiago = new EnderecoCliente(
                "12345612",
                "rua thiago",
                "01",
                "asdf",
                "bairro thiago",
                "cidade thiago",
                "estado thiago"
        );
        Cliente thiago = new Cliente("Thiago Cezar", "12345678901",
                            "01/02/2000", "0987654321", endThiago);

        minhaContaPoupanca = new ContaPoupanca(thiago);

        minhaContaPoupanca.depositar(200);

        EnderecoCliente endCezar = new EnderecoCliente(
                "456123789",
                "rua cezar",
                "32",
                "fdsa",
                "bairro cezar",
                "cidade cezar",
                "estado cezar"
        );
        Cliente cezar = new Cliente("Cezar Thiago", "98765432110",
                "11/01/1999", "123987456", endCezar);

        minhaContaCorrente = new ContaCorrente(cezar);

        minhaContaPoupanca.transferir(55.75, minhaContaCorrente);


        System.out.println("Saldo de "+ thiago.getNome() +" é: "+minhaContaPoupanca.getSaldo());
        System.out.println("Saldo de "+ cezar.getNome() +" é: "+minhaContaCorrente.getSaldo());


    }
}
