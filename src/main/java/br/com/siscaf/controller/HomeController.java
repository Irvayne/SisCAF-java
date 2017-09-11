package br.com.siscaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.siscaf.facade.AlunoFacade;
import br.com.siscaf.model.Aluno;

@Controller
public class HomeController {
	
	@Autowired
	private AlunoFacade facada;
	
	@RequestMapping("/")
	public String index() {
		System.out.println("HomeController.index()");
		return "index";
	}
	
	
	@RequestMapping("/add")
	public String add(Aluno aluno) {
		facada.salvar(aluno);
		return "redirect:listar";
	}
	
	@RequestMapping("/listar")
	public ModelAndView listar() {
		List listar = facada.listarTodos();
		System.out.println("HomeController.listar()");
		ModelAndView modelAndView = new ModelAndView("todos");
		modelAndView.addObject("lista", listar);		
		return modelAndView;
	}
	

}
