package com.javaCondominium.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AreaComum implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAreaComum;
	private String nome;
	private int ocupacao;
	private int limite;
	
	public AreaComum() {
		
	}

	public AreaComum(Long idAreaComum, String nome, int lotacao) {
		super();
		this.idAreaComum = idAreaComum;
		this.nome = nome;
		this.ocupacao = lotacao;
	}

	public Long getIdAreaComum() {
		return idAreaComum;
	}

	public void setIdAreaComum(Long idAreaComum) {
		this.idAreaComum = idAreaComum;
	}
	
	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAreaComum == null) ? 0 : idAreaComum.hashCode());
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
		AreaComum other = (AreaComum) obj;
		if (idAreaComum == null) {
			if (other.idAreaComum != null)
				return false;
		} else if (!idAreaComum.equals(other.idAreaComum))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLotacao() {
		return ocupacao;
	}

	public void setLotacao(int lotacao) {
		this.ocupacao = lotacao;
	}
	
	
}
