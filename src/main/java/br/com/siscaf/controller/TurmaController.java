package br.com.siscaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.siscaf.facade.AlunoFacade;
import br.com.siscaf.model.Aluno;

import com.google.gson.Gson;

@Controller
public class TurmaController {

	
	@Autowired
	private AlunoFacade facade;
	
	@RequestMapping(value = "/turma/cadastrar", method = RequestMethod.GET)
	public String cadastrarAluno() {
		return "/turma/cadastrar";
		
	}
	
	@RequestMapping(value = "/turma/listarAluno", method = RequestMethod.POST)
	public  String listarAluno() {
		Gson json = new Gson();
		List<Aluno> alunos = facade.listarTodos();
		
		System.out.println(alunos);
		return json.toJson(alunos);
		
	}

	

}
