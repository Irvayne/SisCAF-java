package br.com.siscaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import br.com.siscaf.facade.AlunoFacade;
import br.com.siscaf.model.Aluno;

@Controller
public class TurmaController {

	
	@Autowired
	private AlunoFacade facade;
	
	@RequestMapping(value = "/turma/cadastrar", method = RequestMethod.GET)
	public ModelAndView cadastrarAluno() {
		List alunos = facade.listarTodos();
		ModelAndView modelAndView = new ModelAndView("/turma/cadastrar");
		modelAndView.addObject("alunos", alunos);
//		System.out.println(aluno);
		return modelAndView;
//		return "/turma/cadastrar";
		
	}

	@ResponseBody
	@RequestMapping(value = "/turma/listarAluno", method = RequestMethod.POST)
	public  String listarAluno() {
		Gson json = new Gson();
		List<Aluno> alunos = facade.listarTodos();
		
		String j = json.toJson(alunos);
		System.out.println(j);
		
		return j;
		
	}
	
	@RequestMapping(value = "/turma/cadastrarAluno", method = RequestMethod.POST)
	public void  cadastrarAluno(List alunos) {
		
		System.out.println(alunos);
	
	
		

		
	}
}
