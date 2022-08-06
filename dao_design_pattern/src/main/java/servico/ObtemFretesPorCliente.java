package servico;

import modelo.Cliente;
import modelo.Frete;
import repository.FreteRepository;
import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class ObtemFretesPorCliente {

    private final EntityManager manager;
    private final FreteRepository repository;

    public ObtemFretesPorCliente() {
        this. manager = JPAUtil.getEntityManager();
        this.repository = new FreteRepository(manager);
    }

    public List<Frete> buscarFretes(Integer id_cliente) {
        try {

            return repository.buscaPorCliente(id_cliente);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
