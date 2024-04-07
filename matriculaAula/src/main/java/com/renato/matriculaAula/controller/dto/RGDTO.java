package com.renato.matriculaAula.controller.dto;

import jakarta.validation.constraints.NotEmpty;

public record RGDTO(
		@NotEmpty
		Boolean valido) {

}
