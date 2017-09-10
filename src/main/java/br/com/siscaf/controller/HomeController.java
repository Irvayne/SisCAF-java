package br.com.siscaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.siscaf.dao.AlunoDAO;
import br.com.siscaf.model.Aluno;

@Controller
public class HomeController {
	
	@Autowired
	private AlunoDAO dao;
	
	@RequestMapping("/")
	public String index() {
		System.out.println("HomeController.index()");
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(Aluno aluno) {
		dao.gravar(aluno);
		return "";
	}
	
//	@RequestMapping("/")
//	public ModelAndView listar() {
//		
//	}
	

}
