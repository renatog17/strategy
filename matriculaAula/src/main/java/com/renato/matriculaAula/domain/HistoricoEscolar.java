package com.renato.matriculaAula.domain;

import com.renato.matriculaAula.controller.dto.HistoricoEscolarDTO;

import jakarta.persistence.Embeddable;

@Embeddable
public class HistoricoEscolar {

	private Boolean ensinoMedio;

	public HistoricoEscolar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistoricoEscolar(Boolean ensinoMedio) {
		super();
		this.ensinoMedio = ensinoMedio;
	}

	public HistoricoEscolar(HistoricoEscolarDTO historicoEscolar) {
		this.ensinoMedio = historicoEscolar.ensinoMedio();
	}

	public Boolean getEnsinoMedio() {
		return ensinoMedio;
	}

	
}
