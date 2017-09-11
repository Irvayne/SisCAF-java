package br.com.siscaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.siscaf.facade.AlunoFacade;
import br.com.siscaf.model.Aluno;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoFacade facade;
	
	@RequestMapping(value = "/cadastrarAluno", method = RequestMethod.POST)
	public String cadastrarAluno(Aluno aluno) {
		facade.salvar(aluno);
		return "redirect:listarAluno";
		
	}
	
	@RequestMapping(value = "/cadastrarAluno", method = RequestMethod.GET)
	public String cadastrarAluno() {

		return "cadastrarAluno";
	}

	@RequestMapping(value = "/listarAluno", method = RequestMethod.GET)
	public ModelAndView listarAluno() {
		List listar = facade.listarTodos();
		ModelAndView modelAndView = new ModelAndView("listarAluno");
		modelAndView.addObject("lista", listar);		
		return modelAndView;
	}
}
