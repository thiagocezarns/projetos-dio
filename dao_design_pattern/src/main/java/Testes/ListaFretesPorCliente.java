package Testes;

import modelo.Frete;
import servico.ObtemFretesPorCliente;

import java.util.List;

public class ListaFretesPorCliente {


    public static void main(String[] args) {

        ObtemFretesPorCliente fc = new ObtemFretesPorCliente();
        List<Frete> fretes = fc.buscarFretes(1);

            for (Frete f : fretes) {
                System.out.println("Frete {");
                System.out.println("Codigo do frete: " + f.getCodigo());
                System.out.println("Descrição: " + f.getDescricao());
                System.out.println("Valor: " + f.getValor());
                System.out.println("Peso: " + f.getPeso());
                System.out.println("Nome do Cliente: " + f.getCliente().getNome());
                System.out.println("Cidade de destino: " + f.getCidade().getNome());
                System.out.println("}");
            }
    }
}
