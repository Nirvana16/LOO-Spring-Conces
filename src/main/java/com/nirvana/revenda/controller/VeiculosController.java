package com.nirvana.revenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.nirvana.revenda.model.Veiculo;
import com.nirvana.revenda.repository.Veiculos;

@RequestMapping("/veiculos")
@Controller
public class VeiculosController {
	
	@Autowired
	private Veiculos veiculos;	
	
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaVeiculos");		
		mv.addObject("todosVeiculos", veiculos.findAll());
		mv.addObject(new Veiculo());
		
		

		
		return mv;		
	}
	
	
	@PostMapping
	public ModelAndView salvar(Veiculo veiculo) {
		this.veiculos.save(veiculo);
		ModelAndView mv = new ModelAndView("ListaVeiculos");
		mv.addObject("mensagem", "Veículo Inserido com Sucesso!!!");
		mv.addObject("todosVeiculos", veiculos.findAll()); //Para listar os veículos após a inclusão de um novo.

		
		return mv;
		
	}
}
