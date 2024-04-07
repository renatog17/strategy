package com.renato.matriculaAula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renato.matriculaAula.controller.dto.NovoEstudanteDTO;
import com.renato.matriculaAula.domain.Estudante;
import com.renato.matriculaAula.service.EstudanteService;

import jakarta.validation.Valid;

@RequestMapping("/estudante")
@RestController
public class EstudanteController {

	@Autowired
	EstudanteService estudanteService;
	
	@PostMapping
	public ResponseEntity<?> cadastrarEstudante(@Valid @RequestBody NovoEstudanteDTO novoEstudanteDto){
		Estudante estudante = new Estudante(novoEstudanteDto);
		if(estudanteService.validarDocumentos(estudante))
			System.out.println("Estudante está apto");
		else 
			System.out.println("Estudante não pôde ser matriculado");
		
		return null;
	}
}
