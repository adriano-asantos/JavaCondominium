package com.javaCondominium.entities;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;


public class Visitante implements Serializable {
	private static final long serialVersionUID = 1L;
		
	private Long idVisitante;
	private String nome;
	private String cpf;
	private Date dataInicio;
	private Date dataFim;
	
	public Visitante() {
		
	}

	public Visitante(Long idVisitante, String nome, String cpf, Date dataInicio, Date dataFim) {
		super();
		this.idVisitante = idVisitante;
		this.nome = nome;
		this.cpf = cpf;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Long getIdVisitante() {
		return idVisitante;
	}

	public void setIdVisitante(Long idVisitante) {
		this.idVisitante = idVisitante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((idVisitante == null) ? 0 : idVisitante.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visitante other = (Visitante) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (idVisitante == null) {
			if (other.idVisitante != null)
				return false;
		} else if (!idVisitante.equals(other.idVisitante))
			return false;
		return true;
	}
		
}
