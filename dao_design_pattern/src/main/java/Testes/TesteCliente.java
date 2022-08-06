package Testes;

import modelo.Cliente;
import servico.CadastraCliente;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Thigas");
        cliente.setEndereco("Rua principal, 15");
        cliente.setTelefone("555448876");

        CadastraCliente cadastraCliente = new CadastraCliente();
        cadastraCliente.salvar(cliente);
    }
}
