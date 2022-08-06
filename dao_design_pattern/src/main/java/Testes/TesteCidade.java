package Testes;

import modelo.Cidade;
import servico.CadastraCidade;

public class TesteCidade {

    public static void main(String[] args) {

        Cidade cidade = new Cidade();
        cidade.setNome("Fortaleza");
        cidade.setUF("CE");
        cidade.setTaxa(55.90f);

        CadastraCidade cadastraCidade = new CadastraCidade();
        cadastraCidade.salvar(cidade);
    }
}
