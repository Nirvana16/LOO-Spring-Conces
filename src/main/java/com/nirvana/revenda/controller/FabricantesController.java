package com.nirvana.revenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nirvana.revenda.model.Fabricante;
import com.nirvana.revenda.model.Veiculo;
import com.nirvana.revenda.repository.Fabricantes;

@RequestMapping("/fabricantes")
@Controller
public class FabricantesController {
	
	@Autowired
	private Fabricantes montadoras;	
	
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("CadastroFabricante");		
		mv.addObject("fabricantes", montadoras.findAll());
		mv.addObject(new Fabricante());

		
		return mv;		
	}
	
	@PostMapping
	public String salvar(Fabricante montadora) {
		this.montadoras.save(montadora);
		
		return "redirect:/fabricantes";
	}
	

}
