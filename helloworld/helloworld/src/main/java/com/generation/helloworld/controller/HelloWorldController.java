package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping
	public String listaBsms() {
		return "BSM's da Generation Brasil:"
				+"\nComunicação"
				+"\nProatividade"
				+"\nOrientação ao Detalhe"
				+"\nTrabalho em Equipe"
				+"\nOrientação ao Futuro"
				+"\nResponsabilidade Pessoal"
				+"\nMentalidade de Crescimento"
				+"\nPersistência";
	}
	
	@GetMapping
	public String objetivosSemanal() {
		return "Lista de objetivos de aprendizagem desta semana:"
				+"\nIntrodução ao Insomnia"
				+"\nAplicar end points ao projeto integrador"
				+"\nAplicar end points ao projeto Blog Pessoal";
	}
}

