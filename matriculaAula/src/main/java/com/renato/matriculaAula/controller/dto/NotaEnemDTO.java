package com.renato.matriculaAula.controller.dto;

import jakarta.validation.constraints.NotNull;

public record NotaEnemDTO(
		@NotNull
		Integer notaMatematica,
		@NotNull
		Integer notaPortugues,
		@NotNull
		Integer notaRedacao) {

}
