package com.javaCondominium.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaCondominium.entities.Visitante;

public interface VisitanteRepository extends JpaRepository<Visitante, Long>{
	
}
