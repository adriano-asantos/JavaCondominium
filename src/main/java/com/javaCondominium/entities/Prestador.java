package com.javaCondominium.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prestador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestador;
	private String nome;
	private String cpf;
	private String Profissao;
	
	public Prestador() {
		
	}

	public Prestador(Long idPrestador, String nome, String cpf, String profissao) {
		super();
		this.idPrestador = idPrestador;
		this.nome = nome;
		this.cpf = cpf;
		Profissao = profissao;
	}

	public Long getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(Long idPrestador) {
		this.idPrestador = idPrestador;
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

	public String getProfissao() {
		return Profissao;
	}

	public void setProfissao(String profissao) {
		Profissao = profissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((idPrestador == null) ? 0 : idPrestador.hashCode());
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
		Prestador other = (Prestador) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (idPrestador == null) {
			if (other.idPrestador != null)
				return false;
		} else if (!idPrestador.equals(other.idPrestador))
			return false;
		return true;
	}
		
}
