package servico;

import modelo.Frete;
import repository.FreteRepository;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class CadastraFrete {

    private final EntityManager manager;
    private final FreteRepository repository;

    public CadastraFrete() {
        this.manager = JPAUtil.getEntityManager();
        this.repository = new FreteRepository(manager);
    }

    public Frete salvar(Frete frete) {
        try {
            manager.getTransaction().begin();
            Frete freteSalvo = repository.salvaOuAtualiza(frete);
            manager.getTransaction().commit();

            return freteSalvo;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
