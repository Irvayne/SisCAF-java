package br.com.siscaf.info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.siscaf.controller.HomeController;
import br.com.siscaf.dao.AlunoDAO;


@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, AlunoDAO.class})
public class AppWebConfiguration {
	
	 @Bean
	 public InternalResourceViewResolver internalResourceViewResolve() {
	        InternalResourceViewResolver resolve = new InternalResourceViewResolver();
	        resolve.setPrefix("/WEB-INF/views/");
	        resolve.setSuffix(".jsp");
	        return resolve;
	    }
	 
	 

}