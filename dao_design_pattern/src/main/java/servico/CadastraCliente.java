package servico;

import modelo.Cliente;
import repository.ClienteRepository;
import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.Objects;

public class CadastraCliente {

    private final EntityManager manager;
    private final ClienteRepository repository;

    public CadastraCliente() {
        this.manager = JPAUtil.getEntityManager();
        this.repository = new ClienteRepository(manager);
    }

    public Cliente salvar(Cliente cliente) {

        try {

            manager.getTransaction().begin();
            Cliente clienteSalvo = repository.salvaOuAtualiza(cliente);
            manager.getTransaction().commit();

            return clienteSalvo;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
