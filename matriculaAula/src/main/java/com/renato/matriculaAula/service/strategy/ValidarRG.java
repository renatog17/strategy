package com.renato.matriculaAula.service.strategy;

import com.renato.matriculaAula.domain.Estudante;

public class ValidarRG implements ValidarDocumento{

	@Override
	public Boolean validarDocumento(Estudante estudante) {
		return estudante.getRg().getValido();
	}

}
