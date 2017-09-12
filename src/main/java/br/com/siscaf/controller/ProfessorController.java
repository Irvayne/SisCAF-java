package br.com.siscaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.siscaf.facade.ProfessorFacade;
import br.com.siscaf.model.Professor;

@Controller
public class ProfessorController {
	
	@Autowired
	private ProfessorFacade facade;
	
	@RequestMapping(value = "/professor/cadastrar", method = RequestMethod.POST)
	public String cadastrarProfessor(Professor professor) {
		facade.salvar(professor);
		return "redirect:professor/listar";
		
	}
	
	@RequestMapping(value = "/professor/cadastrar", method = RequestMethod.GET)
	public String cadastrarProfessor() {

		return "professor/cadastrar";
	}

	@RequestMapping(value = "/professor/listar", method = RequestMethod.GET)
	public ModelAndView listarProfessor() {
		List listar = facade.listarTodos();
		ModelAndView modelAndView = new ModelAndView("professor/listar");
		modelAndView.addObject("lista", listar);		
		return modelAndView;
	}
}
