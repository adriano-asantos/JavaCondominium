package com.javaCondominium.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chamado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChamado;
	private Long idMorador;
	private Date dataAbertura;
	private Date dataEncerramento;
	private String local;
	private String descricao;
	
	public Chamado() {
		
	}

	public Chamado(Long idChamado, Long idMorador, Date dataAbertura, Date dataEncerramento, String local,
			String descricao) {
		super();
		this.idChamado = idChamado;
		this.idMorador = idMorador;
		this.dataAbertura = dataAbertura;
		this.dataEncerramento = dataEncerramento;
		this.local = local;
		this.descricao = descricao;
	}

	public Long getIdChamado() {
		return idChamado;
	}

	public void setIdChamado(Long idChamado) {
		this.idChamado = idChamado;
	}

	public Long getIdMorador() {
		return idMorador;
	}

	public void setIdMorador(Long idMorador) {
		this.idMorador = idMorador;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idChamado == null) ? 0 : idChamado.hashCode());
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
		Chamado other = (Chamado) obj;
		if (idChamado == null) {
			if (other.idChamado != null)
				return false;
		} else if (!idChamado.equals(other.idChamado))
			return false;
		return true;
	}
	
	
}
