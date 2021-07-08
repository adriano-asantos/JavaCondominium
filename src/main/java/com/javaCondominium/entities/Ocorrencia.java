package com.javaCondominium.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ocorrencia implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOcorrencia;
	private Long idMorador;
	private String descricao;
	private Date dataOcorrencia;
	
	public Ocorrencia() {
		
	}

	public Ocorrencia(Long idOcorrencia, Long idMorador, String descricao, Date dataOcorrencia) {
		super();
		this.idOcorrencia = idOcorrencia;
		this.idMorador = idMorador;
		this.descricao = descricao;
		this.dataOcorrencia = dataOcorrencia;
	}

	public Long getIdOcorrencia() {
		return idOcorrencia;
	}

	public void setIdOcorrencia(Long idOcorrencia) {
		this.idOcorrencia = idOcorrencia;
	}

	public Long getIdMorador() {
		return idMorador;
	}

	public void setIdMorador(Long idMorador) {
		this.idMorador = idMorador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}

	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMorador == null) ? 0 : idMorador.hashCode());
		result = prime * result + ((idOcorrencia == null) ? 0 : idOcorrencia.hashCode());
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
		Ocorrencia other = (Ocorrencia) obj;
		if (idMorador == null) {
			if (other.idMorador != null)
				return false;
		} else if (!idMorador.equals(other.idMorador))
			return false;
		if (idOcorrencia == null) {
			if (other.idOcorrencia != null)
				return false;
		} else if (!idOcorrencia.equals(other.idOcorrencia))
			return false;
		return true;
	}
		
}
