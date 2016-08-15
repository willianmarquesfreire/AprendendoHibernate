package com.mycompany.JpaPuro;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * @author wmfsystem
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class PessoaDAO {
    @PersistenceContext(name = "jpaspyke")
    private EntityManager entityManager;
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void editarNome(Long id, String novoNome) {
        Pessoa pessoa = entityManager.getReference(Pessoa.class, id);
        pessoa.setNome(novoNome);
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Pessoa> listarTodos() {
        TypedQuery<Pessoa> query = entityManager.createQuery("select p from Pessoa p", Pessoa.class);
        return query.getResultList();
    }
    
}
