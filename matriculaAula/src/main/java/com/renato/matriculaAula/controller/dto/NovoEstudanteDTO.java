package com.renato.matriculaAula.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record NovoEstudanteDTO(
		@NotEmpty
		String nome,
		@NotEmpty
		String cpf,
		@NotNull
		HistoricoEscolarDTO historicoEscolar,
		@NotNull
		RGDTO rg,
		@NotNull
		NotaEnemDTO notaEnem
		) {

}
