package Testes;

import modelo.Cidade;
import modelo.Cliente;
import modelo.Frete;
import servico.CadastraCidade;
import servico.CadastraCliente;
import servico.CadastraFrete;

public class TesteFrete {

    public static void main(String[] args) {

        Cidade cidade = new Cidade();
        cidade.setNome("São Luís");
        cidade.setUF("MA");
        cidade.setTaxa(79.99f);
        CadastraCidade cadastraCidade = new CadastraCidade();
        cadastraCidade.salvar(cidade);

        Cliente cliente = new Cliente();
        cliente.setNome("Thiago");
        cliente.setEndereco("Rua Bayma Junior, 13");
        cliente.setTelefone("22336644");
        CadastraCliente cc = new CadastraCliente();
        cc.salvar(cliente);


        Frete frete = new Frete();
        frete.setCliente(cliente);
        frete.setCidade(cidade);
        frete.setDescricao("Frete para São Luis");
        frete.setValor(90f);
        frete.setPeso(5.5f);
        CadastraFrete cf = new CadastraFrete();
        cf.salvar(frete);



    }
}
