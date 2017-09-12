package br.com.siscaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.siscaf.facade.AlunoFacade;
import br.com.siscaf.model.Aluno;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoFacade facade;
	
	@RequestMapping(value = "/aluno/cadastrar", method = RequestMethod.POST)
	public String cadastrarAluno(Aluno aluno) {
		facade.salvar(aluno);
		return "redirect:aluno/listar";
		
	}
	
	@RequestMapping(value = "/aluno/cadastrar", method = RequestMethod.GET)
	public String cadastrarAluno() {

		return "aluno/cadastrar";
	}

	@RequestMapping(value = "/aluno/listar", method = RequestMethod.GET)
	public ModelAndView listarAluno() {
		List listar = facade.listarTodos();
		ModelAndView modelAndView = new ModelAndView("aluno/listar");
		modelAndView.addObject("lista", listar);		
		return modelAndView;
	}
	
	@RequestMapping(value = "/aluno/editar", method = RequestMethod.GET)
	public String editarAluno() {		
		return "aluno/editar";
	}
	
	@RequestMapping(value = "/aluno/{id}/editar", method = RequestMethod.GET)
	public ModelAndView editarAluno(@PathVariable("id") Long id) {
		Aluno aluno = facade.buscarPorId(id);
		ModelAndView modelAndView = new ModelAndView("redirect:../../aluno/editar");
		modelAndView.addObject("aluno", aluno);
		System.out.println(aluno);
		return modelAndView;
	}
}
