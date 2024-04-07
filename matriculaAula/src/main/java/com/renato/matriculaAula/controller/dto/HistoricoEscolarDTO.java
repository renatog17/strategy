package com.renato.matriculaAula.controller.dto;

import jakarta.validation.constraints.NotNull;

public record HistoricoEscolarDTO(
		@NotNull
		Boolean ensinoMedio) {

}
