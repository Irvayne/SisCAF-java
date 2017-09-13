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
		return "redirect:/aluno/listar";
		
	}
	
	@RequestMapping(value = "/aluno/cadastrar", method = RequestMethod.GET)
	public String cadastrarAluno() {

		return "/aluno/cadastrar";
	}

	@RequestMapping(value = "/aluno/listar", method = RequestMethod.GET)
	public ModelAndView listarAluno() {
		List listar = facade.listarTodos();
		ModelAndView modelAndView = new ModelAndView("/aluno/listar");
		modelAndView.addObject("lista", listar);		
		return modelAndView;
	}
	
	@RequestMapping(value = "/aluno/editar", method = RequestMethod.POST)
	public String editarAluno(Aluno aluno) {	
		System.out.println(aluno);
		facade.salvar(aluno);
		return "redirect:/aluno/listar";
	}
	
	@RequestMapping(value = "/aluno/{id}/editar", method = RequestMethod.GET)
	public ModelAndView editarAluno(@PathVariable("id") Long id) {
		Aluno aluno = facade.buscarPorId(id);
		ModelAndView modelAndView = new ModelAndView("/aluno/editar");
		modelAndView.addObject("aluno", aluno);
		System.out.println(aluno);
		return modelAndView;
	}
	
	
	
	
	
	
	
	@RequestMapping(value = "/aluno/deletar", method = RequestMethod.POST)
	public String deletarAluno(Aluno aluno) {	
		System.out.println(aluno);
		facade.deletarPorId(aluno.getId());
		return "redirect:/aluno/listar";
	}
	
	@RequestMapping(value = "/aluno/{id}/deletar", method = RequestMethod.GET)
	public ModelAndView deletarAluno(@PathVariable("id") Long id) {
		String msg = "Não foi possivel deletar aluno";
		if(facade.deletarPorId(id)){
			msg = "Aluno deletado com sucesso";
		}
		ModelAndView modelAndView = new ModelAndView("redirect:/aluno/listar");
		modelAndView.addObject("msg", msg);
		
//		System.out.println(aluno);
		return modelAndView;
	}
}
