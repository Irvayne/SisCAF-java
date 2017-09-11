package br.com.siscaf.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.siscaf.dao.AlunoDAO;
import br.com.siscaf.model.Aluno;

@Component
public class AlunoFacade {
	
	@Autowired
	private AlunoDAO dao;
	
	public void salvar(Aluno aluno) {
		dao.salvar(aluno);
	}

	public List<Aluno> listarTodos() {
		return dao.listarTodos();
	}
	
	public Aluno buscarPorId(Aluno aluno) {
		return dao.buscarPorId(aluno.getId());
	}
}
