package br.com.siscaf.dao;

import org.springframework.stereotype.Repository;

import br.com.siscaf.model.Professor;

@Repository
public class ProfessorDAO extends GenericDAO<Professor>{

	public ProfessorDAO() {
		super(Professor.class);
	}

}
