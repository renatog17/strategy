package com.renato.matriculaAula.service.strategy;

import com.renato.matriculaAula.domain.Estudante;
import com.renato.matriculaAula.domain.NotaEnem;

public class ValidarNotaEnem implements ValidarDocumento{

	@Override
	public Boolean validarDocumento(Estudante estudante) {
		NotaEnem notaEnem = estudante.getNotaEnem();
		if(notaEnem.getNotaMatematica()>400
				&& notaEnem.getNotaPortugues()>400
				&& notaEnem.getNotaRedacao()>400)
			return true;
		return false;
	}

}
