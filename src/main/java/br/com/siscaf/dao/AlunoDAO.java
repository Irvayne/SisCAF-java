package br.com.siscaf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.siscaf.model.Aluno;

@Repository
@Transactional
public class AlunoDAO {
	
	@PersistenceContext
    private EntityManager manager;

	public void gravar(Aluno aluno) {
		manager.persist(aluno);
	}
	
	public List listar() {
		Query query = manager.createQuery("from Aluno");
		List resultList = query.getResultList();
		
		return resultList;
	}
}
