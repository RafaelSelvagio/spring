package br.com.exercicio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/home")
	public String home(@RequestParam String nome, @RequestParam int idade) {
		return "Olá, " + nome + ". Você tem " + idade + " anos.";
	}
}
