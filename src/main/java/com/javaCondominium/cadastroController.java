package com.javaCondominium;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cadastroController {
	
	@RequestMapping("/cadastro")
	public String cadastroInicial() {
		return "cadastro/cadastro.html";
	}
}
