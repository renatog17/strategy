package com.renato.matriculaAula.domain;

import com.renato.matriculaAula.controller.dto.NotaEnemDTO;

import jakarta.persistence.Embeddable;

@Embeddable
public class NotaEnem {

	private Integer notaMatematica;
	private Integer notaRedacao;
	private Integer notaPortugues;

	public NotaEnem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotaEnem(Integer notaMatematica, Integer notaRedacao, Integer notaPortugues) {
		super();
		this.notaMatematica = notaMatematica;
		this.notaRedacao = notaRedacao;
		this.notaPortugues = notaPortugues;
	}

	public NotaEnem(NotaEnemDTO notaEnem) {
		this.notaMatematica = notaEnem.notaMatematica();
		this.notaPortugues = notaEnem.notaPortugues();
		this.notaRedacao = notaEnem.notaRedacao();
	}

	public Integer getNotaMatematica() {
		return notaMatematica;
	}

	public Integer getNotaRedacao() {
		return notaRedacao;
	}

	public Integer getNotaPortugues() {
		return notaPortugues;
	}

}
