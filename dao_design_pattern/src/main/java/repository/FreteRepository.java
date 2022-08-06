package repository;

import modelo.Cidade;
import modelo.Frete;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class FreteRepository {

    private final EntityManager manager;
    private final DAOGenerico<Frete> daoGenerico;

    public FreteRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }


    public Frete buscaPorId(Integer id) {
        return daoGenerico.buscaPorId(Frete.class, id);
    }

    public List<Frete> buscatodos() {
        return daoGenerico.buscaTodos(Frete.class);
    }

    public List<Frete> buscaPorCliente(Integer id_cliente) {
        Query query = manager.createQuery("from Frete where codigo_cliente="+id_cliente);
        return query.getResultList();
    }

    public Frete salvaOuAtualiza(Frete frete) {
        return daoGenerico.salvaOuAtualiza(frete);
    }

    public void remove(Frete frete) {
        daoGenerico.remove(frete);
    }
}
