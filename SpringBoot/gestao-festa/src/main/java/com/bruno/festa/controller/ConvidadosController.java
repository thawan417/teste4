package com.bruno.festa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bruno.festa.model.Convidado;
import com.bruno.festa.model.Convidados;

@Controller
public class ConvidadosController {

	@Autowired
	private Convidados convidados;
	
	@GetMapping("/convidados")
	public ModelAndView listar(){
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		
//		Convidado con1 = new Convidado();
//		con1.setId(new Long(1));
//		con1.setNome("Bruno");
//		con1.setQtdAcompanhantes(3);
//		
//		Convidado con2 = new Convidado();
//		con2.setId(new Long(2));
//		con2.setNome("Bruno2");
//		con2.setQtdAcompanhantes(3);
//		
//		ArrayList<Convidado> lista = new ArrayList<Convidado>();
//		lista.add(con1);
//		lista.add(con2);
		
		modelAndView.addObject("convidados", convidados.findAll());
		return modelAndView;
	}
}
