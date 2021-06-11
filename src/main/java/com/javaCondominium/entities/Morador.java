package com.javaCondominium.entities;

import java.io.Serializable;

public class Morador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long IdMorador;
	private String nome;
	private String cpf;
	private Long idResidencia;
	
	public Morador() {
		
	}

	public Morador(Long idMorador, String nome, String cpf, Long idResidencia) {
		super();
		IdMorador = idMorador;
		this.nome = nome;
		this.cpf = cpf;
		this.idResidencia = idResidencia;
	}

	public Long getIdMorador() {
		return IdMorador;
	}

	public void setIdMorador(Long idMorador) {
		IdMorador = idMorador;
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

	public Long getIdResidencia() {
		return idResidencia;
	}

	public void setIdResidencia(Long idResidencia) {
		this.idResidencia = idResidencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IdMorador == null) ? 0 : IdMorador.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((idResidencia == null) ? 0 : idResidencia.hashCode());
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
		Morador other = (Morador) obj;
		if (IdMorador == null) {
			if (other.IdMorador != null)
				return false;
		} else if (!IdMorador.equals(other.IdMorador))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (idResidencia == null) {
			if (other.idResidencia != null)
				return false;
		} else if (!idResidencia.equals(other.idResidencia))
			return false;
		return true;
	}
	
}
