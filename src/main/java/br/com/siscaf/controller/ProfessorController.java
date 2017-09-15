package br.com.siscaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "redirect:/professor/listar";
		
	}
	
	@RequestMapping(value = "/professor/cadastrar", method = RequestMethod.GET)
	public String cadastrarProfessor() {

		return "/professor/cadastrar";
	}

	@RequestMapping(value = "/professor/listar", method = RequestMethod.GET)
	public ModelAndView listarProfessor() {
		List listar = facade.listarTodos();
		ModelAndView modelAndView = new ModelAndView("/professor/listar");
		modelAndView.addObject("lista", listar);		
		return modelAndView;
	}
	
	@RequestMapping(value = "/professor/editar", method = RequestMethod.POST)
	public String editarProfessor(Professor professor) {	
		System.out.println(professor);
		facade.salvar(professor);
		return "redirect:/professor/listar";
	}
	
	@RequestMapping(value = "/professor/{id}/editar", method = RequestMethod.GET)
	public ModelAndView editarProfessor(@PathVariable("id") Long id) {
		Professor professor = facade.buscarPorId(id);
		ModelAndView modelAndView = new ModelAndView("/professor/editar");
		modelAndView.addObject("professor", professor);
		System.out.println(professor);
		return modelAndView;
	}
	
	
	
	
	
	
	
	@RequestMapping(value = "/professor/deletar", method = RequestMethod.POST)
	public String deletarProfessor(Professor professor) {	
		System.out.println(professor);
		facade.deletarPorId(professor.getId());
		return "redirect:/professor/listar";
	}
	
	@RequestMapping(value = "/professor/{id}/deletar", method = RequestMethod.GET)
	public ModelAndView deletarProfessor(@PathVariable("id") Long id) {
		String msg = "Não foi possivel deletar professor";
		if(facade.deletarPorId(id)){
			msg = "Professor deletado com sucesso";
		}
		ModelAndView modelAndView = new ModelAndView("redirect:/professor/listar");
		modelAndView.addObject("msg", msg);
		
//		System.out.println(professor);
		return modelAndView;
	}
}
