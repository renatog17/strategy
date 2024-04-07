package com.renato.matriculaAula.service.strategy;

import com.renato.matriculaAula.domain.Estudante;

public interface ValidarDocumento {

	Boolean validarDocumento(Estudante estudante);
}
