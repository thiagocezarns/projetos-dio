package repository;

import modelo.Cliente;

import javax.persistence.EntityManager;
import java.util.List;

public class ClienteRepository {

    private final EntityManager manager;
    private DAOGenerico<Cliente> daoGenerico;

    public ClienteRepository(EntityManager manager) {
        this.manager = manager;
        daoGenerico = new DAOGenerico<Cliente>(manager);
    }

    public Cliente buscaPorId(Integer id) {
        return daoGenerico.buscaPorId(Cliente.class, id);
    }

    public List<Cliente> buscatodos() {
        return daoGenerico.buscaTodos(Cliente.class);
    }

    public Cliente salvaOuAtualiza(Cliente cliente) {
        return daoGenerico.salvaOuAtualiza(cliente);
    }

    public void remove(Cliente cliente) {
        daoGenerico.remove(cliente );
    }
}
