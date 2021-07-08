package com.javaCondominium.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaCondominium.entities.Usuario;

@Controller
public class CadastroController {
	
	@RequestMapping("/cadastro")
	public String cadastroInicial() {
		return "cadastro/cadastro.html";
	}
	
	@RequestMapping(value= "/cadastroAdmin", method=RequestMethod.GET)
	public String formcadastroAdmin() {
		return "cadastro/cadastroAdmin.html";
	}
	
	@RequestMapping(value = "/cadastroAdmin", method = RequestMethod.POST)
	public String formcadastroAdmin(Usuario user) {
		return "redirect: cadastroAdmin.html";
	} 
}
