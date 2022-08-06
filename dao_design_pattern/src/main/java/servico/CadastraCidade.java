package servico;

import modelo.Cidade;
import repository.CidadeRepository;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class CadastraCidade {

    private final EntityManager manager;
    private final CidadeRepository repository;

    public CadastraCidade() {
        this.manager = JPAUtil.getEntityManager();
        this.repository = new CidadeRepository(manager);
    }

    public Cidade salvar(Cidade cidade) {

        try {
            manager.getTransaction().begin();
            Cidade cidadeSalva = repository.salvaOuAtualiza(cidade);
            manager.getTransaction().commit();

            return cidadeSalva;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
