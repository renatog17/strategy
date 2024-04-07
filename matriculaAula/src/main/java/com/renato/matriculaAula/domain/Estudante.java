package com.renato.matriculaAula.domain;

import java.util.Objects;

import com.renato.matriculaAula.controller.dto.NovoEstudanteDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;

@Entity
@Table(name = "estudantes")
public class Estudante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cpf;
	private String nome;
	
	private HistoricoEscolar historicoEscolar;
	private NotaEnem notaEnem;
	private RG rg;

	public Estudante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudante(String cpf, String nome, HistoricoEscolar historicoEscolar, NotaEnem notaEnem, RG rg) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.historicoEscolar = historicoEscolar;
		this.notaEnem = notaEnem;
		this.rg = rg;
	}

	public Estudante(@Valid NovoEstudanteDTO novoEstudanteDto) {
		this.cpf = novoEstudanteDto.cpf();
		this.nome = novoEstudanteDto.nome();
		this.historicoEscolar = new HistoricoEscolar(novoEstudanteDto.historicoEscolar());
		this.notaEnem = new NotaEnem(novoEstudanteDto.notaEnem());
		this.rg = new RG(novoEstudanteDto.rg());
		
	}

	public Long getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public HistoricoEscolar getHistoricoEscolar() {
		return historicoEscolar;
	}

	public NotaEnem getNotaEnem() {
		return notaEnem;
	}

	public RG getRg() {
		return rg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		return Objects.equals(id, other.id);
	}

}
