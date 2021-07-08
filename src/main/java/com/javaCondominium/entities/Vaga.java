package com.javaCondominium.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaga implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVaga;
	private Long idResidencia;
	private String status;
	private String locador;
	
	public Vaga() {
		
	}

	public Vaga(Long idVaga, Long idResidencia, String status) {
		super();
		this.idVaga = idVaga;
		this.idResidencia = idResidencia;
		this.status = status;
	}

	public Long getIdVaga() {
		return idVaga;
	}

	public void setIdVaga(Long idVaga) {
		this.idVaga = idVaga;
	}

	public Long getIdResidencia() {
		return idResidencia;
	}

	public void setIdResidencia(Long idResidencia) {
		this.idResidencia = idResidencia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getLocador() {
		return locador;
	}

	public void setLocador(String locador) {
		this.locador = locador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idResidencia == null) ? 0 : idResidencia.hashCode());
		result = prime * result + ((idVaga == null) ? 0 : idVaga.hashCode());
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
		Vaga other = (Vaga) obj;
		if (idResidencia == null) {
			if (other.idResidencia != null)
				return false;
		} else if (!idResidencia.equals(other.idResidencia))
			return false;
		if (idVaga == null) {
			if (other.idVaga != null)
				return false;
		} else if (!idVaga.equals(other.idVaga))
			return false;
		return true;
	}
	
	
}
