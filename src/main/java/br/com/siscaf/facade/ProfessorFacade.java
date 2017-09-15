package br.com.siscaf.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.siscaf.dao.ProfessorDAO;
import br.com.siscaf.model.Professor;

@Component
public class ProfessorFacade {
	
	@Autowired
	private ProfessorDAO dao;
	
	public void salvar(Professor professor) {
		dao.salvar(professor);
	}

	public List<Professor> listarTodos() {
		return dao.listarTodos();
	}
	
	public Professor buscarPorId(Professor professor) {
		return dao.buscarPorId(professor.getId());
	}
	
	public Professor buscarPorId(Long id) {
		return dao.buscarPorId(id);
	}
	public boolean deletarPorId(Long id) {
		return dao.delete(id);
	}
}
