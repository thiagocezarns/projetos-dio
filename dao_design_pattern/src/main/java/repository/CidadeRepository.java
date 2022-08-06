package repository;

import modelo.Cidade;
import modelo.Cliente;

import javax.persistence.EntityManager;
import java.util.List;

public class CidadeRepository {

    private final EntityManager manager;
    private DAOGenerico<Cidade> daoGenerico;

    public CidadeRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico =  new DAOGenerico<>(manager);
    }


    public Cidade buscaPorId(Integer id) {
        return daoGenerico.buscaPorId(Cidade.class, id);
    }

    public List<Cidade> buscatodos() {
        return daoGenerico.buscaTodos(Cidade.class);
    }

    public Cidade salvaOuAtualiza(Cidade cidade) {
        return daoGenerico.salvaOuAtualiza(cidade);
    }

    public void remove(Cidade cidade) {
        daoGenerico.remove(cidade);
    }
}
