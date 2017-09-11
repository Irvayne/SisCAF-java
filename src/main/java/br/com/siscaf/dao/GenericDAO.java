package br.com.siscaf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GenericDAO<T> {

	@PersistenceContext
	protected EntityManager em;
	private Class<T> classe; 
	
	
	public GenericDAO(Class<T> classe) {
		this.classe = classe;
	}
	
	public EntityManager getEntityManager() {
		return this.em;
	}

	public T salvar(T object) {
		return em.merge(object);
	}
	
	public T buscarPorId(int id) {
		return em.find(classe, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listarTodos() {
		Query query = em.createQuery("from " + classe.getSimpleName());
		List<T> entities = query.getResultList();
		return entities;
	}
	
	public final void deletar(T object) {
		em.remove(object);
	}
	
	public boolean delete(Long entityId) {
		Query query = em.createQuery("Delete from " + classe.getSimpleName() + " en where en.id = :id");
		query.setParameter("id", entityId);

		boolean deleted = false;
		deleted = (query.executeUpdate() > 0);

		return deleted;
	}

}
