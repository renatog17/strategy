package com.renato.matriculaAula.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.renato.matriculaAula.domain.Estudante;
import com.renato.matriculaAula.service.strategy.ValidarDocumento;
import com.renato.matriculaAula.service.strategy.ValidarHistoricoEscolar;
import com.renato.matriculaAula.service.strategy.ValidarNotaEnem;
import com.renato.matriculaAula.service.strategy.ValidarRG;

@Service
public class EstudanteService {

	public Boolean validarDocumentos(Estudante estudante) {
		
		ValidarDocumento validarHistoricoEscolar = new ValidarHistoricoEscolar();
		ValidarDocumento validarRG = new ValidarRG();
		ValidarDocumento validarNotaEnem = new ValidarNotaEnem();
		
		List<ValidarDocumento> validacoes = Arrays.asList(validarHistoricoEscolar, validarNotaEnem, validarRG);
		
		for (ValidarDocumento validarDocumento : validacoes) {
			if(!validarDocumento.validarDocumento(estudante)) {
				System.out.println("Erro na validação "+validarDocumento.getClass());
				return false;
			}
		}
		return true;
		
//		//validar historico escolar
//		if(!estudante.getHistoricoEscolar().getEnsinoMedio()) {
//			return false;
//		}
//		//validar nota do enem 
//		if(!(estudante.getNotaEnem().getNotaMatematica()>100
//				&& estudante.getNotaEnem().getNotaPortugues()>100
//				&& estudante.getNotaEnem().getNotaRedacao() >100)) {
//			return false;
//		}
//		//validar RG
//		if(!estudante.getRg().getValido()) {
//			return false;
//		}
//		return true;
	}
}
