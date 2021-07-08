package com.javaCondominium.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Residencia implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResidencia;
	private String conjunto;
	
	public Residencia() {
		
	}

	public Residencia(Long idResidencia, String conjunto) {
		super();
		this.idResidencia = idResidencia;
		this.conjunto = conjunto;
	}

	public Long getIdResidencia() {
		return idResidencia;
	}

	public void setIdResidencia(Long idResidencia) {
		this.idResidencia = idResidencia;
	}

	public String getConjunto() {
		return conjunto;
	}

	public void setConjunto(String conjunto) {
		this.conjunto = conjunto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Residencia other = (Residencia) obj;
		if (idResidencia == null) {
			if (other.idResidencia != null)
				return false;
		} else if (!idResidencia.equals(other.idResidencia))
			return false;
		return true;
	}
	
	
}
