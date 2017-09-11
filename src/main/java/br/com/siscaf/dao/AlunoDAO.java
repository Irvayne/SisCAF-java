package br.com.siscaf.dao;

import org.springframework.stereotype.Repository;

import br.com.siscaf.model.Aluno;

@Repository
public class AlunoDAO extends GenericDAO<Aluno>{

	public AlunoDAO() {
		super(Aluno.class);
	}

}
