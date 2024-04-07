package com.renato.matriculaAula.domain;

import com.renato.matriculaAula.controller.dto.RGDTO;

import jakarta.persistence.Embeddable;

@Embeddable
public class RG {

	private Boolean valido;

	public RG() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RG(Boolean valido) {
		super();
		this.valido = valido;
	}

	public RG(RGDTO rg) {
		this.valido = rg.valido();
	}

	public Boolean getValido() {
		return valido;
	}

	
}
